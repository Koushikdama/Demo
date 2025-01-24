package com.dilipit.springboot.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.OrderInformation;
import com.dilipit.springboot.repository.OrderInformationRepository;

@Component
public class OrderOperations {
	
	@Autowired
	OrderInformationRepository orderRepository;
	
	public void loadAllOrders() {
		//db call 
		
		System.out.println("*********  Loading ALL Orders *********");
		List<OrderInformation>	allOrders =    orderRepository.findAll();
		allOrders.forEach(System.out::println);
	}
	

}
