package com.dilipit.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@ComponentScan("com.*")
@Configuration
public class SpringBeansConfiguration {


	@Bean
	public PaymentType creditCard() {
		
		PaymentType payment = new PaymentType();
		payment.setPaymentType("Credit Card Payment");
		
		return payment;
	}
	

	@Bean
	public PaymentType debitCard() {
		
		PaymentType payment = new PaymentType();
		payment.setPaymentType("Debit Card Payment");
		
		return payment;
	}
	
	
}
