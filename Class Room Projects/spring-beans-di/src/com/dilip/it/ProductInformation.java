package com.dilip.it;

public class ProductInformation {

	private int productId;
	private String productName;
	private double price;
	private boolean isExpired;
	private char inStock;
	

	public char getInStock() {
		return inStock;
	}

	public void setInStock(char inStock) {
		this.inStock = inStock;
	}

	public ProductInformation() {
		System.out.println("Product is created");
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		System.out.println("Product setProductId is called with value : " + productId);
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		System.out.println("Product setProductName is called with value : " + productName);
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Product setPrice is called with value : " + price);
		this.price = price;
	}

	public boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(boolean isExpired) {
		System.out.println("Product setExpired is called with value : " + isExpired);
		this.isExpired = isExpired;
	}

	@Override
	public String toString() {
		return "ProductInformation [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", isExpired=" + isExpired + ", inStock=" + inStock + "]";
	}

}
