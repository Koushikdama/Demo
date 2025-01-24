package com.swiggy.food.delievry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderDetails {

	private double orderMAount;
	private String userEmail;
	
	public OrderDetails() {
		System.out.println("Order is created....");
	}
	
	@Qualifier("cartItems2")
	@Autowired
	private CartItems cartItems;

	public double getOrderMAount() {
		return orderMAount;
	}

	public void setOrderMAount(double orderMAount) {
		this.orderMAount = orderMAount;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public CartItems getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}

}
