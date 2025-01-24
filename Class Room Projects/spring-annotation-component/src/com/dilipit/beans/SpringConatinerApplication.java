package com.dilipit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dilipit.beans.clg.Student;

public class SpringConatinerApplication {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringBeansConfiguration.class);

		Student student = (Student) container.getBean("student1");
		System.out.println(student);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAvgMarks());
		
		
		Student student2 = (Student) container.getBean("student2");
		System.out.println(student2);
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		System.out.println(student2.getAvgMarks());
		
	}

}
