package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor
public class Facture {
	@Id @GeneratedValue
	private Long Id;
	private double montant;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	@ManyToOne
	@JsonIgnore
	private Client client;
}
