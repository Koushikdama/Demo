package com.dilipit.springboot.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public Bike() {
		System.out.println("New Bike Created.......");
	}

	@Override
	public String vehicleType() {
		return "This is Bike.";
	}

}
