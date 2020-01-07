package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Client;

public interface ClientService {
	public Client addClient(Client client);
	public Client findByCin(String cin);
	public List<Client> getAllClients();
}
