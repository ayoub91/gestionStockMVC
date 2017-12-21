package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/* declartion des objets */
	@Id
	@GeneratedValue
	private Long idCommandef;
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;
	@ManyToOne()
	@JoinColumn(name="idCommande")
	private CommandeFournisseur commandeFournisseur;
	
	/*Constructure */
	public LigneCommandeFournisseur() {
		super();
	}
	
	/* getters and setters */
	
	
	public Long getIdCommandef() {
		return idCommandef;
	}
	public void setIdCommandef(Long idCommandef) {
		this.idCommandef = idCommandef;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}
	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	
}
