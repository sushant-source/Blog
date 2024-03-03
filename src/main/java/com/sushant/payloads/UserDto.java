package com.sushant.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 3, message = "Username must be atleast 3 character")
	private String name;
	
	@Email
	 @Pattern(regexp = "^[A-Za-z0-9._%+-]+@(gmail|ymail|hotmail|yahoo|rediffmail)\\.(com|net|org)$", message = "Invalid email format")
	private String email;
	
	@NotEmpty
	@Size(min = 8, max =12)
	private String password;
	
	@NotEmpty
	@Size(min = 15, max =100)
	private String about;
}
