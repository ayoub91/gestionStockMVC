package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.LigneVente;

public interface ILigneVenteService {
	
	public LigneVente save(LigneVente entity);
	public LigneVente update(LigneVente entity);
	public List<LigneVente> selectAll();
	public List<LigneVente> selectAll(String sortField , String sort);
	public LigneVente getById(Long id);
	public void remove(Long id);
	public LigneVente findOne(String paramName ,String paramValue );
	public LigneVente findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
