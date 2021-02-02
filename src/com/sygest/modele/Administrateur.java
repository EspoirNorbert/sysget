package com.sygest.modele;

public class Administrateur extends Utilisateur {

	public Administrateur(String nom, String prenom, String adresse, String email, int telephone) {
		super(nom, prenom, adresse, email, telephone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void notifier(Personne p) {
	// TODO Auto-generated method stub
	
    }

}
