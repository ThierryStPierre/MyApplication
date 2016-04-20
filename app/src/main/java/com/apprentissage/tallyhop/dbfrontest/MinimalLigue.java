package com.apprentissage.tallyhop.dbfrontest;

/**
 * Created by thierry on 09/04/16.
 */
public class MinimalLigue {
    private int idLigue;
    private String nom;
    private int idOwner;

    public MinimalLigue(int id, String nomLigue, int owner){
        System.out.print("MinimalLigue(" +id + ", " + nomLigue + ", " + owner + ")\n\n");
        System.out.flush();
        idLigue = id;
        nom = nomLigue;
        idOwner = owner;
    }

    @Override
    public String toString() {
        return "Ligue{" +
                "idLigue=" + idLigue +
                ", nomLigue='" + nom + '\'' +
                ", idGestionnaire='" + idOwner + '\'' +
                '}';
    }

    public int getIdLigue() {
        return idLigue;
    }

    public void setIdLigue(int idLigue) {
        this.idLigue = idLigue;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }
}
