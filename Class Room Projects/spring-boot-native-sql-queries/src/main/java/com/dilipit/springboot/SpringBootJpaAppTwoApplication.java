package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.operations.EmployeeOperatins;

@SpringBootApplication
public class SpringBootJpaAppTwoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaAppTwoApplication.class, args);

		EmployeeOperatins empOperations = container.getBean(EmployeeOperatins.class);
		 empOperations.loadEmployees();
		// empOperations.loadEmployeesByCity();
		// empOperations.loadEmployeesByCountryNAdGender();

		// Scanner 
		//empOperations.loadEmployeesBycityANdAge("Hyderabad", 30);
		
		//empOperations.addNewEmployee();
		
		//empOperations.deleteEmployee();

	}

}
