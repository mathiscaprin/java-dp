package fr.sdv.state;

public class Commande_CREATION implements Commande_Etat {

    private Commande commande;

    public Commande_CREATION(Commande commande) {
        this.commande = commande;
    }

    public void ajouterProduit(Produit produit){
            Produit[] nouveauxProduits = new Produit[this.commande.produits.length + 1];
            System.arraycopy(this.commande.produits, 0, nouveauxProduits, 0, this.commande.produits.length);
            nouveauxProduits[this.commande.produits.length] = produit;
            this.commande.produits = nouveauxProduits;
    }

    public void payer() {
        int nombreProduits = this.commande.produits.length;
        this.commande.montant = nombreProduits * 0.5;
        this.commande.etat = new Commande_PAIEMENT(this.commande);
    }

    public void livrer(String adresse) {
    }

    public void annuler() {
    }


    
}
