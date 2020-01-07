package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor
public class Utilisateur{
	@Id @GeneratedValue
	private Long Id;
	private String Nom;
	private String Prenom;
	private String Adresse;
	private String Tel;
	@Column(unique = true)
	private String username;
	private String password;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Facture> factures = new ArrayList<Facture>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles = new ArrayList<Role>();
}
