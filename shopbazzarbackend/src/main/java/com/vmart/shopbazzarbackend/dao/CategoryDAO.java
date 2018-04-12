package com.vmart.shopbazzarbackend.dao;

import java.util.List;

import com.vmart.shopbazzarbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
}
