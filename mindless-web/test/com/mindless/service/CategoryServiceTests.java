package com.mindless.service;


import org.junit.After;
import org.junit.Before;

import com.mindless.bean.Category;
import com.mindless.bean.Entity;

public class CategoryServiceTests {
	Category expectedCategory = new Category();
	Entity expectedEntity = new Entity();
	CategoryService testCategoryService = new CategoryService();
	
	@Before
	public void initializeExpectedCategory(){
		this.expectedCategory = new Category();
		this.expectedEntity = new Entity();
	}
	
	@After
	public void destroyExpectedCategory(){
		this.expectedCategory = null;
	}
}
