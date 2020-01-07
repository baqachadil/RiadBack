package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Long>{
	public Utilisateur findByUsername(String username);
}
