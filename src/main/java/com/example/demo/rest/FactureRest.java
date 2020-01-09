package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Facture;
import com.example.demo.services.FactureService;

@RestController
@CrossOrigin
public class FactureRest {
	@Autowired
	private FactureService factureService;
	
	@PostMapping("/regler")
	public void reglement(@RequestParam(name = "client_cin")String cin, @RequestParam(name = "montant")double montant) {
		factureService.reglement(cin, montant);
	}
	
	@GetMapping("/factures/{cin}")
	public List<Facture> getClientFactures(@PathVariable String cin){
		return factureService.getClientFactures(cin);
	}
}
