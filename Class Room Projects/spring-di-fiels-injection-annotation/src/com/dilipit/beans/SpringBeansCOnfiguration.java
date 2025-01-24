package com.dilipit.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.*")
@Configuration
public class SpringBeansCOnfiguration {

	@Bean
	public Address addressOne() {
		Address a = new Address();
		a.setCity("Hyderbad");
		a.setPincode(500072);
		return a;

	}

}
