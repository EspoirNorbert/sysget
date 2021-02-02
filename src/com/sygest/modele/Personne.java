package com.sygest.modele;

import com.sygest.modele.interfaces.INotifier;

public abstract class Personne implements INotifier {

	private String nom ;
	private String prenom ;
	private String adresse ;
	private String email ;
	private int telephone ;

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Personne(String nom, String prenom, String adresse, String email, int telephone) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}
	public Personne() {

		this("","","","",0);
	}

    


}
