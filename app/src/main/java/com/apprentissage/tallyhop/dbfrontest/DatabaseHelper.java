package com.apprentissage.tallyhop.dbfrontest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 201596474 on 2016-03-09.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "gestionContact";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1); }

    @Override
    public void onCreate(SQLiteDatabase db) {
//Création des tables
        String sql = "CREATE TABLE IF NOT EXISTS Partie (" +
                "ID_Partie INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Lieu TEXT, " +
                "Duree Integer, " +
                "Equipe1 Integer, " +
                "Equipe2 Integer, " +
                "Pointage1 Integer, " +
                "Pointage2 Integer)";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS Alignement (" +
                "ID_Joueur Integer, " +
                "ID_Equipe Integer, " +
                "ID_Saison Integer, " +
                "Position text, " +
                "Numero_Chandail Integer)";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS Equipe (" +
                "ID_Equipe INTEGER" +
                "ID_Ligue Integer, " +
                "ID_Ligue text)";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS Personne (" +
                "ID_Personne INTEGER" +
                "Nom text, " +
                "Prenom text)";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS Joueur (" +
                "ID_Joueur INTEGER" +
                "ID_Personne INTEGER" +
                "Nom text, " +
                "Prenom text," +
                "Capitaine INTEGER )";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }
}
