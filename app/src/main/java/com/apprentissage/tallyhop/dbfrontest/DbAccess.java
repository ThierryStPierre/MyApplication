package com.apprentissage.tallyhop.dbfrontest;

import java.util.List;
import com.apprentissage.tallyhop.dbfrontest.Objets.Equipe;
import com.apprentissage.tallyhop.dbfrontest.Objets.Joueur;
import com.apprentissage.tallyhop.dbfrontest.Objets.Ligue;

/**
 * Created by thierry on 12/04/16.
 */
public  abstract class DbAccess {

    abstract public List<Joueur> getListJoueurs();
    abstract public List<Joueur> getListJoueursParEquipe(int idEquipe, int idSaison);
    abstract public List<Joueur> getListJoueursParLigue(int idLigue);
    abstract public List<Ligue> getListLigues(int idGestionnaire);
    abstract  public List<Equipe> getListEquipes(int idLigue);
    abstract public List<Joueur> getListGestionnaires();
}
