package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.service.EmpOperations;

@SpringBootApplication
public class SpringBootJpaOneOneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaOneOneMappingApplication.class,
				args);
		EmpOperations ops = container.getBean(EmpOperations.class);
		
		//ops.addEmployee();
		//ops.deleteEMployee();
		
		ops.getEmployeInformation();
	}

}
