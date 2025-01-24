package com.dilipit.springboot.db.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseOperations {

	// Req : adding product details to product tables
	// INSERT INTO PRODUCT values(101,'iphone16pro',120000);
	@Value("${spring.datasource.url}")
	public String url; 
	
	//DI 
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	public void addProduct() {
		
		System.out.println("DB URL : "+url);
		// DML 
		jdbcTemplate.update("INSERT INTO PRODUCT values(400,'samsung',80000)");

	}
	
	//delete product
	
	public void deleteProduct() {
		// DML 
	int noOFRecDeleted = 	jdbcTemplate.update("DELETE FROM PRODUCT  WHERE pid=100");
	System.out.println(" Total Records Deleted : "+noOFRecDeleted);

	}
}
