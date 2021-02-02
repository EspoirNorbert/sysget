package com.sygest.modele;

public abstract class Tache {
 
	private String libelle ;
	private String objet ;
	private String date ;
	private int heureDebut ;
	private int heureFin ;
	private String degres ;
	private String statut ;
	
	public Tache(String libelle, String objet, String date, int heureDebut, int heureFin, String degres,String statut) {
		this.libelle = libelle;
		this.objet = objet;
		this.date = date;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.degres = degres;
		this.statut = statut;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(int heureDebut) {
		if(heureDebut > 0 && heureDebut < 24)
		this.heureDebut = heureDebut;
	}

	public int getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(int heureFin) {
		if(heureDebut > 0 && heureDebut < 24)
		this.heureFin = heureFin;
	}

	public String getDegres() {
		return degres;
	}

	public void setDegres(String degres) {
		this.degres = degres;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
}
