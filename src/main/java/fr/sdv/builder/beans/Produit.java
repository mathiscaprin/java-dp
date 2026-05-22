package fr.sdv.builder.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Produit {

    @Id
    private String Nom;
    private String Grade;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIE")
    private Categorie categorie;

    @ManyToMany
    @JoinColumn(name = "ID_ADDITIF")
    private Additif additif;

    @ManyToOne
    @JoinColumn(name = "ID_MARQUE")
    private Marque marque;

    @ManyToMany
    @JoinColumn(name = "ID_INGREDIENT")
    private Ingredient ingredient;

    @ManyToMany
    @JoinColumn(name = "ID_ALLERGENE")
    private Allergene allergene;

    public Produit() {

    }
    
    public Produit(String nomProduit, String gradeProduit, Categorie categorie, Additif additif) {
        super();
        this.Nom = nomProduit;
        this.Grade = gradeProduit;
        this.categorie = categorie;
        this.additif = additif;
    }

    /* getter */
    public String getNom() {
        return Nom;
    }

    /* setter */
    public void setNom(String nom) {
        this.Nom = nom;
    }

    /* getter */
    public String getGrade() {
        return Grade;
    }

    /* setter */
    public void setGrade(String grade) {
        this.Grade = grade;
    }

    /* getter */
    public Categorie getCategorie() {
        return categorie;
    }

    /* setter */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /* getter */
    public Additif getAdditif() {
        return additif;
    }   

    /* setter */
    public void setAdditif(Additif additif) {
        this.additif = additif;
    }

    /* getter */
    public Marque getMarque() {
        return marque;
    }

    /* setter */
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    /* getter */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /* setter */
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    /* getter */
    public Allergene getAllergene() {
        return allergene;
    }

    /* setter */
    public void setAllergene(Allergene allergene) {
        this.allergene = allergene;
    }

}