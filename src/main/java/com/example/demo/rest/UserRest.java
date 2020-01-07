package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Utilisateur;
import com.example.demo.services.UserService;

@RestController
@CrossOrigin
public class UserRest {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public Utilisateur addUser(@RequestBody Utilisateur user) {
		Utilisateur test = userService.findUserByUserNamme(user.getUsername());
		if(test!=null) throw new RuntimeException("User already exists !!");
		else {
			Utilisateur response = userService.AddUSer(user);
			userService.addRoleToUser(user.getUsername(), "USER");
			return response;
		}
	}
}
