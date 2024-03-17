package com.sushant.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushant.entites.Category;
import com.sushant.entites.Post;
import com.sushant.entites.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
