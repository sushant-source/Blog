package com.sushant.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoryDto {

	private int categoryId;
	
	@NotBlank
	@Size(min = 3, message = "minimum size of Title will be 3")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10,  message = "minimum size of Description will be 10")
	private String categoryDescription;
}
