package com.mindless.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	public void createCategory(){
		Category actualCategory = testCategoryService.createCategory(new Category());
		assertNotNull("Category is null", actualCategory);
	}
	
	@Test
	public void addEntityToCategory(){
		Category actualCategory = testCategoryService.addEntityToCategory(expectedEntity, expectedCategory);
		assertEquals("Entity not added to category", actualCategory.getEntity().getGuid(), expectedEntity.getGuid());
	}
}
