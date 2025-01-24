package com.dilipit.springboot.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
