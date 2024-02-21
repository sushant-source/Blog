package com.sushant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushant.entites.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
