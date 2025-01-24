package com.dilip.it.setter.injection;

public class Employee {

	private String name;
	private int id;
	private double salary;

	// Other class : Inject Address class Object into this property
	private Address address;
	private PresentAddress presentAddress;

	public Employee() {

		System.out.println("Employee is Created.. ");
	}

	public PresentAddress getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(PresentAddress presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {

		System.out.println("Employee#setAddress() is called ");
		this.address = address;
	}

}
