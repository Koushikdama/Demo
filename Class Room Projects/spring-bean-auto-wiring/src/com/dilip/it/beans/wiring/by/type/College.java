package com.dilip.it.beans.wiring.by.type;

public class College {
	
	private String name; 
	private Student student;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		System.out.println("setting Student in Collge via Setter : "+student);
		this.student = student;
	} 
	
	
	

}
