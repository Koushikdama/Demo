package com.dilipit.instagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, path="/welcome")
	public String sayWelcome() {

			//Logic
		System.out.println("Request Received By Controller. Processing Request");
		return "hello"; 	// returning view name 	// ViewReslover
	}
	

	@RequestMapping(method = RequestMethod.GET, path="/hello")
	public String userRegister() {

		System.out.println("Request Received By Controller. Processing Request");
		return "welcome"; // ViewReslover
	}
	
		

}
