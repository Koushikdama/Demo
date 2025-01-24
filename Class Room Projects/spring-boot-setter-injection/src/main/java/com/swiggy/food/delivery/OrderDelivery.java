package com.swiggy.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDelivery {

	private String deliveryBoYname;

	@Autowired
	private Order order;

	public String getDeliveryBoYname() {
		return deliveryBoYname;
	}

	public void setDeliveryBoYname(String deliveryBoYname) {
		this.deliveryBoYname = deliveryBoYname;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
