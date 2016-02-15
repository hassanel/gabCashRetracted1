package ma.gabCashRetracted.entities;

// Generated 31 janv. 2016 23:21:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Transaction generated by hbm2java
 */
public class Transaction implements java.io.Serializable {

	private Integer idtransaction;
	private Compte compte;
	private Date date;
	private float montant;

	public Transaction() {
	}

	public Transaction(Compte compte, Date date, float montant) {
		this.compte = compte;
		this.date = date;
		this.montant = montant;
	}

	public Integer getIdtransaction() {
		return this.idtransaction;
	}

	public void setIdtransaction(Integer idtransaction) {
		this.idtransaction = idtransaction;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getMontant() {
		return this.montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

}
