package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.Article;

public interface IArticleService {
	
	public Article save(Article entity);
	public Article update(Article entity);
	public List<Article> selectAll();
	public List<Article> selectAll(String sortField , String sort);
	public Article getById(Long id);
	public void remove(Long id);
	public Article findOne(String paramName ,String paramValue );
	public Article findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
