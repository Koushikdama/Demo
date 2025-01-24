package com.dilipit.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EMP_DETAILS")
public class EmployeeDetails {
	
	//emp_id NUMBER(10) primary key, name varchar2(50), age NUMBER(2), salary NUMBER(10,2),
    //city varchar2(30), gender varchar2(10), country varchar2(20)
	
	@Id
	@Column(name="emp_id")
	private long employeeId;
	
	// Note : table column name is exactly same to entity class property name; 
	@Column(name ="name")
	private String name;
	
	
	// jpa considering cloumn name and property name same : @Column(name="property" 
	private int age;
	
	private float salary;
	
	@Column(name ="city")
	private String cityName;
	
	@Column(name ="gender")
	private String  gender;
	
	private String country; 
	

}
