package com.sushant.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sushant.entites.Comment;

import lombok.Data;

@Data
public class PostDto {

	private int postId;
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private UserDto user;
	
	private CategoryDto category;
	
	private Set<CommentDto> comments = new HashSet<>();
}
