package com.dilipit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dilipit.springboot.operations.EmployeeOperatins;
import com.dilipit.springboot.operations.EmployeeOperationsTwo;

@SpringBootApplication
public class SpringBootJpaAppTwoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootJpaAppTwoApplication.class, args);
		
		EmployeeOperatins empOperations =   container.getBean(EmployeeOperatins.class);
		//empOperations.addMoreEmployeess();
		//empOperations.loadEmplyeeInformationByEmployeeID();
		//empOperations.loadAllEmployeeInformation();
		
		//empOperations.getEmployeesByCity("Hyderabad");
		
		//empOperations.getEmployeesByCountryName("USA");
		
		//empOperations.getEmployeesByGender("OTHER");
		
		//empOperations.getEmployeesByGenderAndCountry("India", "FEMALE");
		
		EmployeeOperationsTwo empOpsTwo = container.getBean(EmployeeOperationsTwo.class);
		//empOpsTwo.deleteEmpInfoById(5);
		//empOpsTwo.deleteByCountry("India");
		
		//empOpsTwo.updateEmployeeSalaryByEmpId(5, 100000);
		
		empOpsTwo.updateEmployeeSalaryById(2, 300000);
		
	}
	

}
