package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.service.UserOperations;

@SpringBootApplication
public class SpringBootJpaOneOneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaOneOneMappingApplication.class,
				args);

		UserOperations userOps = container.getBean(UserOperations.class);
		//userOps.addUSer();
		//userOps.getUserData();
		
		userOps.deleteUserData();

	}

}
