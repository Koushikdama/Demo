package com.dilipit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlipkartApplication {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringBeansConfiguration.class);
		
		PaymentGateway gateway =  (PaymentGateway) container.getBean("paymentGateway");
		
		// Extracted injected Bean Object 
		PaymentType paymentType =   gateway.getPaymentType();
		System.out.println(paymentType);
		
		System.out.println(paymentType.getPaymentType());
		
		// beans of PaymentType
		System.out.println(" beans of PaymentType : ");
		System.out.println(container.getBean("debitCard"));
		System.out.println(container.getBean("creditCard"));
		System.out.println(container.getBean("upiPayment"));
		
	}

}
