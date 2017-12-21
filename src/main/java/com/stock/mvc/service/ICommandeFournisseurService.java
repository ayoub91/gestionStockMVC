package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.CommandeFournisseur;

public interface ICommandeFournisseurService {
	
	public CommandeFournisseur save(CommandeFournisseur entity);
	public CommandeFournisseur update(CommandeFournisseur entity);
	public List<CommandeFournisseur> selectAll();
	public List<CommandeFournisseur> selectAll(String sortField , String sort);
	public CommandeFournisseur getById(Long id);
	public void remove(Long id);
	public CommandeFournisseur findOne(String paramName ,String paramValue );
	public CommandeFournisseur findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
