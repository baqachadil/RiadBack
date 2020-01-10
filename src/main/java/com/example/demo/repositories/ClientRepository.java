package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Client;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface ClientRepository extends JpaRepository<Client, Long> {
	public Client findByCin(String cin);
}
