package fr.sdv.factory.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Element {

    @Id
    private String Nom;
    private double Qte;
    private Unite Unite;
    


    public Element() {

    }
    
    public Element(String nomElement, double qte, Unite unite) {
        super();
        this.Nom = nomElement;
        this.Qte = qte;
        this.Unite = unite;
    }

    /* Getter */
    public String getNom() {
        return Nom;
    }

    public double getQte() {
        return Qte;
    }

    public Unite getUnite() {
        return Unite;
    }

    /* Setter */
    public void setNom(String nom) {
        this.Nom = nom;
    }

    public void setQte(double qte) {
        this.Qte = qte;
    }

    public void setUnite(Unite unite) {
        this.Unite = unite;
    }
}