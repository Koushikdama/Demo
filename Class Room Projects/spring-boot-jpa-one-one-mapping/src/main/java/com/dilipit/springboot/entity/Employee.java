package com.dilipit.springboot.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	private long empId;

	private String name;

	private String gender;

	// Defining Relationship
	// Entity class of Address table

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eid_aid") // by default PK column refereed from Address table : addressId
	Address address;

}
