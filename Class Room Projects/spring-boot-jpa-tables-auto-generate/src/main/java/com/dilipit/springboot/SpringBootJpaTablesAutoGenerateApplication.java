package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.operations.OrderOperations;

@SpringBootApplication
public class SpringBootJpaTablesAutoGenerateApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaTablesAutoGenerateApplication.class, args);
		 OrderOperations orderOps =  container.getBean(OrderOperations.class);
		 orderOps.loadAllOrders();
	
	}

}
