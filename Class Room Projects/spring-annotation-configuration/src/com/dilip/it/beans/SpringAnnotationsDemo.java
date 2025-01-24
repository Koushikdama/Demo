package com.dilip.it.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {

		// create container object
		// XML : ApplicationContext container = new FileSystemXmlApplicationContext("XML
		// file path");

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringBeansConfiguration.class);

		// get the bean object

		Student student = (Student) container.getBean("student2");
		System.out.println(student);

		student = (Student) container.getBean("student1");
		System.out.println(student);

		College clg = (College) container.getBean("college1");
		System.out.println(clg);
		System.out.println(clg.getCollegeName());
		System.out.println(clg.getCount());
		
		
		College clg2 = (College) container.getBean("college2");
		System.out.println(clg2);
		System.out.println(clg2.getCollegeName());
		System.out.println(clg2.getCount());
	}
}
