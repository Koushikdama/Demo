package com.dilipit.springboot.operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dilipit.springboot.entity.ProductDetails;
import com.dilipit.springboot.respository.ProductDetailsRepository;

@Component
public class DataBaseOperationsTwo {

	@Autowired
	ProductDetailsRepository productDetailsRepository;

	// Req adding more then one product; Inserting more than one record.
	// 222 mouse 5000
	// 223 keyboard 2000
	// 225 speaker 4000
	public void addMoreProducts() {

		List<ProductDetails> allProducts = new ArrayList<>();
		allProducts.add(new ProductDetails(222, "Mouse", 5000));
		allProducts.add(new ProductDetails(223, "Keyboard", 2000));
		allProducts.add(new ProductDetails(225, "Speacker", 4000));

		productDetailsRepository.saveAll(allProducts); // 3 records are inserted
	}

	// all products information
	// sql : select * from product

	public void loadAllProducts() {
		List<ProductDetails> allProducts = productDetailsRepository.findAll();
		
		//send to front it. 
		System.out.println(allProducts);
	}

	//
	
	
}
