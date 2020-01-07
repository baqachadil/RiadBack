package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Chambre {
	@Id @GeneratedValue
	private Long Id;
	private double superfice;
	private double prix;
	
	@OneToMany(mappedBy = "chambre")
	private List<Reservation> reservations = new ArrayList<Reservation>();
}
