package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IFournisseurDao;
import com.stock.mvc.entites.Fournisseur;
import com.stock.mvc.service.IFournisseurService;



@Transactional
public class FournisseurServiceImp implements IFournisseurService{

	
	private IFournisseurDao dao;
	
	
	public IFournisseurDao getDao() {
		return dao;
	}

	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
	
		return dao.update(entity);
	}

	@Override
	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Fournisseur getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
	       dao.remove(id);
		
	}

	@Override
	public Fournisseur findOne(String paramName, String paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, String[] paramValues) {
	
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
		
		return dao.finCountby(paramName, paramValue);
	}



}
