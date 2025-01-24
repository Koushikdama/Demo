package com.dilip.it.beans.wiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutiWiringModeConstructor {

	public static void main(String[] args) {

		ApplicationContext conatainer = new FileSystemXmlApplicationContext("D:\\Classes\\B1-Spring, Spring Boot-Oct-24\\spring-workspace\\spring-bean-auto-wiring\\spring-beans-auto-wiring-constructor.xml");
		
		
	Hospital myHospital =	(Hospital) conatainer.getBean("abc");
	System.out.println(myHospital);
	System.out.println(myHospital.getPatient1());
		
	}

}
