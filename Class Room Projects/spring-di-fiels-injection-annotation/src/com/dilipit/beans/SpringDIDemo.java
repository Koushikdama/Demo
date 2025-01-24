package com.dilipit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIDemo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeansCOnfiguration.class);

		Student student = (Student) context.getBean("student");

		System.out.println(student);

		Address address = student.address;
		System.out.println(address);

		System.out.println(address.getCity());
		System.out.println(address.getPincode());

	}

}
