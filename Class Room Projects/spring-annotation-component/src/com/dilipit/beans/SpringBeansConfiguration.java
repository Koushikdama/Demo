package com.dilipit.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dilipit.beans.clg.Student;


//com.dilipit.beans.*

//@ComponentScan("com.*")
//@ComponentScan("org.*")
@ComponentScan(basePackages = {"com.dilipit"})
@Configuration
public class SpringBeansConfiguration {
	
	@Bean("student1")
	public Student getStudent() {
		System.out.println("Beam method of : getStudent : called");
		// logic 
		// calculations //result 
		int toatal = 100+99+77;
		double avg = toatal/3;
		
		return new Student(1,"Dilip",avg);
	}
	
	@Bean("student2")
	public Student getStudent2() {
		System.out.println("Beam method of : getStudent2 : called");
		Student s = new  Student();
		s.setAvgMarks(55);
		s.setId(22);
		s.setName("xyz");
		
		return s;
	}
	
	@Bean
	public Exception getexException() {
		System.out.println("exception..............");
		return new Exception();
	}
	

}
