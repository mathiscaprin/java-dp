package fr.sdv.builder.Builder;

import fr.sdv.builder.beans.Additif;
import fr.sdv.builder.beans.Allergene;
import fr.sdv.builder.beans.Categorie;
import fr.sdv.builder.beans.Ingredient;
import fr.sdv.builder.beans.Marque;
import fr.sdv.builder.beans.Produit;


public class ProduitBuilder {
    
    private Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public Produit get() {
        return this.produit;
    }

    public ProduitBuilder setNom(String nom) {
        this.produit.setNom(nom);
        return this;
    }

    public ProduitBuilder setGrade(String grade) {
        this.produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder setCategorie(String nomCategorie) {
        Categorie categorie = new Categorie(nomCategorie);
        this.produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder setAdditif(String nomAdditif, double qteMilligramme) {
        Additif additif = new Additif(nomAdditif, qteMilligramme);
        this.produit.setAdditif(additif);
        return this;
    }

    public ProduitBuilder setMarque(String nom) {
        Marque marque = new Marque(nom);
        this.produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder setIngredient(String nomIngredient, double qteMilligramme) {
        Ingredient ingredient = new Ingredient(nomIngredient, qteMilligramme);
        this.produit.setIngredient(ingredient);
        return this;
    }

    public ProduitBuilder setAllergene(String nomAllergene, double qteMilligramme) {
        Allergene allergene = new Allergene(nomAllergene, qteMilligramme);
        this.produit.setAllergene(allergene);
        return this;
    };


}
