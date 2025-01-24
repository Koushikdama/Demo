package com.dilipit.springboot.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is Command Line Runner ......*****8");
		
	}

}
