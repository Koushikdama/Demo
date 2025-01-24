package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.dilipit.springboot.beans.Order;
import com.dilipit.springboot.beans.Product;

@SpringBootApplication
public class SpringBeanScopesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBeanScopesApplication.class, args);

		// 1st time 
		Product p1 = (Product) container.getBean("product");
		System.out.println(p1);
		
		// 2nd 
		Product p2 = (Product) container.getBean("product");
		System.out.println(p2);
		
		// 3rd 
		Product p3 = (Product) container.getBean("product");
		System.out.println(p3);
		
		//1st time Order Object 
		Order order1 = (Order) container.getBean("order");
		System.out.println(order1);
		
		//2nd time Order Object 
		Order order2 = (Order) container.getBean("order");
		System.out.println(order2);
		
		// DI : is it create a new Product Object to inject in Order? No 
		System.out.println(order1.getProduct());
		System.out.println(order2.getProduct());
		
		
		// Sending data of Order to DB 
		
		// UI -> BE : Spring Web : Beans->   Utilizing   -> Database Operations, Email operations ...  
		
		
		System.out.println("*************** 2nd Product *************");
		
		Product p5 = (Product) container.getBean("product2");
		System.out.println(p5);
		Product p6 = (Product) container.getBean("product2");
		System.out.println(p6);


	}
	
	
	@Scope("prototype")
	@Bean
	Product product2() {
		
		return new Product();
	}

}
