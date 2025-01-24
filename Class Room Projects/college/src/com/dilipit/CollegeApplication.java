package com.dilipit;

public class CollegeApplication {

	public static void main(String[] args) {
		
		
		// Creating Object of Address Class 
		Address addres1 = new Address();
		addres1.setLocation("HYD");
		addres1.setPincode(500072);
		
		// Student Object 
		Student s1 = new Student();
		s1.setName("Dilip Singh");
		s1.setMobileNumber(8125262702l);
		
		//Student is having dependency of Address Object
		s1.setAddress(addres1);    // Injecting Address object into Student Object 
		
		
		System.out.println(s1.getName());
		System.out.println(s1.getMobileNumber());
		
		// getting Address Object of s1 
		Address addr = s1.getAddress();
		System.out.println(addr.getLocation());
		System.out.println(addr.getPincode());


	}

}
