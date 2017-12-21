package com.stock.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IClientDao;
import com.stock.mvc.entites.Client;
import com.stock.mvc.service.IClientService;

@Transactional
public class ClientServiceImp implements IClientService{
	
	private IClientDao dao;

	
	public IClientDao getDao() {
		return dao;
	}

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client entity) {
		
		return dao.save(entity);
	}

	@Override
	public Client update(Client entity) {
		
		return dao.update(entity);
	}

	@Override
	public List<Client> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Client> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Client getById(Long id) {
	
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
	     dao.remove(id);
		
	}

	@Override
	public Client findOne(String paramName, String paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, String[] paramValues) {
	
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int finCountby(String paramName, String paramValue) {
		
		return dao.finCountby(paramName, paramValue);
	}

	

	
}
