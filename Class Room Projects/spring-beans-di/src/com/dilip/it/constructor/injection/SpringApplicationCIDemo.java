package com.dilip.it.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplicationCIDemo {

	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-beans-di\\spring-beans-di-ci.xml");

		Patient p1 = (Patient) container.getBean("patient1");
		System.out.println(p1);
		
		Patient p2 = (Patient) container.getBean("patient2");
		System.out.println(p2);
		
		Patient p3 = (Patient) container.getBean("patient3");
		System.out.println(p3);
		
		Patient p4 = (Patient) container.getBean("patient4");
		System.out.println(p4);

		
		
	}

}
