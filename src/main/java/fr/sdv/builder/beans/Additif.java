package fr.sdv.builder.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Additif {

    @Id
    private String Nom;
    private double QteMilligramme;


    public Additif() {

    }
    
    public Additif(String nomAdditif, double qteMilligramme) {
        super();
        this.Nom = nomAdditif;
        this.QteMilligramme = qteMilligramme;
    }


    /* getter */
    public String getNom() {
        return Nom;
    }
    
    public double getQteMilligramme() {
        return QteMilligramme;
    }

    /* setter */
    public void setNom(String nom) {
        this.Nom = nom;
    }

    public void setQteMilligramme(double qteMilligramme) {
        this.QteMilligramme = qteMilligramme;
    }
}