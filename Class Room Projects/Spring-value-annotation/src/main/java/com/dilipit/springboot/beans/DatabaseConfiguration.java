package com.dilipit.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {

	//@Value("1521") // hard coded values 
	
	
	// goes -> app.props -> check prop existed -> pick the value value injected in port variable
	@Value("${db.port.number}") 
	private int port;

	@Value("${db.url}")
	private String url;

	@Value("${db.username}")
	private String userName;

	@Value("${db.password}")
	private String password;
	
	@Value("${spring.application.name}")
	private String appName; 
	

	@Autowired
	private DbProfile dbProfile; // injection of reference of other bean Object

	public DatabaseConfiguration() {
		System.out.println("DB is Created... ");
	}

	public DbProfile getDbProfile() {
		return dbProfile;
	}

	public void setDbProfile(DbProfile dbProfile) {
		this.dbProfile = dbProfile;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		System.out.println("");
		this.port = port;
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

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	

}
