package com.dilipit.springboot.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.EmployeeDetails;
import com.dilipit.springboot.repository.EmployeeRepository;

@Component
public class GetEmployeeDetails {

	@Autowired
	EmployeeRepository employeeRepository;

	// page : 3 records

	// page number : i/p
	// no of records : i/p

	public void getEmpInformation() {
		Page<EmployeeDetails> pageObjects = employeeRepository.findAll(Pageable.ofSize(5));
		// in List of Object
		List<EmployeeDetails> employees = pageObjects.getContent();

		employees.forEach(System.out::println);

	}

	public void getEmployeeDetails(int pageNo, int recrodsPerPage) {

		// PageRequest.of(pageNo, recrodsPerPage) ;

		List<EmployeeDetails> employees = employeeRepository.findAll(PageRequest.of(pageNo, recrodsPerPage))
				.getContent();

		employees.forEach(System.out::println);

	}

	// get empl info per page and no of records and make sure emp id order

	public void getEmployeeDetailsbyIDOrder(int pageNo, int recrodsPerPage) {

		// PageRequest.of(pageNo, recrodsPerPage) ;

		List<EmployeeDetails> employees = employeeRepository
				.findAll(PageRequest.of(pageNo, recrodsPerPage, Sort.by(Direction.DESC, "employeeId"))).getContent();

		employees.forEach(System.out::println);

	}
	
	
	// get empl info per page and no of records and make sure city & age 

	public void getEmployeeDetailsbyCityAndAge(int pageNo, int recrodsPerPage) {

		// PageRequest.of(pageNo, recrodsPerPage) ;

		List<EmployeeDetails> employees = employeeRepository
				.findAll(PageRequest.of(pageNo, recrodsPerPage, Direction.DESC, "cityName","age")).getContent();

		employees.forEach(System.out::println);

	}
}
