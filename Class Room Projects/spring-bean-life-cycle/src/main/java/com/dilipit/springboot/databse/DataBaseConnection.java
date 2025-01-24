package com.dilipit.springboot.databse;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singleton")
//@Component
public class DataBaseConnection implements InitializingBean, DisposableBean {

	@Value("localhost:1521")
	private String url;

	private String userName;

	private String password;

	public DataBaseConnection() {
		System.out.println("Database Connection Created..... ");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	@Value("dilip")
	public void setUserName(String userName) {
		System.out.println("Setting userName via setter method... ");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		// logic 
		System.out.println("This is afterPropertiesSet call.. ");

	}

	@Override
	public void destroy() throws Exception {

		System.out.println("*******   This is destroy call.. ");
	}

}
