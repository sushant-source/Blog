package com.sushant.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sushant.entites.User;
import com.sushant.payloads.UserDto;
import com.sushant.repositories.UserRepo;
import com.sushant.services.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {

		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);

		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user) {

		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {

		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {

		return null;
	}

	@Override
	public void deleteUser(Integer userId) {

	}

	public User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
	}

	public UserDto userToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setAbout(user.getAbout());
		userDto.setPassword(user.getPassword());
		return userDto;
	}

}
