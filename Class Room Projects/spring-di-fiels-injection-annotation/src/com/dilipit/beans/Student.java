package com.dilipit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	
	// Field Injection 
	
	@Autowired
	public Address address;  // injecting Address object
	
	// NO setter/ No Constructor with Arg of :  address 
	
	public Student() {
		System.out.println("Student is created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
