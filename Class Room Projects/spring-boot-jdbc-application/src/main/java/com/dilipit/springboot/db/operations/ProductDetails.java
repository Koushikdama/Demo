package com.dilipit.springboot.db.operations;

public class ProductDetails {

	// 3 properties -> 3 columns
	private int pid; // pid table colummname
	private String pname;
	private double price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
