package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ICommandeFournisseurDao;
import com.stock.mvc.entites.CommandeFournisseur;
import com.stock.mvc.service.ICommandeFournisseurService;

@Transactional
public class CommandeFournisseurServiceImp implements ICommandeFournisseurService{
	
	private ICommandeFournisseurDao dao;

	
	public ICommandeFournisseurDao getDao() {
		return dao;
	}

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
	
		return dao.save(entity);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<CommandeFournisseur> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public CommandeFournisseur findOne(String paramName, String paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, String[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
	
		return dao.finCountby(paramName, paramValue);
	}

	
}
