package com.dilipit.beans;

import org.springframework.stereotype.Component;

@Component
public class ProductDetails {

	private int id;
	private String name;
	private double price;
	
	public ProductDetails (){
		System.out.println("ProductDetails Object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		this.price = price;
	}

}
