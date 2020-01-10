package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor
public class Reservation {
	@Id @GeneratedValue
	private Long Id;
	private Date date_debut;
	private Date date_fin;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Client client;
	
	@ManyToOne
	private Chambre chambre;
}
