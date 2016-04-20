package com.apprentissage.tallyhop.dbfrontest;

/**
 * Created by thierry on 09/04/16.
 */
public class MinimalEquipe {
    private int idEquipe;
    private String nom;

    public MinimalEquipe(int id, String nom){
        idEquipe = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "idEquipe =" + idEquipe +
                ", nom ='" + nom + '\'' +
                '}';
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
