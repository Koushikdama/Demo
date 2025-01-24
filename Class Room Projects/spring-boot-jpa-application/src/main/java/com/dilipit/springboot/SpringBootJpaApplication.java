package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.operations.DataBaseOperationsTwo;
import com.dilipit.springboot.operations.DatabaseOperations;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container =  SpringApplication.run(SpringBootJpaApplication.class, args);
	
		 /*DatabaseOperations dbOperations =  container.getBean(DatabaseOperations.class);
		 dbOperations.addProductInformation();
		 dbOperations.addUSerInformation();
		 dbOperations.deleteProduct();*/
		 
		 DataBaseOperationsTwo dbOperationsTwo = container.getBean(DataBaseOperationsTwo.class);
		 //dbOperationsTwo.addMoreProducts();
		 dbOperationsTwo.loadAllProducts();
	
	}

}
