package fr.sdv.builder.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {

    @Id
    private String Nom;

    public Categorie() {

    }
    
    public Categorie(String nomCategorie) {
        super();
        this.Nom = nomCategorie;
    }

    /* getter */
    public String getNom() {
        return Nom;
    }

    /* setter */
    public void setNom(String nom) {
        this.Nom = nom;
    }

}