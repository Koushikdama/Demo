package com.dilip.it.beans.wiring.constructor;

public class Hospital {

	private String name;
	private Patient patient1;
	
	
	// constructor argument 
	public Hospital(Patient patient1) {
		
		System.out.println("Patient injected via Constructor : "+patient1);
		this.patient1 = patient1; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Patient getPatient1() {
		return patient1;
	}

	public void setPatient1(Patient patient1) {
		this.patient1 = patient1;
	}

	

	
}
