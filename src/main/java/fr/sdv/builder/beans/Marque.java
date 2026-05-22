package fr.sdv.builder.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marque {

    @Id
    private String Nom;

    public Marque() {

    }
    
    public Marque(String nomMarque) {
        super();
        this.Nom = nomMarque;
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