package com.dilip.it.beans.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanAuoWiringTest {

	public static void main(String[] args) {

		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-bean-auto-wiring\\spring-beans-auto-wiring.xml");

		Cart c1 = (Cart) container.getBean("cart");
		
		Product p1 = c1.getProduct2(); // injected one returning here
		System.out.println(p1);
		System.out.println(p1.getProductId());
		System.out.println(p1.getProductName());
		System.out.println(p1.getPrice());

		p1 = c1.getProduct(); // injected one returning here
		System.out.println(p1);
		System.out.println(p1.getProductId());
		System.out.println(p1.getProductName());
		System.out.println(p1.getPrice());

		System.out.println(c1.getInfromtion());
		
		System.out.println("**********");
		
		Order order = (Order) container.getBean("order");
		/*
		 * System.out.println(order.getCart().getInfromtion());
		 * System.out.println(order.getCart().getProduct().getPrice());
		 * System.out.println(order.getCart().getProduct().getProductId());
		 * System.out.println(order.getCart().getProduct().getProductName());
		 * System.out.println(order.getCart().getProduct2().getPrice());
		 * System.out.println(order.getCart().getProduct2().getProductId());
		 * System.out.println(order.getCart().getProduct2().getProductName());
		 */
	}

}
