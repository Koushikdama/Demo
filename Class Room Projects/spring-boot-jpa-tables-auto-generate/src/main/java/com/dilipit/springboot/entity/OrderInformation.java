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
@Table(name="order_info")
public class OrderInformation {
	
	// column name as : ordr_id
	@Id
	@Column(name ="ordr_id")
	private long orderId ;
	
	@Column(name="email")
	private String emailId;
	
	// not given @Column property name is column name: 
	private int	noOfItems;
	
	
	private String name;
	private String contact;
	private String city;
	private int pincode;
	private double amount;
	
}
