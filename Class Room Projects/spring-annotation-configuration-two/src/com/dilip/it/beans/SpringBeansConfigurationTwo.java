package com.dilip.it.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring Beans configuration  : 
@Configuration
public class SpringBeansConfigurationTwo {

	@Bean("college3")
	public College getCollege3() {
		System.out.println("This is getCollege3 Method ***********");
		College clg = new College();
		clg.setCollegeName("ABC College");
		clg.setCount(500);
		return clg;
	}

}
