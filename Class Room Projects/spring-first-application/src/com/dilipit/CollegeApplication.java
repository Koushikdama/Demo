package com.dilipit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollegeApplication {

	public static void main(String[] args) {

		// Create Container Object and then you can pass XML file location to Container.

		// file path to container

		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-first-application\\spring.xml");

		// Address class Object : // pass the bean Id
		Object obj = container.getBean("address1");

		// type casting :
		Address a1 = (Address) obj;

		a1.printMyAddress();

		obj = container.getBean("address1");

		// type casting :
		Address a2 = (Address) obj;

		a2.setLocation("Hyderabad");
		System.out.println(a2.getLocation());

		// get Student Object

		Object obj2 = container.getBean("student1");
		Student s1 = (Student) obj2;

		System.out.println(s1.getMobileNumber());
		System.out.println(s1.getName());

	}

}
