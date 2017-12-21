package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.LigneCommandeClient;

public interface ILigneCommandeClientService {
	
	public LigneCommandeClient save(LigneCommandeClient entity);
	public LigneCommandeClient update(LigneCommandeClient entity);
	public List<LigneCommandeClient> selectAll();
	public List<LigneCommandeClient> selectAll(String sortField , String sort);
	public LigneCommandeClient getById(Long id);
	public void remove(Long id);
	public LigneCommandeClient findOne(String paramName ,String paramValue );
	public LigneCommandeClient findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
