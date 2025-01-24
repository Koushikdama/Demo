package com.dilipit.springboot.operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
		employees.add(new EmployeeDetails(18, "One", 44, 30000.00f, "Hyderabad", "MALE", "India"));
		employees.add(new EmployeeDetails(22, "Two", 33, 34455.00f, "Banglore", "MALE", "India"));
		employees.add(new EmployeeDetails(13, "Three", 34, 325455.00f, "Hyderabad", "MALE", "India"));
		employees.add(new EmployeeDetails(444, "Four", 32, 45455.00f, "Delhi", "MALE", "India")); // update
		employees.add(new EmployeeDetails(17, "Five", 23, 456647.00f, "NewYork", "FEMALE", "USA"));
		employees.add(new EmployeeDetails(66, "Six", 55, 54657.00f, "Hyderabad", "MALE", "India"));
		employees.add(new EmployeeDetails(27, "Seven", 22, 98764.00f, "Delhi", "FEMALE", "India"));
		employees.add(new EmployeeDetails(38, "Eight", 29, 43543.00f, "Newjersy", "MALE", "USA"));
		employees.add(new EmployeeDetails(49, "Nine", 29, 454534.00f, "Banglore", "MALE", "India"));
		employees.add(new EmployeeDetails(100, "Ten", 33, 2224455.00f, "Chennai", "FEMALE", "India"));

		employeeRepository.saveAll(employees);

	}

	public void loadAllEmployeeInformation() {
		List<EmployeeDetails> allEmployees = employeeRepository.findAll();
		allEmployees.forEach(System.out::println);
	}

	// sort : eid
	public void loadAllEmployeesByEmpIdAsc() {
		// Sort.by -> entity property name
		List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by("employeeId"));
		allEmployees.forEach(System.out::println);
	}

	// sort : eid : desc
	public void loadAllEmployeesByEmpIdDesc() {
		// Sort.by -> entity property name
		List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by(Direction.DESC, "employeeId"));
		allEmployees.forEach(System.out::println);
	}
	
	//sort : city name 
	public void loadAllEmployeesByCityAsc() {
		List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by("cityName"));
		allEmployees.forEach(System.out::println);
	}
	

	//sort : city and age : desc
	public void loadAllEmployeesByCityAndAge() {
		
		List<EmployeeDetails> allEmployees = employeeRepository.findAll(Sort.by(Direction.DESC, "cityName","age"));
		allEmployees.forEach(System.out::println);
	}

}
