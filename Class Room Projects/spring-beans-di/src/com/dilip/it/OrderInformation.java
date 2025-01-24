package com.dilip.it;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInformation {

	private int orderId;
	private List<String> productNames; // iphone16, iphone 16 pro
	private List<Integer> releaseYears;
	private Set<String> emailIds;

	private Map<String, Double> productsAndPrices;

	public OrderInformation() {

		System.out.println("OrderInformation is Created");

	}

	public Map<String, Double> getProductsAndPrices() {
		return productsAndPrices;
	}

	public void setProductsAndPrices(Map<String, Double> productsAndPrices) {
		this.productsAndPrices = productsAndPrices;
	}

	public Set<String> getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
	}

	public List<Integer> getReleaseYears() {
		return releaseYears;
	}

	public void setReleaseYears(List<Integer> releaseYears) {
		this.releaseYears = releaseYears;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<String> getProductNames() {

		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		System.out.println("OrderInformation setProductNames is called :" + productNames);
		this.productNames = productNames;
	}

}
