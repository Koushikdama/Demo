package com.swiggy.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int noOfProducts; 
	private String emailId;
	
	private Product product;
	
	
	// CI : product object : Defined constructor with that param 
	
	// bean Id s: product, productTwo : constructor arg : productThree : No matching : DI failed 
	
	
	//@Autowired
	public Order(@Autowired @Qualifier("productTwo")  Product productThree) {
		System.out.println("Order created via 1 param constructor"+productThree);
		this.product = productThree;
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

	
	public void setProduct(Product product) {
		System.out.println("Setter of Product is called from Order : "+product);
		this.product = product;
	}
	



}
