package com.example.demo.services;

import java.util.List;
import com.example.demo.entities.Facture;

public interface FactureService {
	public void reglement(String cin, double montant);
	public List<Facture> getClientFactures(String cin);
}
