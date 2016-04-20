package com.apprentissage.tallyhop.dbfrontest;

import com.apprentissage.tallyhop.dbfrontest.Objets.Equipe;
import com.apprentissage.tallyhop.dbfrontest.Objets.Joueur;
import com.apprentissage.tallyhop.dbfrontest.Objets.Ligue;
import com.apprentissage.tallyhop.dbfrontest.Objets.LoginObject;

import java.util.List;

/**
 * Created by thierry on 12/04/16.
 */
public  abstract class DbAccess {

    abstract public List<Joueur> getListJoueurs();
    abstract public List<Joueur> getListJoueursParEquipe(int idEquipe, int idSaison);
    abstract public List<Joueur> getListJoueursParLigue(int idLigue);
    abstract public List<Ligue> getListLigues(int idGestionnaire);
    abstract public List<Ligue> getListAccreditedLigues(int idMarqueur);
    abstract public List<Equipe> getListEquipes(int idLigue);
    abstract public List<Joueur> getListGestionnaires();
    abstract public LoginObject validateLogin(String user, String pass);
}
