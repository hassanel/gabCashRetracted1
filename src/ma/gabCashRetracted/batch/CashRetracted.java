package ma.gabCashRetracted.batch;

import java.util.Date;

public class CashRetracted {
	private int idCompte;
	private float montant;
	private Date date;
	
	
	
	public CashRetracted() {
		super();
	}
	
	public CashRetracted(int idCompte) {
		super();
		this.idCompte = idCompte;
	}

	public CashRetracted(int idCompte, float montant, Date date) {
		super();
		this.idCompte = idCompte;
		this.montant = montant;
		this.date = date;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public float getMontant() {
		return montant;
	}

	public Date getDate() {
		return date;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
