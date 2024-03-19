package com.sushant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushant.entites.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
