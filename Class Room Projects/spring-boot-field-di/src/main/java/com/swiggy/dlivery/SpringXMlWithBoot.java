package com.swiggy.dlivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMlWithBoot {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring-beans.xml");

	}

}
