package com.dilip.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {


		ApplicationContext container = new FileSystemXmlApplicationContext("D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-beans-di\\dilipit.xml");

		Object obj =  container.getBean("e1"); //Bean  id 
		Employee emp1 = (Employee)obj;
		
		System.out.println("Before Values Updated");
		emp1.printEmpInforamtion();
		
	
				
		
	}

}
