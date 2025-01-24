package com.dilip.it;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAppplicationTwo {

	public static void main(String[] args) {

		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-beans-di\\dilipit.xml");

		ProductInformation p1 = (ProductInformation) container.getBean("product1");
		System.out.println(p1);

		ProductInformation p2 = (ProductInformation) container.getBean("product2");
		System.out.println(p2);

		OrderInformation o1 = (OrderInformation) container.getBean("order1");
		System.out.println(o1.getOrderId());

		List<String> productNames = o1.getProductNames();
		System.out.println("Number of Products: " + productNames.size());
		productNames.forEach(System.out::println);

		System.out.println(o1.getReleaseYears());

		System.out.println("*********** Order2 Information *****************");
		OrderInformation o2 = (OrderInformation) container.getBean("order2");
		System.out.println(o2.getOrderId());
		System.out.println(o2.getEmailIds());
		System.out.println(o2.getProductNames());
		System.out.println(o2.getReleaseYears());
		System.out.println(o2.getProductsAndPrices());

	}

}
