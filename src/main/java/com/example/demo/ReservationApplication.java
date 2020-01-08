package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.entities.Role;
import com.example.demo.entities.Utilisateur;
import com.example.demo.services.UserService;

@SpringBootApplication
public class ReservationApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;				
	
	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}
	
	@Bean 
	public BCryptPasswordEncoder  getBCPE() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
		/*userService.AddRole(new Role(null,"ADMIN"));
		userService.AddRole(new Role(null,"USER"));
				
		userService.AddUSer(new Utilisateur(null,"BAQACH","Adil","N 09 RUE ESSAADIYNE AGADIR","0673937060","baqachadil@gmail.com","Admin1234",null,null));
		userService.AddUSer(new Utilisateur(null,"Mhamdi","Khalil","N 13 RUE Alfarah Marrakch","0673937060","khalil@gmail.com","khalil1234",null,null));				
		
		userService.addRoleToUser("baqachadil@gmail.com", "ADMIN");
		userService.addRoleToUser("baqachadil@gmail.com", "USER");
		
		userService.addRoleToUser("khalil@gmail.com", "USER");*/
		
	}

}
