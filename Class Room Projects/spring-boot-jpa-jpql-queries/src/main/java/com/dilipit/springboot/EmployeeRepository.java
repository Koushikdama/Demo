package com.dilipit.springboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	//JPQL query 
	@Query(value = "select  e  from EmployeeDetails e", nativeQuery = false)
	public List<EmployeeDetails> loadAllEmployees();
	
	// native SQL Query
	@Query(value = "select  *  from Emp_Details", nativeQuery = true)
	public List<EmployeeDetails> loadAllEmployeesNative();
	
	//nativeQuery = false : default
	@Query(value = "select  x.name  from EmployeeDetails x")
	public List<String> loadEmpInfoOfNameAgeGender();
	
	// get based on city : indexed query param
	@Query(value = "SELECT e FROM EmployeeDetails e WHERE cityName = ?1")
	public List<EmployeeDetails> getByCity(String city);
	
	
	// get based on city : Named query param
	@Query(value = "SELECT e FROM EmployeeDetails e WHERE cityName = :city")
	public List<EmployeeDetails> getByCityNamed(@Param("city") String city);
	
	
	
}
