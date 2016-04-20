package com.apprentissage.tallyhop.dbfrontest;

/**
 * Created by thierry on 09/04/16.
 */
public class MinimalJoueur {
    private int idJoueur;
    private String nom;
    private String prenom;
//    private boolean capitaine;
//    private boolean pointeur;
//    private boolean gestionnaire;

    public MinimalJoueur(int idJoueur, String nom, String prenom /*,
                  boolean capitaine, boolean pointeur, boolean gestionnaire*/) {
        this.idJoueur = idJoueur;
        this.nom = nom;
        this.prenom = prenom;
//        this.capitaine = capitaine;
//        this.pointeur = pointeur;
//        this.gestionnaire = gestionnaire;
    }

    @Override
    public String toString() {
        return "Joueur{ " +
                "idJoueur=" + idJoueur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
/*                ", capitaine=" + capitaine +
                ", pointeur=" + pointeur +
                ", gestionnaire=" + gestionnaire +*/
                " }";
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
/*
    public boolean isCapitaine() {
        return capitaine;
    }

    public void setCapitaine(boolean capitaine) {
        this.capitaine = capitaine;
    }

    public boolean isPointeur() {
        return pointeur;
    }

    public void setPointeur(boolean pointeur) {
        this.pointeur = pointeur;
    }

    public boolean isGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(boolean gestionnaire) {
        this.gestionnaire = gestionnaire;
    }
*/


}
