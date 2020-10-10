package com.spring.democlass;

import org.springframework.stereotype.Component;

@Component
public class Users {
	
	private Salary salary;
	private Address address;
	
	public Users(Address address, Salary salary) {
		this.address = address;
		this.salary = salary;
	}
	
	public void printUserDetails(){
		System.out.println("Salary : "+salary.getSalary());
		System.out.println("Address : "+address.getAddress());
	}

}
