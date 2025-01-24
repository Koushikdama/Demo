package com.dilipit.beans.clg;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	private double avgMarks;

	public Student() {
		System.out.println("Student is created ... ");
	}

	public Student(int id, String name, double avgMarks) {
		super();
		System.out.println("Student is created ... with params ");
	
		this.id = id;
		this.name = name;
		this.avgMarks = avgMarks;
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

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}

}
