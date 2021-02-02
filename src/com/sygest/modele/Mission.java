package com.sygest.modele;

public class Mission extends TacheExterne {

	private String destination ;
	private Prise prise ;
	private Transport transport ;

	public Mission(String libelle, String objet, String date, int heureDebut, int heureFin, String degres,String statut) {
		super(libelle, objet, date, heureDebut, heureFin, degres, statut);
	}
	
	public Mission(String libelle, String objet, String date, int heureDebut, int heureFin, String degres,String statut,String destination,Prise prise,Transport transport) {
	   super(libelle, objet, date, heureDebut, heureFin, degres, statut);
	   this.destination = destination;
	   this.prise = prise;
	   this.transport = transport;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Prise getPrise() {
		return prise;
	}

	public void setPrise(Prise prise) {
		this.prise = prise;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	
}
