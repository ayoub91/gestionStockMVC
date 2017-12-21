package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IUtilisateurDao;
import com.stock.mvc.entites.Utilisateur;
import com.stock.mvc.service.IUtilisateurService;



@Transactional
public class UtilisateurServiceImp implements IUtilisateurService{
	
	private IUtilisateurDao dao;

	
	public IUtilisateurDao getDao() {
		return dao;
	}

	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur save(Utilisateur entity) {
		
		return dao.save(entity);
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<Utilisateur> selectAll() {
	
		return dao.selectAll();
	}

	@Override
	public List<Utilisateur> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Utilisateur getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Utilisateur findOne(String paramName, String paramValue) {
		dao.findOne(paramName, paramValue);
		return null;
	}

	@Override
	public Utilisateur findOne(String[] paramNames, String[] paramValues) {
		
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
		return dao.finCountby(paramName, paramValue);
	}

	
}