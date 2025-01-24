package com.dilipit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	
}
