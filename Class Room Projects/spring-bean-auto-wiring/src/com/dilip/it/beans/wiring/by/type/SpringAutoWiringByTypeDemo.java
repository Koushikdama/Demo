package com.dilip.it.beans.wiring.by.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutoWiringByTypeDemo {

	public static void main(String[] args) {

		ApplicationContext container = new FileSystemXmlApplicationContext("D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-bean-auto-wiring\\spring-beans-auto-wiring-type.xml");

		College clg = (College) container.getBean("college");
		
		System.out.println(clg);
		System.out.println(clg.getStudent());
		
	
	}

}
