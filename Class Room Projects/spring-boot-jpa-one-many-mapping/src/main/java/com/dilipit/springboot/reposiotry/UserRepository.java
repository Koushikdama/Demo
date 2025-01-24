package com.dilipit.springboot.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Long>{

}
