package com.vmart.shopbazzarbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vmart.shopbazzarbackend.dao.CategoryDAO;
import com.vmart.shopbazzarbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	
	static
	{
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is some description for television");
		category.setImageURL("cat1.png");
		
		categories.add(category);
		
		
		//Second category
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is some description for Mobile");
		category.setImageURL("cat2.png");
		
		categories.add(category);
		
		//third category
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is some description for Laptop");
		category.setImageURL("cat3.png");
		
		categories.add(category);
		
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		// enhanched for loop
  for(Category category:categories)
  {
	  if (category.getId() == id) 
		  return category;
  }
  return null;
	}
	}


