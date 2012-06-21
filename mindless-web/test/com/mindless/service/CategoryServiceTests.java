package com.mindless.service;


import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mindless.bean.Account;
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
	
	@Test
	public void viewCategories() throws Exception {
		List<Category> actualCategories = testCategoryService.viewCategories();
		assertNotNull(actualCategories);
	}
	
	@Test
	public void viewFavoriteCategories() throws Exception {
		Account account = new Account();
		List<Category> actualCategories = testCategoryService.viewFavoriteCategories(account);
		assertNotNull(actualCategories);
	}
	
	@Test
	public void viewTrendingCategories() throws Exception {
		List<Category> actualCategories = testCategoryService.viewTrendingCategories();
		assertNotNull(actualCategories);
	}
	
	@Test
	public void viewRecommendedCategories() throws Exception {
		List<Category> actualCategories = testCategoryService.viewRecommendedCategories();
		assertNotNull(actualCategories);
	}
	
	@Test
	public void viewCategory() throws Exception {
		Category category = 
	}
}
