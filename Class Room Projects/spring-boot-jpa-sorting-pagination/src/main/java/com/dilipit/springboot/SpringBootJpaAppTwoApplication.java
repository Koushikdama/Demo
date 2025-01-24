package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.operations.EmployeeOperatins;
import com.dilipit.springboot.operations.GetEmployeeDetails;

@SpringBootApplication
public class SpringBootJpaAppTwoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaAppTwoApplication.class, args);

		// EmployeeOperatins empOperations = container.getBean(EmployeeOperatins.class);
		// empOperations.addMoreEmployeess();
		/*
		 * empOperations.loadAllEmployeeInformation();
		 * 
		 * System.out.println("Employees Based on Emp Id Order : ");
		 * empOperations.loadAllEmployeesByEmpIdAsc();
		 * 
		 * System.out.println("Employees Based on Emp Id Order : Desc");
		 * empOperations.loadAllEmployeesByEmpIdDesc();
		 * 
		 * System.out.println("Employees Based on City : Order : ASC");
		 * empOperations.loadAllEmployeesByCityAsc();
		 * 
		 * 
		 * System.out.println("Employees Based on City and Age  : DESC");
		 * empOperations.loadAllEmployeesByCityAndAge();
		 */

		GetEmployeeDetails empObj = container.getBean(GetEmployeeDetails.class);
		empObj.getEmpInformation();

		System.out.println("Loading Employes Data by page wise ......");
		empObj.getEmployeeDetails(0, 10); // 0 : page 1 , 1: page 2

		System.out.println("Loading Employes Data by page wise followed by Emp ID order......");
		empObj.getEmployeeDetailsbyIDOrder(1, 10); // 0 : page 1 , 1: page 2
		
		System.out.println("Loading Employes Data by page wise followed by city & age : Desc......");
		empObj.getEmployeeDetailsbyCityAndAge(2, 4); // 0 : page 1 , 1: page 2

	}

}
