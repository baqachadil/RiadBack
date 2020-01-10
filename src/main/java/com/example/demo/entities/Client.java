package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor
public class Client{
	@Id @GeneratedValue
	private Long Id;
	private String Nom;
	private String Prenom;
	private String Tel;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String cin;
	private double reduction;
	
	@OneToMany(mappedBy = "client")
	private List<Facture> factures = new ArrayList<Facture>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Reservation> reservations = new ArrayList<Reservation>();
}
