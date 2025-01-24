package com.swiggy.food.delivery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Product {

	private int productId;
	private String name;
	private double price;
	
	public Product() {
		System.out.println("Product Is Created via defult constructor");
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("The setter is called.... ");
		this.price = price;
	}

}
