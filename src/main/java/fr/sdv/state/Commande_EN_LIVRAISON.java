package fr.sdv.state;

public class Commande_EN_LIVRAISON implements Commande_Etat {
        
    public Commande commande;

    public Commande_EN_LIVRAISON(Commande commande) {
        this.commande = commande;
    }

    public void ajouterProduit(Produit produit){
        return ;
    }

    public void payer() {
        return;
    }

    public void livrer(String adresse) {
        return ;
    }

    public void annuler() {
        throw new IllegalStateException("Impossible d'annuler une commande en cours de livraison.");
    }

}
