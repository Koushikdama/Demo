package com.dilipit.springboot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_dtl")
public class Employee {

	@Id
	private int empId;

	private String name;

	private String gender;
	
	// MAny to Many 
	
	@ManyToMany
	@JoinTable(name="emp_roles_joing", 
				joinColumns = @JoinColumn(name="emp_id"),
				inverseJoinColumns = @JoinColumn(name="role_id") )
	List<Roles> roles; 
	

}
