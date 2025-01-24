package com.dilipit.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.ProductDetails;

// ProductDetails
// JPA Repository 
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer>{

}


