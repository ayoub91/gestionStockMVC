package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IMvtStkDao;
import com.stock.mvc.entites.MvtStk;
import com.stock.mvc.service.IMvtStkService;


@Transactional
public class MvtStkServiceImp implements IMvtStkService{

	
	private IMvtStkDao dao;
	
	public IMvtStkDao getDao() {
		return dao;
	}

	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}

	@Override
	public MvtStk save(MvtStk entity) {

		return dao.save(entity);
	}

	@Override
	public MvtStk update(MvtStk entity) {
	
		return dao.update(entity);
	}

	@Override
	public List<MvtStk> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<MvtStk> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvtStk getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public MvtStk findOne(String paramName, String paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvtStk findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
		
		return dao.finCountby(paramName, paramValue);
	}

	

}
