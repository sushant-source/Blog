package com.sushant.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushant.entites.User;
import com.sushant.payloads.UserDto;
import com.sushant.repositories.UserRepo;
import com.sushant.services.UserService;
import com.sushant.exceptions.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private  ModelMapper modelMapper;

	//                                                          Create User
	
	@Override
	public UserDto createUser(UserDto userDto) {

		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);

		return this.userToDto(savedUser);
	}

	//                                                         Update User
	
	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {

		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());

		User updateUser = this.userRepo.save(user);
		UserDto userToDto1 = this.userToDto(updateUser);

		return userToDto1;
	}
	
	//                                                          Get User By Id

	@Override
	public UserDto getUserById(Integer userId) {

		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		return this.userToDto(user);
	}

	//                                                         Get All Users
	
	@Override
	public List<UserDto> getAllUsers() {

		List<User> users = this.userRepo.findAll();
	
		List<UserDto> userDtos = users.stream().map(user -> this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	//                                                         Delete User
	
	@Override
	public void deleteUser(Integer userId) {

		User user = userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User", "id", userId));
		this.userRepo.delete(user);
	}
	
	//                                                          dtoToUser

	public User dtoToUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
		return user;
	}
	
	//                                                          userToDto

	public UserDto userToDto(User user) {
		UserDto userDto = this.modelMapper.map(user, UserDto.class);
		return userDto;
	}

}
