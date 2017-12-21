package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Vente  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idvente;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente; 
	
	@OneToMany(mappedBy="vente")
	private List<LigneVente> ligneVentes;


	/* constructure */
	public Vente() {
		super();
	}

	/* getters and setters */

	public Long getIdvente() {
		return idvente;
	}


	public void setIdvente(Long idvente) {
		this.idvente = idvente;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Date getDateVente() {
		return dateVente;
	}


	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}


	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}


	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
	
}
