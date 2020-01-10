package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.services.ClientService;

@RestController
@CrossOrigin
public class ClientRest {
	
	@Autowired
	ClientService clientService;
	
	@PostMapping("/addClient")
	public Client addClient(@RequestBody Client client) {
		Client clt = clientService.findByCin(client.getCin());
		if(clt != null) throw new RuntimeException("Client existe deja !!");
		else {
			return clientService.addClient(client);
		}
	}
	
	@PostMapping("/modifieClient")
	public Client modifieClient(@RequestBody Client client) {
		return clientService.addClient(client);
	}
	
	@GetMapping("/listClients")
	public List<Client> listClients(){
		return clientService.getAllClients();
	}
	
	@GetMapping("/infosClient/{client_cin}")
	public Client getClientInfos(@PathVariable String client_cin) {
		return clientService.findByCin(client_cin);
	}
	
	@DeleteMapping("deleteClient/{client_cin}")
	public void delete(@PathVariable String client_cin) {
		Client clt  = clientService.findByCin(client_cin);
		clientService.deleteClient(clt);
	}
}
