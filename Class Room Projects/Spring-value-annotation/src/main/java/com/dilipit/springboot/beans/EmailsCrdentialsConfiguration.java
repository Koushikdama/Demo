package com.dilipit.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailCredentials")
public class EmailsCrdentialsConfiguration {

	// field injection

	// CI
	//@Value("${app.email.host}")
	private String emailHost;

	// FI
	@Value("${app.email.user}")
	private String emailId;

	// SI
	// @Value("${app.email.password}")
	private String emailPassword;

	/*
	 * public EmailsCrdentialsConfiguration() {
	 * System.out.println(" pram constructor is called"); }
	 */
	 
	// DB Data 
	@Autowired
	private DatabaseConfiguration databaseConfiguration;

	//constructor : 1 param : emailHost
	public EmailsCrdentialsConfiguration(@Value("${app.email.host}") String emailHost) {
		System.out.println("1 param constructor called emailHost : "+emailHost);
		this.emailHost = emailHost;
	}

	public String getEmailHost() {
		return emailHost;
	}

	public void setEmailHost(String emailHost) {
		System.out.println("setEmailHost is called....");
		this.emailHost = emailHost;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		System.out.println("setEmailId is called....");

		this.emailId = emailId;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	@Value("${app.email.password}")
	public void setEmailPassword(String emailPassword) {
		System.out.println("setEmailPassword is called and injectd value : " + emailPassword);
		this.emailPassword = emailPassword;
	}

}
