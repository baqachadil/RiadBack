package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Client;
import com.example.demo.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {
	public List<Facture> findByClient(Client clt);
}
