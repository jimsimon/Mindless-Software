package com.mindless.service;

import com.mindless.bean.Category;
import com.mindless.bean.Entity;

public class CategoryService {

	public Category createCategory(Category category) {
		return category;
	}

	public Category addEntityToCategory(Entity entity, Category category) {
		category.setEntity(entity);
		return category;
	}

}
