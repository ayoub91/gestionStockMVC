package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.CommandeClient;

public interface ICommandeClientService {
	
	public CommandeClient save(CommandeClient entity);
	public CommandeClient update(CommandeClient entity);
	public List<CommandeClient> selectAll();
	public List<CommandeClient> selectAll(String sortField , String sort);
	public CommandeClient getById(Long id);
	public void remove(Long id);
	public CommandeClient findOne(String paramName ,String paramValue );
	public CommandeClient findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
