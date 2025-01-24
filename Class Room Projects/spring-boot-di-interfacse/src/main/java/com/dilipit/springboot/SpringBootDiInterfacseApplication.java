package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.dilipit.springboot.interfaces.Car;
import com.dilipit.springboot.interfaces.Garrage;
import com.dilipit.springboot.interfaces.Vehicle;

@SpringBootApplication
public class SpringBootDiInterfacseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootDiInterfacseApplication.class, args);

		Garrage garrage = (Garrage) container.getBean("garrage");

		System.out.println(garrage);

		Vehicle vehicle = garrage.getVehicle();
		
		System.out.println(vehicle.getClass());
		
		System.out.println(vehicle.vehicleType());

	}
	
	@Primary
	@Bean
	public Car car2() {
		return new Car();
	} 

}
