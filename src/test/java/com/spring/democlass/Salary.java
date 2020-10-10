package com.spring.democlass;

import org.springframework.stereotype.Component;

@Component
public class Salary {

	private int amount;
	
	public Salary(){
		this.amount = 1000;
	}
	
	public int getSalary(){
		return this.amount;
	}
}
