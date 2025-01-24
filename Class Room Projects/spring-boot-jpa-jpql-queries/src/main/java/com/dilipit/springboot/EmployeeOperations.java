package com.dilipit.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {

	@Autowired
	EmployeeRepository employeeRepository;

	public void allEmployees() {

		// List<EmployeeDetails> employees = employeeRepository.loadAllEmployees();
		List<String> employees = employeeRepository.loadEmpInfoOfNameAgeGender();

		employees.forEach(System.out::println);
	}

	// by city
	public void allEmployeesByCity(String city) {

		List<EmployeeDetails> employees = employeeRepository.getByCityNamed(city);

		employees.forEach(System.out::println);
	}

}
