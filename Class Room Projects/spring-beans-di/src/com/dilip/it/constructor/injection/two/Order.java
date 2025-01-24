package com.dilip.it.constructor.injection.two;

public class Order {
	
	private String emailId;
	private CartItems cartItems;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(String emailId, CartItems cartItems) {
		super();
		System.out.println("Order is Creating with email and cart items ");
		this.emailId = emailId;
		this.cartItems = cartItems;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public CartItems getCartItems() {
		return cartItems;
	}


	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	
	
	
	
}
