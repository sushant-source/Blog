package com.sushant.services;

import java.util.List;

import com.sushant.payloads.UserDto;

public interface UserService {

	//                                                              Create User

	UserDto createUser(UserDto user);

   //                                                               Update User

	UserDto updateUser(UserDto user, Integer uid);

   //	                                                            Get User By Id

	UserDto getUserById(Integer userId);

	//                                                              Get All Users
	
	List<UserDto> getAllUsers();

	//                                                               Delete User

	void deleteUser(Integer userId);

}
