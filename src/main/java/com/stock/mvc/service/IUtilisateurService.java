package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Utilisateur;

public interface IUtilisateurService {
	
	public Utilisateur save(Utilisateur entity);
	public Utilisateur update(Utilisateur entity);
	public List<Utilisateur> selectAll();
	public List<Utilisateur> selectAll(String sortField , String sort);
	public Utilisateur getById(Long id);
	public void remove(Long id);
	public Utilisateur findOne(String paramName ,String paramValue );
	public Utilisateur findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
