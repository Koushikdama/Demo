package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaJpqlQueriesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaJpqlQueriesApplication.class,
				args);

		EmployeeOperations empOps = container.getBean(EmployeeOperations.class);
		//empOps.allEmployees();
		empOps.allEmployeesByCity("Pune");
	}

}
