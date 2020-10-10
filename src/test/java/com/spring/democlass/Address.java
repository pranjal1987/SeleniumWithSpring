package com.spring.democlass;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String address;
	
	public Address(){
		this.address = "123 India";
	}
	
	public String getAddress(){
		return this.address;
	}
}
