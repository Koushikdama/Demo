package com.dilipit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

	private int amount;
	private String userEmail;

	
	// info  to : Container : Don't fail DI, please inject upi bean Id object
	
	@Qualifier("debitCard")
	@Autowired  // Problem came : 
	private PaymentType paymentType; // upi,cc, dc
	
	

	public PaymentGateway() {
		System.out.println("PaymentGateway is created");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

}
