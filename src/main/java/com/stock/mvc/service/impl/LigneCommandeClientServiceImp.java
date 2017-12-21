package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCommandeClientDao;
import com.stock.mvc.entites.LigneCommandeClient;
import com.stock.mvc.service.ILigneCommandeClientService;


@Transactional
public class LigneCommandeClientServiceImp implements ILigneCommandeClientService{
	
	
	private ILigneCommandeClientDao dao;

	
	public ILigneCommandeClientDao getDao() {
		return dao;
	}

	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		
		return dao.save(entity);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
	
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient getById(Long id) {

		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeClient findOne(String paramName, String paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, String[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
		
		return dao.finCountby(paramName, paramValue);
	}




}
