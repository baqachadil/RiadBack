package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Role;
import com.example.demo.entities.Utilisateur;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;



@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Utilisateur AddUSer(Utilisateur user) {		
		//We crypt the user's password
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Utilisateur test = userRepository.save(user);
		addRoleToUser(test.getUsername(), "USER");
		System.out.println(test);
		return test;
	}

	@Override
	public Utilisateur findUserByUserNamme(String username) {		
		return userRepository.findByUsername(username);
	}

	@Override
	public Role AddRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		Role role = roleRepository.findByName(rolename);		
		Utilisateur user = userRepository.findByUsername(username);
		user.getRoles().add(role);
	}



}
