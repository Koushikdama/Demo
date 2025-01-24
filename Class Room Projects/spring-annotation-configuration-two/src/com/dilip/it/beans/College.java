package com.dilip.it.beans;

public class College {

	private String collegeName;
	private int count;
	
	public College() {
		System.out.println("College is Created...");
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
