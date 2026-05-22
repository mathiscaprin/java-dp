package fr.sdv.state;

public class Commande_PAIEMENT implements Commande_Etat {
        
    public Commande commande;

    public Commande_PAIEMENT(Commande commande) {
        this.commande = commande;
    }

    public void ajouterProduit(Produit produit){
    }

    public void payer() {
        int nombreProduits = this.commande.produits.length;
        this.commande.montant = nombreProduits * 0.5;
        this.commande.etat = new Commande_PAIEMENT(this.commande);
    }

    public void livrer(String adresse) {
            this.commande.adresse = adresse;
            this.commande.etat = new Commande_EN_LIVRAISON(this.commande);
    }

    public void annuler() {
    }

}
