package com.dilip.it.beans;

public class Student {

	private int id;
	private String name;
	private int marks;
	
	public Student(){
		System.out.println("Student Object is Created....");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
