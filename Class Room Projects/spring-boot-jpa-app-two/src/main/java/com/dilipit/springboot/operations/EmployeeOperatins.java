package com.dilipit.springboot.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.EmployeeDetails;
import com.dilipit.springboot.repository.EmployeeRepository;

@Component
public class EmployeeOperatins {

	@Autowired
	EmployeeRepository employeeRepository;

	// adding employees

	public void addMoreEmployeess() {

		List<EmployeeDetails> employees = new ArrayList<>();
		employees.add(new EmployeeDetails(1, "One", 28, 30000.00f, "Hyderabad", "FEMALE", "India"));
		employees.add(new EmployeeDetails(2, "Two", 44, 34455.00f, "Banglore", "MALE", "India"));
		employees.add(new EmployeeDetails(3, "Three", 23, 325455.00f, "Hyderabad", "MALE", "India"));
		employees.add(new EmployeeDetails(4, "Four", 44, 45455.00f, "Chennai", "FEMALE", "India")); //update 
		employees.add(new EmployeeDetails(5, "Five", 55, 456647.00f, "NewYork", "FEMALE", "USA"));
		employees.add(new EmployeeDetails(6, "Six", 22, 54657.00f, "Hyderabad", "FEMALE", "India"));
		employees.add(new EmployeeDetails(7, "Seven", 21, 98764.00f, "Chennai", "FEMALE", "India"));
		employees.add(new EmployeeDetails(8, "Eight", 45, 43543.00f, "Newjersy", "MALE", "USA"));
		employees.add(new EmployeeDetails(9, "Nine", 29, 454534.00f, "Banglore", "FEMALE", "India"));
		employees.add(new EmployeeDetails(10, "Ten", 33, 2224455.00f, "Chennai", "FEMALE", "India"));

		employeeRepository.saveAll(employees);

	}

	// get employee data by employee id
	// emp id : PK
	public void loadEmplyeeInformationByEmployeeID() {

		Optional<EmployeeDetails> empObj = employeeRepository.findById(5l);
		if (empObj.isPresent()) {
			EmployeeDetails emp = empObj.get();
			System.out.println(emp);
		} else {
			System.out.println("No Data Available");
		}

	}

	public void loadAllEmployeeInformation() {
		List<EmployeeDetails> allEmployees = employeeRepository.findAll();
		allEmployees.forEach(System.out::println);
	}

	// NOn_primary key columns
	// SELECT * FROM EMP_DETAILS ed WHERE CITY ='Hyderabad'
	// Emp information based on city

	public void getEmployeesByCity(String cityName) {
		
		System.out.println("Getting Employees Information based on City : "+cityName);
		
		List<EmployeeDetails> employess = employeeRepository.findByCityName(cityName);
		employess.forEach(System.out::println);
	}
	
	// based on gender 
	public void getEmployeesByGender(String gender) {
		System.out.println("Getting Employees Information based on Gender : "+gender);
		List<EmployeeDetails> employess = employeeRepository.findByGender(gender);
		employess.forEach(System.out::println);
	}
	
	// based on country 
	public void getEmployeesByCountryName(String countryName) {
		System.out.println("Getting Employees Information based on Country : "+countryName);
		List<EmployeeDetails> employess = employeeRepository.findByCountry(countryName);
		employess.forEach(System.out::println);
	}
	
	//Get  employees based on gender and country  
	
	public void getEmployeesByGenderAndCountry(String country, String gender) {
		List<EmployeeDetails> employess = employeeRepository.findByGenderAndCountry(gender, country);
		employess.forEach(System.out::println);
	}
	
	
	
}
