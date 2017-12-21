package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICategoryDao;
import com.stock.mvc.entites.Category;
import com.stock.mvc.service.ICategoryService;


@Transactional
public class CategoryServiceImp implements ICategoryService{

	private ICategoryDao Dao;
	
	
	public ICategoryDao getDao() {
		return Dao;
	}

	public void setDao(ICategoryDao dao) {
		Dao = dao;
	}

	@Override
	public Category save(Category entity) {
		return Dao.save(entity);
	}

	@Override
	public Category update(Category entity) {
	
		return Dao.update(entity);
	}

	@Override
	public List<Category> selectAll() {
		
		return Dao.selectAll();
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		
		return Dao.selectAll(sortField, sort);
	}

	@Override
	public Category getById(Long id) {
		
		return Dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		Dao.remove(id);
		
	}

	@Override
	public Category findOne(String paramName, String paramValue) {
		
		return Dao.findOne(paramName, paramValue);
	}

	@Override
	public Category findOne(String[] paramNames, String[] paramValues) {
		
		return Dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
		
		return Dao.finCountby(paramName, paramValue);
	}

}
