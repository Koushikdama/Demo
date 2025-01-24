package com.dilip.it.constructor.injection.two;

import java.util.List;
import java.util.Map;

public class CartItems {

	private String name;
	private List<String> itemNames;
	private Map<String, Double> itemPrices;
	private Product product;

	public CartItems(String name, List<String> itemNames, Map<String, Double> itemPrices, Product product) {
		super();
		System.out.println("CartItems with 3 arguments");
		this.name = name;
		this.itemNames = itemNames;
		this.itemPrices = itemPrices;
		this.product = product;
	}

	public CartItems() {
		super();
		System.out.println("CartItems with no arguments");
	}

	public CartItems(String name, List<String> itemNames) {
		super();
		System.out.println("CartItems with 2 arguments");
		this.name = name;
		this.itemNames = itemNames;
	}

	public CartItems(String name) {
		super();
		System.out.println("CartItems with 1 arguments : String");
		this.name = name;
	}

	public CartItems(List<String> itemNames) {
		super();
		System.out.println("CartItems with 1 arguments : List");
		this.itemNames = itemNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public Map<String, Double> getItemPrices() {
		return itemPrices;
	}

	public void setItemPrices(Map<String, Double> itemPrices) {
		this.itemPrices = itemPrices;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	// CI : 100% Constructor presented

}
