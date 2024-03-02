package com.sushant.payloads;

import lombok.Data;

@Data

public class UserDto {

	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
}
