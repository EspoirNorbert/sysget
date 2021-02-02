package com.sunushop.dao.impl;

import java.util.List;
import com.sygest.dao.IDao;
import com.sygest.exceptions.DAOException;
import com.sygest.modele.Utilisateur;

public class UtilisateurImpl implements IDao<Utilisateur> {

	@Override
	public void create(Utilisateur entity) throws DAOException {
		// TODO Auto-generated method stub
	}

	@Override
	public Utilisateur read(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> list() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utilisateur entity) throws DAOException {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int id) throws DAOException {
		// TODO Auto-generated method stub	
	}
	
	public Utilisateur rechercher(String nom) throws DAOException {
		// TODO Auto-generated method stub	
		return null;
	}
	
	public void activer() throws DAOException {
		// TODO Auto-generated method stub	
	}
	
    public void desactiver() throws DAOException {
    	// TODO Auto-generated method stub	
	}
    
    public boolean getConnexion(String login , String mdp) throws DAOException{
    	// TODO Auto-generated method stub	
    	return false;
    }
}
