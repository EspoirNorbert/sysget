package com.sygest.modele;

import com.sygest.modele.interfaces.INotifier;

public class Demandeur extends Personne implements INotifier {

	public Demandeur(String nom, String prenom, String adresse, String email, int telephone) {
		super(nom, prenom, adresse, email, telephone);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void notifier(Personne p) {
	// TODO Auto-generated method stub
	
    }

}
