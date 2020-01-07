package com.example.demo.services;

import com.example.demo.entities.Role;
import com.example.demo.entities.Utilisateur;

public interface UserService {
	public Utilisateur AddUSer(Utilisateur user);
	public Utilisateur findUserByUserNamme(String username);
	public Role AddRole(Role role);
	public void addRoleToUser(String username, String rolename);
}
