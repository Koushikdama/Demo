package com.dilip.it.constructor.injection.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanWiring {

	public static void main(String[] args) {

		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-beans-di\\spring-bean-wiring.xml");
		
		Order order =   (Order) container.getBean("order1");
		
		System.out.println(order); // Order Object: order1
		System.out.println(order.getCartItems()); // CartItems : cart3
		System.out.println(order.getCartItems().getProduct()); // Product : product1 
		
		
	}

}
