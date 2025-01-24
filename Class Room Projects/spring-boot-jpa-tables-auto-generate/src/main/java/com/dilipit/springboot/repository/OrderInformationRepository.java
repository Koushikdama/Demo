package com.dilipit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.OrderInformation;

public interface OrderInformationRepository extends JpaRepository<OrderInformation, Long>{

}
