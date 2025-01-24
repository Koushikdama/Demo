package com.dilipit.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component
public class Order {
	
	public Order() {
		System.out.println("Order is Created....");
	}
	
	// DI  : inject bean of product 
	@Autowired
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
