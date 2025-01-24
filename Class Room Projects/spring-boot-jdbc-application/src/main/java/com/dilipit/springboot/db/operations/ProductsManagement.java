package com.dilipit.springboot.db.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductsManagement {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void saveProducts() {

		String query = "INSERT INTO PRODUCT values(?,?,?)";

		jdbcTemplate.update(query, 1111, "Samasung Galaxy s23", 110000);

	}

	// select Query :

	// load Products informations : Product
	// Query : select * from products

	public void loaddAllProducts() {
		String query = "select * FROM PRODUCT where pid=?";

		List<ProductDetails> allProducts = jdbcTemplate.query(query,new BeanPropertyRowMapper<ProductDetails>(ProductDetails.class), 400);
	
		allProducts.forEach(product -> {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getPrice());
		});
	}

}
