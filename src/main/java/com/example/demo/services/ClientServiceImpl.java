package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.repositories.ClientRepository;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client addClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client findByCin(String cin) {
		return clientRepository.findByCin(cin);
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

}
