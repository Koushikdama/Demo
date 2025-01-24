package com.dilip.it.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplicationWithDI {

	public static void main(String[] args) {


		ApplicationContext container = new  FileSystemXmlApplicationContext("D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-beans-di\\spring-beans.xml");

		Employee emplyeeOne = (Employee) container.getBean("emp1");
		System.out.println(emplyeeOne.getId());
		System.out.println(emplyeeOne.getName());
		System.out.println(emplyeeOne.getSalary());
		Address empOneAddress = emplyeeOne.getAddress();
		System.out.println(empOneAddress);
		System.out.println(empOneAddress.getCity());
		System.out.println(empOneAddress.getPincode());
		
		System.out.println(emplyeeOne.getPresentAddress());
		
		Address address1=  (Address) container.getBean("office");
		System.out.println(address1);
		System.out.println(address1.getCity());
		System.out.println(address1.getPincode());
		
		
		// empOneAddress  , address1 is pointing to same Object or different?  */
		
	
	}

}
