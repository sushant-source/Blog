package com.sushant.services;

import java.util.List;

import com.sushant.payloads.CategoryDto;

public interface CategoryService {

	
	//                                                Create Category
	
	CategoryDto createCategory (CategoryDto categoryDto);
	
	
	//                                                Update Category
	
	CategoryDto updateCategory (CategoryDto categoryDto, Integer categoryId);
	
	
	//                                                DeleteCategory
	
	void deleteCategory (Integer categoryId);
	
	
	//                                                Get Category
	
	CategoryDto getCategory (Integer categoryId);
	
	
	//                                                Get All Categories
	
	List<CategoryDto> getAllCategories();

}
	
