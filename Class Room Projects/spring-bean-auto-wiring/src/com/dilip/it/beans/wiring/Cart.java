package com.dilip.it.beans.wiring;

public class Cart {

	// byName
	private int noOfItems;
	private Product product2;
	private Product product;
	private Information infromtion;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		System.out.println("setting product");
		this.product = product;
	}

	public Information getInfromtion() {
		return infromtion;
	}

	public void setInfromtion(Information infromtion) {
		System.out.println("setting Infrimation ");
		this.infromtion = infromtion;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		
		this.noOfItems = noOfItems;
	}

	public Product getProduct2() {
		return product2;
	}

	public void setProduct2(Product product2) {
		System.out.println("setting product2 ");
		this.product2 = product2;
	}

}
