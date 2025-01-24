package com.dilipit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		// container Object
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-first-application\\spring.xml");

		// Address Object : address2
		Object obj = container.getBean("address2");
		Address a1 = (Address) obj;
		System.out.println(a1);
		
		// Address Object : address1
		Object obj2 = container.getBean("address2");
		Address a2 = (Address) obj2;
		System.out.println(a2);

		
		
	}

}
