package com.dilipit.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.Address;
import com.dilipit.springboot.entity.Employee;
import com.dilipit.springboot.reposiotry.EmployeeRepository;

@Component
public class EmpOperations {

	@Autowired
	EmployeeRepository employeeRepository;

	// add employee details
	public void addEmployee() {

		// Address Object
		Address address = new Address();
		address.setAddressId(14);
		address.setCity("BANG");
		address.setPincode(99880);
		address.setCountry("India");

		Employee emp = new Employee();
		emp.setEmpId(6677); // 13, 14
		emp.setName("Alice");
		emp.setGender("FEMALE");
		emp.setAddress(address); // setting Address Object

		employeeRepository.save(emp);

	}

	// delete employee Id :
	public void deleteEMployee() {
		employeeRepository.deleteById(6677l);
	}

	// find /load
	public void getEmployeInformation() {

		Optional<Employee> empOptional = employeeRepository.findById(6677l);
		if (empOptional.isPresent()) {
			Employee emp = empOptional.get();
			System.out.println("Employee Infirmation : "+ emp);
		}

	}

}
