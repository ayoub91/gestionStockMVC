package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class LigneVente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
/* declaration des objets*/
	@Id
	@GeneratedValue
	private Long idlignev;
	
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name="idvente")
	private Vente vente;
	


	/* Constructure */
	public LigneVente() {
		super();
	}
	
/* getters and setters */
	public Long getIdlignev() {
		return idlignev;
	}

	public void setIdlignev(Long idlignev) {
		this.idlignev = idlignev;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}
}
