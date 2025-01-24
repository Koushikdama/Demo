package com.dilip.it.constructor.injection.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringConstructorInjectionTest {

	public static void main(String[] args) {

		ApplicationContext continer = new FileSystemXmlApplicationContext(
				"D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-beans-di\\spring-beans-ci-two.xml");

		CartItems cart = (CartItems) continer.getBean("cart2");
		System.out.println(cart.getItemNames());

		CartItems cart3 = (CartItems) continer.getBean("cart3");
		System.out.println(cart3.getItemNames());
		System.out.println(cart3.getName());
		System.out.println(cart3.getItemPrices());

		Order o1 = (Order) continer.getBean("order1");
		System.out.println(o1.getEmailId());
		System.out.println(o1.getCartItems());
		
		System.out.println(o1.getCartItems().getName());
		System.out.println(o1.getCartItems().getItemNames());
		System.out.println(o1.getCartItems().getItemPrices());
		
		

	}

}
