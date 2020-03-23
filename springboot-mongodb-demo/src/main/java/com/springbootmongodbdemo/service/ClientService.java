package com.springbootmongodbdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmongodbdemo.models.Client;
import com.springbootmongodbdemo.repository.ClientRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/client")
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping
	public List<Client> getAll(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Client getClient(@PathVariable("id")String id) {
		return this.clientRepository.findById(id).get();
	}
	
	@PostMapping("/add")
	public void insertClient(@RequestBody Client client) {
		clientRepository.save(client);
	}
	
	@PutMapping("/update/{id}")
	public Client updateClient(@PathVariable("id") String id, @RequestBody Client client) {
		Client c = clientRepository.findById(id).get();
		client.setId_client(c.getId_client());
		return clientRepository.save(client);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteClient(@PathVariable("id") String id) {
		clientRepository.deleteById(id);
	}
	
}
