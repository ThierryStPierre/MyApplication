package com.apprentissage.tallyhop.dbfrontest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.apprentissage.tallyhop.dbfrontest.Objets.Equipe;
import com.apprentissage.tallyhop.dbfrontest.Objets.Joueur;
import com.apprentissage.tallyhop.dbfrontest.Objets.Ligue;

import java.util.List;

/**
 * Created by thierry on 12/04/16.
 */
public class DbAccessSqlite extends DbAccess{

    static SQLiteDatabase db = null;

    public DbAccessSqlite(Context cntx){
        if(db == null)
            db = (new DatabaseHelper(cntx)).getReadableDatabase();
    }

    @Override
    public List<Joueur> getListJoueurs() {
        return null;
    }

    @Override
    public List<Joueur> getListJoueursParEquipe(int idEquipe, int idSaison) {
        return null;
    }

    @Override
    public List<Joueur> getListJoueursParLigue(int idLigue) {
        return null;
    }

    @Override
    public List<Ligue> getListLigues(int idGestionnaire) {
        return null;
    }

    @Override
    public List<Equipe> getListEquipes(int idLigue) {
        return null;
    }

    @Override
    public List<Joueur> getListGestionnaires() {
        return null;
    }
}
