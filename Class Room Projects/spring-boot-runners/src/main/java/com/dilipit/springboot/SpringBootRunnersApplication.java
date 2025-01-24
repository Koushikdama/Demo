package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnersApplication {

	public static void main(String[] args) {
		System.out.println("Before  run method ...... ");
		SpringApplication.run(SpringBootRunnersApplication.class, args);
		System.out.println("After run method complated ...... ");
		
	}

}
