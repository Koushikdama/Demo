package com.dilipit.springboot.respository;

import org.springframework.data.repository.CrudRepository;

import com.dilipit.springboot.entity.UserInformation;

public interface UserDetailsRepo extends CrudRepository<UserInformation, Long>{

}
