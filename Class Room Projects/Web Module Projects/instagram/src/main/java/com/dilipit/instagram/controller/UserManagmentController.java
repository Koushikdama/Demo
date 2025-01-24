package com.dilipit.instagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//controller class : This class  scanned by Spring MVC module when we started application

@Controller
public class UserManagmentController {
	
		//100 methods 

		@RequestMapping(method = RequestMethod.GET, path="/login")
		public String userLogin() {

			System.out.println("Request Received By Controller. Processing Request of Register");
			return "welcome"; // ViewReslover
		}
		
		@RequestMapping(method = RequestMethod.GET, path="/reset/password")
		public String resetPassword() {

			System.out.println("Request Received By Controller. Processing Request of Register");
			return "resetPassword"; // ViewReslover
		}
	

}
