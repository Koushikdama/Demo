package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.dilipit.springboot.beans.AwsDsataBaseConfiguration;
import com.dilipit.springboot.beans.DatabaseConfiguration;
import com.dilipit.springboot.beans.EmailsCrdentialsConfiguration;
import com.dilipit.springboot.beans.org.OrganizationInfo;


@PropertySource(value = {"aws-database.properties"})
@SpringBootApplication
public class SpringValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringValueAnnotationApplication.class, args);

		DatabaseConfiguration dbConfig = (DatabaseConfiguration) container.getBean("databaseConfiguration");
		System.out.println(dbConfig.getPort());
		System.out.println(dbConfig.getUrl());
		System.out.println(dbConfig.getUserName());
		System.out.println(dbConfig.getPassword());

		System.out.println(dbConfig.getDbProfile().getDbPassword());

		System.out.println(dbConfig.getAppName());

		// Email Data

		System.out.println("************* Email Data *****************");
		EmailsCrdentialsConfiguration emailData = (EmailsCrdentialsConfiguration) container.getBean("emailCredentials");
		System.out.println(emailData.getEmailHost());
		System.out.println(emailData.getEmailPassword());
		System.out.println(emailData.getEmailId());

		System.out.println("************ Org Data **************");

		OrganizationInfo orgInfo = (OrganizationInfo) container.getBean("organizationInfo");
		System.out.println(orgInfo.getOrgEmpCount());
		System.out.println(orgInfo.getDeptNames());
		orgInfo.getDeptNames().forEach(System.out::println);

		System.out.println("**************  AWS Data Base Check ********** ");
		AwsDsataBaseConfiguration awsDb = (AwsDsataBaseConfiguration) container.getBean("awsDsataBaseConfiguration");
		System.out.println(awsDb.getAwsHost());
		System.out.println(awsDb.getAwsUserName());
		System.out.println(awsDb.getAwsPassword());
		
		
		

	}

}
