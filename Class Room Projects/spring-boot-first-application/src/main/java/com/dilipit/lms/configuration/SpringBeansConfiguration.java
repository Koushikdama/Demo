package com.dilipit.lms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dilipit.lms.Student;
import com.dilipit.lms.app.Product;

@Configuration
public class SpringBeansConfiguration {

	@Bean
	public Product product1() {
		System.out.println("Product is created via Bean method ");
		return new Product();
	}
	
	@Bean
	public Student student2() {
		System.out.println("creating student2 via bean method");
		
		return new Student();
	}
	
}
