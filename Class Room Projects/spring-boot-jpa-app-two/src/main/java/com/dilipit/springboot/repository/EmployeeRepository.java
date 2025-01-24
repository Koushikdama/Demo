package com.dilipit.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	List<EmployeeDetails> findByCityName(String cityName);

	List<EmployeeDetails> findByGender(String gender);

	List<EmployeeDetails> findByCountry(String country);

	// Get  employees based on gender and country  
	List<EmployeeDetails> findByGenderAndCountry(String gender, String country);
	
	//Get  employees based on gender and from a specfic city from specific country  
	List<EmployeeDetails> findByGenderAndCountryAndCityName(String gender, String country, String city);
	
	//get employees either they belongs to gender or city . 
	List<EmployeeDetails> findByGenderOrCityName(String gender, String city);
	
	
	// **** deleteBy 
	
	int deleteByCountry(String country);

}
