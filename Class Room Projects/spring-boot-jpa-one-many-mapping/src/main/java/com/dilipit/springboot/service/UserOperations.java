package com.dilipit.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.Address;
import com.dilipit.springboot.entity.UserDetails;
import com.dilipit.springboot.reposiotry.UserRepository;

@Component
public class UserOperations {

	@Autowired
	UserRepository userRepository;

	// adding user

	public void addUSer() {
		System.out.println("Adding USer infromation: ");

		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(8125262702l);
		userDetails.setName("Dilip Singh");
		userDetails.setGender("MALE");

		// Address 1
		Address address1 = new Address(1, "HYD", 500072, "INDIA");
		Address address2 = new Address(2, "BANG", 444455, "INDIA");
		Address address3 = new Address(3, "CHENNAI", 667777, "INDIA");

		userDetails.setAddress(List.of(address1, address2, address3));

		userRepository.save(userDetails);

	}

	// read / load
	public void getUserData() {
		UserDetails userDetails = userRepository.findById(8125262702l).get();
		System.out.println(userDetails);
	}

	
	//delete 
	public void deleteUserData() {
		userRepository.deleteById(8125262702l);
	}

	//plcae order 
	// userDetails.setOrders(List()order1, order2)
	
}
