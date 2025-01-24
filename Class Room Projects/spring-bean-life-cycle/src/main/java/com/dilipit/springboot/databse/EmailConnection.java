package com.dilipit.springboot.databse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Annotation 
@Component
public class EmailConnection {
	

	public EmailConnection() {
		System.out.println("Email Created..........");
	}
	
	
	//@PostConstruct
	public void logicBeanCreation() {
		System.out.println("This is life cycle method : After Constrcution and Configuration====>");
		
		// notification.email
		//Logic 
	}
	
	//@PreDestroy
	public void logicOnBeanDesctrution(){
		System.out.println("This is life cycle method : Before Desstrcution ************");
		//Logic 
		
	}
	
	public void email2LifeCycle() {
		System.out.println("email2LifeCycle.........");
	}
	
	public void email2LifeCycleDestroy() {
		System.out.println("email2LifeCycle.........Destroyed....");
	}
	
	
	public void sendEmailNotification() {
		
		//notification.sendMeail
	}

	
}
