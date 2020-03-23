package com.springbootmongodbdemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootmongodbdemo.models.Address;
import com.springbootmongodbdemo.models.Client;
import com.springbootmongodbdemo.repository.ClientRepository;

@SpringBootApplication
public class SpringbootMongodbDemoApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbDemoApplication.class, args);
	}

	//The run method is automatically invoked when Spring Boot starts
	@Override
	public void run(String... args) throws Exception {
		
		Client client1 = new Client("Joaquin Phoenix",
						 new Date(),
						 new Address("Victor Plains Suite 847", "Chicago", "WI", "59590-4157"));
		Client client2 = new Client("Mandy Moore",
						 new Date(),
						 new Address("Hoeger Mall Apt. 692", "Los Angeles", "SE", "53919-4257"));
		Client client3 = new Client("Aymen Mankari",
						 new Date(), 
						 new Address("Skiles Walks Suite 351", "California", "RO", "33263-6543"));
		
		//Deleting existing records
		clientRepository.deleteAll();
		
		//Adding records to DB
		clientRepository.save(client1);
		clientRepository.save(client2);
		clientRepository.save(client3);
		
		//Showing records from the DB
		clientRepository.findAll().forEach(client -> System.out.println(client));
	}

}
