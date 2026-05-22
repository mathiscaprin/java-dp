package fr.sdv.state;

public class Commande {

    public double montant;
    public Commande_Etat etat;
    public String adresse;
    public Produit[] produits;

    public Commande() {
        this.montant = 0;
        this.etat = new Commande_CREATION(this);
        this.produits = new Produit[0];
    }
    
    public void ajouterProduit(Produit produit) {
        etat.ajouterProduit(produit);
    }

    public void payer() {
        etat.payer();
    }

    public void livrer(String adresse) {
        etat.livrer(adresse);
    }

    public void annuler() {
        etat.annuler();
    }
    



}