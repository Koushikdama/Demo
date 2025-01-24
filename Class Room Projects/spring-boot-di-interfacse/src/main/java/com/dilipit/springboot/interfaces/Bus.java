package com.dilipit.springboot.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
	
	public Bus() {
		System.out.println("New Bus Created.......");
	}

	@Override
	public String vehicleType() {
		return "This is Bus.";
	}

}
