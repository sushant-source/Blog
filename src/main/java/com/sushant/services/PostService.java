package com.sushant.services;

import java.util.List;

import com.sushant.payloads.PostDto;
import com.sushant.payloads.PostResponse;

public interface PostService {
	
	//                                                      Create Post

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//                                                      Update Post
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//                                                      Delete Post
	
	void deletePost(Integer postId);
	
	//                                                      Get Post By Id
	
	PostDto getPostById(Integer postId);
	
	//                                                      Get All Post
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize);
	
	//                                                      Get Post By User
	
	List<PostDto> getPostByUser(Integer userId);
	
	//                                                      Get Post By Category
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//                                                      Search Posts
	
	List<PostDto> searchPosts(String keyword);
}
