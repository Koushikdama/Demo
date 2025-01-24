package com.dilipit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component("upiPayment")
public class PaymentType {

	private String paymentType;

	public PaymentType() {
		System.out.println("PaymentType is created...");
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}
