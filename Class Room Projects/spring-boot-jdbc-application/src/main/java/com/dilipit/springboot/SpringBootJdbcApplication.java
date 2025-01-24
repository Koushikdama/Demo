package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.db.operations.DatabaseOperations;
import com.dilipit.springboot.db.operations.ProductsManagement;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJdbcApplication.class, args);

		// DatabaseOperations dbOperations = (DatabaseOperations)
		// container.getBean("databaseOperations");

		/*DatabaseOperations dbOperations = container.getBean(DatabaseOperations.class);
		
		dbOperations.addProduct();
		dbOperations.deleteProduct();*/
		
		ProductsManagement products = container.getBean(ProductsManagement.class);
		//products.saveProducts();
		products.loaddAllProducts();
		
		
	}

}
