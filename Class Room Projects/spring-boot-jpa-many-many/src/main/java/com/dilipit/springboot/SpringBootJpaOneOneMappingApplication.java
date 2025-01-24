package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.service.EmployeManagement;

@SpringBootApplication
public class SpringBootJpaOneOneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaOneOneMappingApplication.class,
				args);

		EmployeManagement empMgmt = container.getBean(EmployeManagement.class);
		empMgmt.addEMployee();

	}

}
