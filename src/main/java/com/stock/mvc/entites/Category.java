package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idCategory;
	private String code;
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List<Article> article;
	public Category() {
		super();
	}
	public Long getIdCategory() {
		return idCategory;
		}
	
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<Article> getArticle() {
		return article;
	}
	public void setArticle(List<Article> article) {
		this.article = article;
	}
	
	

	
	
}
