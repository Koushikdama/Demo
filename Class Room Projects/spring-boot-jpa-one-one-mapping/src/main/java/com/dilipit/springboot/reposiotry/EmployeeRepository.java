package com.dilipit.springboot.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
