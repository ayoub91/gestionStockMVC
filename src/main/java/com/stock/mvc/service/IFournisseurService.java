package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Fournisseur;

public interface IFournisseurService {
	
	public Fournisseur save(Fournisseur entity);
	public Fournisseur update(Fournisseur entity);
	public List<Fournisseur> selectAll();
	public List<Fournisseur> selectAll(String sortField , String sort);
	public Fournisseur getById(Long id);
	public void remove(Long id);
	public Fournisseur findOne(String paramName ,String paramValue );
	public Fournisseur findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
