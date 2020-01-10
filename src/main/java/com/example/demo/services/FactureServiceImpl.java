package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Facture;
import com.example.demo.entities.Utilisateur;
import com.example.demo.repositories.FactureRepository;

@Service
@Transactional
public class FactureServiceImpl implements FactureService{
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private ClientService clientservice;
	
	@Autowired
	private FactureRepository factureRepository;

	@Override
	public void reglement(String cin, double montant) {
		AbstractAuthenticationToken auth = (AbstractAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();		
		String username=auth.getName().toString();
		Utilisateur user = userservice.findUserByUserNamme(username);
		Client client =  clientservice.findByCin(cin);
		Facture facture =  new Facture(null, montant, user, client);
		factureRepository.save(facture);
	}

	@Override
	public List<Facture> getClientFactures(String cin) {
		Client client =  clientservice.findByCin(cin);
		return factureRepository.findByClient(client);
	}
	
}
