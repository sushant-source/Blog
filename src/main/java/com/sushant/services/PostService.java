package com.sushant.services;

import java.util.List;

import com.sushant.entites.Post;
import com.sushant.payloads.PostDto;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	Post updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	Post getPostById(Integer postId);
	
	List<Post> getAllPost();
	
	List<PostDto> getPostByUser(Integer userId);
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	List<Post> searchPosts(String keyword);
}
