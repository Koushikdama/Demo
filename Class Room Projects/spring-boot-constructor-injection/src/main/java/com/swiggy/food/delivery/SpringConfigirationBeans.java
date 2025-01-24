package com.swiggy.food.delivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfigirationBeans {

	@Bean("productTwo")
	public Product getProductTwo() {

		Product p2 = new Product();
		System.out.println(p2);
		System.out.println("producTwo is creating vai Bean Method : " + p2);

		return p2;
	}

}
