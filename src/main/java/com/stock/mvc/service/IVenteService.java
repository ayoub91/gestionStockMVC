package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Vente;

public interface IVenteService {
	
	public Vente save(Vente entity);
	public Vente update(Vente entity);
	public List<Vente> selectAll();
	public List<Vente> selectAll(String sortField , String sort);
	public Vente getById(Long id);
	public void remove(Long id);
	public Vente findOne(String paramName ,String paramValue );
	public Vente findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
