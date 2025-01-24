package com.dilip.it.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(
				SpringBeansConfiguration.class, SpringBeansConfigurationTwo.class);
		
		//container.getBean("abc");
		
		
		
		

	}
}
