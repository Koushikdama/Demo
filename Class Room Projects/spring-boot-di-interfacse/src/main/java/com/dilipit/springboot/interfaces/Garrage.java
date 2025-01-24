package com.dilipit.springboot.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garrage {

	
	// DI : via Interface :  Inject Impl class Objects 
	
	// 
	//@Qualifier("car2")
	
	
	//@Qualifier("bike")
	@Autowired
	private Vehicle vehicle;

	public Garrage() {
		System.out.println("Garrage is Created and ready to inject vehicles..");
	}

	public Garrage(Vehicle vehicle) {
		System.out.println("Garrage is Created and injected with vehicle : " + vehicle.getClass());
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
