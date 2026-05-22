package fr.sdv.state;

public class Commande {

    public double montant;
    public Etat etat;
    public String adresse;
    public Produit[] produits;

    public Commande() {
        this.montant = 0;
        this.etat = Etat.CREATION;
        this.produits = new Produit[0];
    }
    
    public void ajouterProduit(Produit produit) {
        if (this.etat == Etat.CREATION) {
            Produit[] nouveauxProduits = new Produit[this.produits.length + 1];
            System.arraycopy(this.produits, 0, nouveauxProduits, 0, this.produits.length);
            nouveauxProduits[this.produits.length] = produit;
            this.produits = nouveauxProduits;
        } else {
            throw new IllegalStateException("Impossible d'ajouter un produit à une commande qui n'est pas en cours de création.");
        }
    }

    public void payer() {
        if (this.etat == Etat.CREATION) {
            int nombreProduits = this.produits.length;
            this.montant = nombreProduits * 0.5;
            this.etat = Etat.PAIEMENT;
        } 
    }

    public void livrer(String adresse) {
        if (this.etat == Etat.PAIEMENT) {
            this.adresse = adresse;
            this.etat = Etat.EN_LIVRAISON;
        }
    }

    public void annuler() {
        if (this.etat == Etat.CREATION || this.etat == Etat.PAIEMENT) {
            this.montant = 0;
            this.etat = Etat.ANNULEE;
        } else if (this.etat == Etat.EN_LIVRAISON) {
            throw new IllegalStateException("Impossible d'annuler une commande en cours de livraison.");
        } else if (this.etat == Etat.ANNULEE) {
            throw new IllegalStateException("La commande est déjà annulée.");
        }
    }
    



}