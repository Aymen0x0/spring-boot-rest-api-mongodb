package com.springbootmongodbdemo.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document("clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {
	@Id
	private String id_client;
	private String fullName;
	private Date dateOfBirth;
	private Address address;
	
	public Client(String fullName, Date dateOfBirth, Address address) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
}
