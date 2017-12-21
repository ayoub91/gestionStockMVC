package com.stock.mvc.service;

import java.util.List;

import com.stock.mvc.entites.MvtStk;

public interface IMvtStkService {
	
	public MvtStk save(MvtStk entity);
	public MvtStk update(MvtStk entity);
	public List<MvtStk> selectAll();
	public List<MvtStk> selectAll(String sortField , String sort);
	public MvtStk getById(Long id);
	public void remove(Long id);
	public MvtStk findOne(String paramName ,String paramValue );
	public MvtStk findOne(String[] paramNames ,String[] paramValues );
	public int finCountby(String paramName ,String paramValue );

}
