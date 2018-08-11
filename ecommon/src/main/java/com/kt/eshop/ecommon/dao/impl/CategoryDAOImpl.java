package com.kt.eshop.ecommon.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.eshop.ecommon.dao.CategoryDAO;
import com.kt.eshop.ecommon.domain.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("This is tv");
		category.setImageUrl("CAT_1");
		categories.add(category);
		
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Phone");
		category1.setDescription("This is Phone");
		category1.setImageUrl("CAT_2");
		
		categories.add(category1);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		System.out.println("Category,,,,,");
		return categories;
	}
	
	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id) return category;
		}
		return null;
	}
}
