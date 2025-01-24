package com.dilipit.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.Employee;
import com.dilipit.springboot.entity.Roles;
import com.dilipit.springboot.reposiotry.EmployeeRepository;
import com.dilipit.springboot.reposiotry.RolesRepository;

@Component
public class EmployeManagement {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RolesRepository rolesRepository;

	// add new employee
	public void addEMployee() {

		Roles role1 = new Roles(7, "DEV");
		Roles role2 = new Roles(8, "LEAD");
		
		rolesRepository.save(role1);
		rolesRepository.save(role2);
		

		Employee emp = new Employee(100, "Suresh", "MALE", List.of(role1, role2));
		
		employeeRepository.save(emp);

	}

}
