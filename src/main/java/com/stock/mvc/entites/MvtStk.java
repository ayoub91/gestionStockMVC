package com.stock.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MvtStk implements Serializable{
	

	private static final long serialVersionUID = 1L;

	public static final int ENTREE =1;
	public static final int SORTIE =2;
	
	@Id
	@GeneratedValue
	private Long IdMvstk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datemvgt;
	
	private BigDecimal quantite;
	private int typeMvt;
	
	@ManyToOne()
	@JoinColumn(name="idarticle")
	private Article article;
	

	public Long getIdMvstk() {
		return IdMvstk;
	}

	public void setIdMvstk(Long idMvstk) {
		IdMvstk = idMvstk;
	}
	
	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	
	
	

}
