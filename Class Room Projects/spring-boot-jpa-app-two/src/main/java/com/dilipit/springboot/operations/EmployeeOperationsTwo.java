package com.dilipit.springboot.operations;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.EmployeeDetails;
import com.dilipit.springboot.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Component
public class EmployeeOperationsTwo {

	@Autowired
	EmployeeRepository employeeRepository;

	// REQ: delete by emp id
	public void deleteEmpInfoById(long empId) {
		employeeRepository.deleteById(empId); // pre - defined
	}

	// REQ : delete all employes based on country
	@Transactional
	public void deleteByCountry(String country) {

		int countOfDeeleted = employeeRepository.deleteByCountry(country);
		System.out.println(countOfDeeleted);
	}

	// Req : update employee salary
	public void updateEmployeeSalaryByEmpId(long empId, float salary) {
		// Req : id is : 5 -> 100000 salary
		// 1 : 55555
		// 10 : 22222

		EmployeeDetails emp = new EmployeeDetails(); // instance var assigned with default values
		emp.setEmployeeId(empId);
		emp.setSalary(salary);

		employeeRepository.save(emp);

		// Option1 : entity object is again filled with all other column values .
	}

	// Option 2: load/find and save
	// Req : update employee salary
	public void updateEmployeeSalaryById(long empId, float salary) {
		// Req : id is : 5 -> 100000 salary
		// 1 : 55555
		// 10 : 22222
		
		//1. find record existed or not with pk value column
		
		Optional<EmployeeDetails> empData = employeeRepository.findById(empId); 
		
		if(empData.isPresent()) {
			// Emp found 
			EmployeeDetails emp = empData.get();
			System.out.println("Employee Found with emp id : "+emp);
			
			//set data to be updated 
			emp.setSalary(salary);
			
			System.out.println("Employee salary updated as : "+emp);
			// save method 
			employeeRepository.save(emp);
			
		}else {
			// emp not found
			System.out.println("NO Employe found with an EMP Id : "+empId);
		}




	}
}
