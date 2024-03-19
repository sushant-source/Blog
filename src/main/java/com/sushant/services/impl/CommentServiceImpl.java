package com.sushant.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushant.entites.Comment;
import com.sushant.entites.Post;
import com.sushant.exceptions.ResourceNotFoundException;
import com.sushant.payloads.CommentDto;
import com.sushant.repositories.CommentRepo;
import com.sushant.repositories.PostRepo;
import com.sushant.services.CommentService;

@Service

public class CommentServiceImpl implements CommentService {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private PostRepo postRepo;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		
		Post post = this.postRepo.findById(postId)
				.orElseThrow(()-> new ResourceNotFoundException("Post", "Post Id", postId));
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment  savedComment = this.commentRepo.save(comment);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {

		Comment comment = this.commentRepo.findById(commentId)
				.orElseThrow(()-> new ResourceNotFoundException("Comment", "Comment Id", commentId));
		this.commentRepo.delete(comment);
	}

}
