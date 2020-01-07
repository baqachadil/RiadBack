package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor
public class Role {
	@Id @GeneratedValue
	private Long Id;
	String name;		
}
