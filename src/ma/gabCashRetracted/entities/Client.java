package ma.gabCashRetracted.entities;

// Generated 31 janv. 2016 23:21:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client implements java.io.Serializable {

	private Integer idClient;
	private String nom;
	private String prenom;
	private String nomDUtilisateur;
	private String motDePasse;
	private Set<Compte> comptes = new HashSet<Compte>(0);

	public Client() {
	}

	public Client(String nom, String prenom, String nomDUtilisateur,
			String motDePasse) {
		this.nom = nom;
		this.prenom = prenom;
		this.nomDUtilisateur = nomDUtilisateur;
		this.motDePasse = motDePasse;
	}

	public Client(String nom, String prenom, String nomDUtilisateur,
			String motDePasse, Set<Compte> comptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.nomDUtilisateur = nomDUtilisateur;
		this.motDePasse = motDePasse;
		this.comptes = comptes;
	}

	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNomDUtilisateur() {
		return this.nomDUtilisateur;
	}

	public void setNomDUtilisateur(String nomDUtilisateur) {
		this.nomDUtilisateur = nomDUtilisateur;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Set<Compte> getComptes() {
		return this.comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

}