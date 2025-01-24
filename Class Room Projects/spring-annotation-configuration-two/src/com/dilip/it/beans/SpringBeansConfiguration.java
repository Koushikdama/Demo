package com.dilip.it.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring Beans configuration  : 
@Configuration
public class SpringBeansConfiguration {

	// Student class :

	@Bean("student1") // bean id : student1
	public Student getStudent1() {

		return new Student();
	}

	@Bean("student2") // bean id : student2
	public Student getStudent2() {

		return new Student();
	}

	@Bean("college1")
	public College getCollege1() {
		System.out.println("This is getCollege1 Method ***********");
		return new College();
	}

	@Bean("college2")
	public College getCollege2() {
		System.out.println("This is getCollege2 Method ***********");
		College clg = new College();
		clg.setCollegeName("ABC College");
		clg.setCount(500);

		return clg;
	}
	
	

}
