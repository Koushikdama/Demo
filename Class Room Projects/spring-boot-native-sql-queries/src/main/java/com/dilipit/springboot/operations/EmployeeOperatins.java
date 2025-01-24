package com.dilipit.springboot.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.EmployeeDetails;
import com.dilipit.springboot.repository.EmployeeRepository;

@Component
public class EmployeeOperatins {

	@Autowired
	EmployeeRepository employeeRepository;

	public void loadEmployees() {
		List<EmployeeDetails> employees = employeeRepository.getAllEmployees();
		employees.forEach(System.out::println);
	}

	public void loadEmployeesByCity() {
		List<EmployeeDetails> employees = employeeRepository.getEmployeesByCity("Hyderabad");
		employees.forEach(System.out::println);
	}

	public void loadEmployeesByCountryNAdGender() {
		List<EmployeeDetails> employees = employeeRepository.getEmployeesByCountryAndGnder("India", "MALE");
		employees.forEach(System.out::println);
	}
	
	public void loadEmployeesBycityANdAge(String cityName, int age) {
		List<EmployeeDetails> employees = employeeRepository.getEmployeesByCityAndAge(cityName, age);
		employees.forEach(System.out::println);
	}
	
	
	public void addNewEmployee() {
		int count=  employeeRepository.addEmployee(5000, "Alice", 29, 3333, "NewYork", "MALE", "USA");
		System.out.println("No Of Recorss Inserted : "+count);
	}
	
	
	public void deleteEmployee() {
		int count=  employeeRepository.deleteEmploye(1);
		System.out.println("No Of Recorss Deleted : "+count);
	}

}
