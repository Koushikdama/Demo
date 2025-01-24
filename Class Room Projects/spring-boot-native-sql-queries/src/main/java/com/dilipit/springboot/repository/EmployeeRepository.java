package com.dilipit.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.dilipit.springboot.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	// SQL Query 
	@Query(value = "SELECT * FROM EMP_DETAILS" , nativeQuery = true)
	List<EmployeeDetails> getAllEmployees();
	
	//SELECT * FROM EMP_DETAILS ed WHERE CITY = ?1
	
	@Query(value = "SELECT * FROM EMP_DETAILS WHERE CITY = ?1", nativeQuery = true )
	List<EmployeeDetails>  getEmployeesByCity(String city);
	
	
	//SELECT * FROM EMP_DETAILS ed  WHERE COUNTRY =?1  AND GENDER =?2
	@Query(value = "SELECT * FROM EMP_DETAILS ed  WHERE COUNTRY =?1  AND GENDER =?2", nativeQuery = true )
	List<EmployeeDetails>  getEmployeesByCountryAndGnder(String country, String gender);
	
	
	//employeeRepository.getEmployeesByCountryAndGnder("India","MALE");
	//@Query(value = "SELECT * FROM EMP_DETAILS WHERE COUNTRY =?2  AND GENDER =?1", nativeQuery = true )
	//List<EmployeeDetails>  getEmployeesByCountryAndGnder(String a, String b);
	
	//named SQL Query Params 
	
	@Query(value = "SELECT * FROM EMP_DETAILS WHERE CITY =  :cityName  AND age < :age", nativeQuery = true)
	public List<EmployeeDetails> getEmployeesByCityAndAge(@Param("cityName")  String city, 	@Param("age")  int age);
	
	
	// value : DML query  : insert, delete. update 
	
	@Transactional
	@Modifying
	@Query(value = "INSERT  INTO EMP_DETAILS  values(?1,?2,?3,?4,?5,?6,?7)", nativeQuery = true)
	public int addEmployee(long employeeId, String name, int age,  
			float salary, String city, String gender, String country);
	
	//delete 
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM EMP_DETAILS  WHERE emp_id=?1", nativeQuery = true)
	public int deleteEmploye(long employeeID);
	
	

}
