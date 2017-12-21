package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCommandeFournisseurDao;
import com.stock.mvc.entites.LigneCommandeFournisseur;
import com.stock.mvc.service.ILigneCommandeFournisseurService;


@Transactional
public class LigneCommandeFournisseurServiceImp implements ILigneCommandeFournisseurService{

	
	private ILigneCommandeFournisseurDao dao;
	
	
	public ILigneCommandeFournisseurDao getDao() {
		return dao;
	}

	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		
		return dao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
	
		return selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {

		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, String paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, String[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
	
		return dao.finCountby(paramName, paramValue);
	}
	

}
