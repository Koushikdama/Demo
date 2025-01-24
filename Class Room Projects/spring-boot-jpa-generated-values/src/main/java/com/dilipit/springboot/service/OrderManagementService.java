package com.dilipit.springboot.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.OrderInformation;
import com.dilipit.springboot.repository.OrderRepository;

@Component
public class OrderManagementService {

	@Autowired
	OrderRepository orderRepository;
	
	// add Order information 
	public void createAnOrder() {
		
		OrderInformation order = new OrderInformation();
		order.setEmailId("suresh@gmail.com");
		order.setName("Suresh Sinbgh");
		order.setPrice(200.00);
		order.setTimeOfOrder(LocalDateTime.now());
		
		OrderInformation createdOrder =   orderRepository.save(order);
		System.out.println("Order Genearted SUccessfully. Please find Order Details : ");
		System.out.println(createdOrder.getOrderId());
		
		// logic for sending an SMS / Email 
		
	}
}
