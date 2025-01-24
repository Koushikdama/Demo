package com.dilip.it.setter.injection;

public class PresentAddress {

	private int pincode;
	private String area;

	public PresentAddress() {
		
		System.out.println("PresentAddress is created");

	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
