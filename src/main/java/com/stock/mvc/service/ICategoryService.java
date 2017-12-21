package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Category;

public interface ICategoryService {
	
	public Category save(Category entity);
	public Category update(Category entity);
	public List<Category> selectAll();
	public List<Category> selectAll(String sortField , String sort);
	public Category getById(Long id);
	public void remove(Long id);
	public Category findOne(String paramName ,String paramValue );
	public Category findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
