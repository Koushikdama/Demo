package com.dilipit.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {

		//ApplicationContext conatiner = new AnnotationConfigApplicationContext();
		
		ConfigurableApplicationContext conatiner = SpringApplication.run(SpringBootFirstApplication.class, args);
		Object obj = conatiner.getBean("student");
		Student s = (Student) obj;
		System.out.println( s);
		
		System.out.println((Student)conatiner.getBean("student2"));
		
	}

}
