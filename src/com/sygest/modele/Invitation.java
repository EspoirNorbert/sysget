package com.sygest.modele;

public class Invitation extends TacheExterne {
   
	private TypeInvitation type ;
	
	public Invitation(String libelle, String objet, String date, int heureDebut, int heureFin, String degres,
			String statut) {
		super(libelle, objet, date, heureDebut, heureFin, degres, statut);
		// TODO Auto-generated constructor stub
	}
	
	public TypeInvitation getType() {
		return type;
	}
	
	public void setType(TypeInvitation type) {
		this.type = type;
	}

}
