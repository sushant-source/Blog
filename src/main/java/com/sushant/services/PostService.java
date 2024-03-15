package com.sushant.services;

import java.util.List;

import com.sushant.payloads.PostDto;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	PostDto getPostById(Integer postId);
	
	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	
	List<PostDto> getPostByUser(Integer userId);
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	List<PostDto> searchPosts(String keyword);
}
