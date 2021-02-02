package com.sygest.modele;

public  abstract class  Utilisateur extends Personne  {
	 
	public String login ;
	public String password ;
	public String dateNaissance ; 
	
	public Utilisateur(String nom, String prenom, String adresse, String email, int telephone) {
		super(nom, prenom, adresse, email, telephone);
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String nom, String prenom, String adresse, String email, int telephone, String login,String password) {
		super(nom, prenom, adresse, email, telephone);
		this.login = login;
		this.password = password;
	}

	public Utilisateur(String nom, String prenom, String adresse, String email, int telephone, String dateNaissance) {
		super(nom, prenom, adresse, email, telephone);
		this.dateNaissance = dateNaissance;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	public boolean authentifier(String login,String mdp) {
		return false;
	}

}
