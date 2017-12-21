package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	public List<LigneCommandeFournisseur> selectAll();
	public List<LigneCommandeFournisseur> selectAll(String sortField , String sort);
	public LigneCommandeFournisseur getById(Long id);
	public void remove(Long id);
	public LigneCommandeFournisseur findOne(String paramName ,String paramValue );
	public LigneCommandeFournisseur findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
