package org.niit.dao;

import java.util.List;

import org.niit.model.Category;



public interface CategoryDAO {


	public List<Category> list();

	public Category get(String id);
	
	public Category getByName(String name);

	public void saveOrUpdate(Category category);

	public void delete(String id);

	public List<Category> listCategory();


}
