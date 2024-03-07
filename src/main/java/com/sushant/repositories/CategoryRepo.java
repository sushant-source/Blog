package com.sushant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushant.entites.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
