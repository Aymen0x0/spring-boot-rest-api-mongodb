package com.springbootmongodbdemo.models;


import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

	@Id
	private String id_address;
	private String street;
	private String city;
	private String state;
	private String postalCode;
	
	public Address(String street, String city , String state, String postalCode ) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
}
