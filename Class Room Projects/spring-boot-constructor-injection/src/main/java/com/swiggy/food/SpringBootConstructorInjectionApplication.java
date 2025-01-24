package com.swiggy.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.swiggy.food.delivery.Order;

@SpringBootApplication
public class SpringBootConstructorInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootConstructorInjectionApplication.class,
				args);

		Order order1 = (Order) container.getBean("order");
		System.out.println(order1);
		System.out.println(order1.getProduct());

	}

}
