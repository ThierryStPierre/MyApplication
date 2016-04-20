package com.apprentissage.tallyhop.dbfrontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

import com.apprentissage.tallyhop.dbfrontest.Objets.Competence;
import com.apprentissage.tallyhop.dbfrontest.Objets.Equipe;
import com.apprentissage.tallyhop.dbfrontest.Objets.Joueur;
import com.apprentissage.tallyhop.dbfrontest.Objets.Ligue;
import com.apprentissage.tallyhop.dbfrontest.Objets.LoginObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView displayTextView;
    private DataBaseFront dbF;
    Button listeJoueurs, listeLigues, listeEquipes, listeGestionnaires, ListJoueursParEquipe;
    Button ListJoueursParLigue, LigueParMarqueur, ListLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTextView = (TextView)findViewById(R.id.displayTextView);
        dbF = new DataBaseFront(this);
        listeJoueurs = (Button)findViewById(R.id.listeJoueurs);
        listeLigues = (Button)findViewById(R.id.listeLigues);
        listeEquipes = (Button)findViewById(R.id.listeEquipes);
        listeGestionnaires = (Button)findViewById(R.id.listeGestionnaires);
        ListJoueursParEquipe = (Button)findViewById(R.id.ListJoueursParEquipe);
        ListJoueursParLigue = (Button)findViewById(R.id.ListJoueursParLigue);
        ListLogin = (Button)findViewById(R.id.ListLogin);
        LigueParMarqueur = (Button)findViewById(R.id.LigueParMarqueur);

        listeJoueurs.setOnClickListener(this);
        listeLigues.setOnClickListener(this);
        listeEquipes.setOnClickListener(this);
        listeGestionnaires.setOnClickListener(this);
        ListJoueursParEquipe.setOnClickListener(this);
        ListJoueursParLigue.setOnClickListener(this);
        LigueParMarqueur.setOnClickListener(this);
        ListLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String response = "";
        List<Joueur> list;
        List<Equipe> listE;
        List<Ligue> listL;
        switch (v.getId()) {
            case R.id.listeJoueurs:
                list = dbF.getListJoueurs();
                if(list != null){
                    Iterator<Joueur> iter = list.iterator();
                    while(iter.hasNext()){
                        Joueur  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            case R.id.ListJoueursParEquipe:
                list = dbF.getListJoueursParEquipe(2, 3);
                if(list != null){
                    Iterator<Joueur> iter = list.iterator();
                    while(iter.hasNext()){
                        Joueur  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            case R.id.ListJoueursParLigue:
                list = dbF.getListJoueursParLigue(2);
                if(list != null){
                    Iterator<Joueur> iter = list.iterator();
                    while(iter.hasNext()){
                        Joueur  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            case R.id.listeLigues:
                listL = dbF.getListLigues(-1);
                if(listL != null){
                    Iterator<Ligue> iter = listL.iterator();
                    while(iter.hasNext()){
                        Ligue  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            case R.id.listeEquipes:
                listE = dbF.getListEquipes(3);
                if(listE != null){
                    Iterator<Equipe> iter = listE.iterator();
                    while(iter.hasNext()){
                        Equipe  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            case R.id.listeGestionnaires:
                list = dbF.getListGestionnaires();
                if(list != null){
                    Iterator<Joueur> iter = list.iterator();
                    while(iter.hasNext()){
                        Joueur  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            case R.id.ListLogin: {
                System.out.print("MainActivity ListLogin ");
                System.out.flush();
                LoginObject loginObj = dbF.validateLogin("blavillier", "54321");
                if (loginObj != null) {
                    System.out.print("MainActivity loginObj " + loginObj);
                    System.out.flush();
                    Iterator<Competence> iter = loginObj.getCompetences().iterator();
                    while (iter.hasNext()) {
                        Competence j = iter.next();
                        System.out.print("MainActivity loginObj Competence = " + j + "\n\n");
                        System.out.flush();
                        response += j.toString() + "\n";
                    }
                }
            }
            case R.id.LigueParMarqueur:
                listL = dbF.getListAccreditedLigues(4);
                if(listL != null){
                    Iterator<Ligue> iter = listL.iterator();
                    while(iter.hasNext()){
                        Ligue  j = iter.next();
                        response += j.toString() + "\n";
                    }
                }
                break;
            default:
                break;
        }
        displayTextView.setText(response);
    }
}
