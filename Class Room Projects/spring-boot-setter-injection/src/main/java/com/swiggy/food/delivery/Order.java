package com.swiggy.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int noOfProducts;
	private String emailId;

	private Product product;
	

	public Order() {
		System.out.println("Order created via default constructor");
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Product getProduct() {
		return product;
	}

	//this is method 
	
	// setter method arg name : product
	// Case :  bean Id : productOne, productTwo : Failed 
	// bean Id : product, productTwo : Success :  arg name : product is matching with one bean ID 
	
	
	@Qualifier("productOne")
	@Autowired
	public void setProduct(Product product) {
	//public void setProduct(@Qualifier("productTwo") Product product) {
		System.out.println("Setter of Product is called from Order : "+product);
		this.product = product;
	}
	



}
