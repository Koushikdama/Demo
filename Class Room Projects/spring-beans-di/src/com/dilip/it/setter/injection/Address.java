package com.dilip.it.setter.injection;

public class Address {

	private int pincode;
	private String city;
	private String country;
	
	public Address() {
		System.out.println("Address is Created");
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void getAddressInfiormation() {
		System.out.println("Address is : "+pincode+", "+city+" , "+country);
	}

}
