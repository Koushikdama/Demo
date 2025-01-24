package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.service.OrderManagementService;

@SpringBootApplication
public class SpringBootJpaGeneratedValuesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBootJpaGeneratedValuesApplication.class, args);
		OrderManagementService orderMgmt = 	container.getBean(OrderManagementService.class);
		for(int i=0 ; i<=10 ; i++) {
			orderMgmt.createAnOrder();
		}
		
	}

}
