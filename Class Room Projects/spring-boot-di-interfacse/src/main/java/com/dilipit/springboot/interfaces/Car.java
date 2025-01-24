package com.dilipit.springboot.interfaces;

import org.springframework.stereotype.Component;


//@Primary
@Component
public class Car implements Vehicle{
	
	public Car() {
		System.out.println("New Car Created.......");
	}

	@Override
	public String vehicleType() {
		return "This is Car.";
	}

}
