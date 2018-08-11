package com.kt.eshop.ecommon.dao;

import java.util.List;

import com.kt.eshop.ecommon.domain.Category;

public interface CategoryDAO {

	List<Category> list();

	public Category get(int id);
}
