package com.dilipit.springboot.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilipit.springboot.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
