package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IVenteDao;
import com.stock.mvc.entites.Vente;
import com.stock.mvc.service.IVenteService;



@Transactional
public class VenteServiceImp implements IVenteService{
	
	
	private IVenteDao dao;
	

	public IVenteDao getDao() {
		return dao;
	}

	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public Vente save(Vente entity) {
		
		return dao.save(entity);
	}

	@Override
	public Vente update(Vente entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<Vente> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Vente getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Vente findOne(String paramName, String paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Vente findOne(String[] paramNames, String[] paramValues) {
		
		return findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {

		return dao.finCountby(paramName, paramValue);
	}
	

	
}
