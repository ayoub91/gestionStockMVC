package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Client;

public interface IClientService {
	
	public Client save(Client entity);
	public Client update(Client entity);
	public List<Client> selectAll();
	public List<Client> selectAll(String sortField , String sort);
	public Client getById(Long id);
	public void remove(Long id);
	public Client findOne(String paramName ,String paramValue );
	public Client findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
