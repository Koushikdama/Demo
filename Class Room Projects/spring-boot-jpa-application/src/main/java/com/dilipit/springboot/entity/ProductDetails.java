package com.dilipit.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//table : product(pid NUMBER(5), pname  varchar2(50), price NUMBER(8,2));

@Entity
@Table(name = "product") // database table name
public class ProductDetails {

	// defining properties: based no of columns

	@Id
	@Column(name = "pid") // column name of data base table
	private int productId;

	@Column(name = "pname")
	private String productName;

	@Column(name = "price")
	private double productPrice;

	public ProductDetails() {
		super();
	}

	public ProductDetails(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	
	

}
