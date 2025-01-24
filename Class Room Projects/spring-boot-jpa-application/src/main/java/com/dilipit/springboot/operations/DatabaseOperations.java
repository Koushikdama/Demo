package com.dilipit.springboot.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.ProductDetails;
import com.dilipit.springboot.entity.UserInformation;
import com.dilipit.springboot.respository.ProductDetailsRepository;
import com.dilipit.springboot.respository.UserDetailsRepo;

@Component
public class DatabaseOperations {

	@Autowired
	ProductDetailsRepository productDetailsRepository;

	@Autowired
	UserDetailsRepo userDetailsRepo;

	// Insert product Information into Product Table
	// 1111, iphone 16 pro, 120000

	// insert : save

	public void addProductInformation() {

		// create entity object
		ProductDetails p1 = new ProductDetails();
		p1.setProductId(55566);
		p1.setProductName("samsung galaxy");
		p1.setProductPrice(43444.99);

		productDetailsRepository.save(p1); // 1 entity Object : 1 record inserted 

	}

	// add user information
	// 11223344 Dilip 8125262702
	public void addUSerInformation() {
		// Entity Object
		UserInformation user = new UserInformation();
		user.setUserID(11144455);
		user.setUserName("Suresh");
		user.setContact("+91 2323");

		// pass entity object to repo : UserDetailsRepo
		userDetailsRepo.save(user);
	}

	public void deleteProduct() {
		productDetailsRepository.deleteAll();
		
		productDetailsRepository.findById(222);
		
		//select * from product where pid=
	}
}
