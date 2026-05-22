package fr.sdv.state;

public class Commande_ANNULEE implements Commande_Etat {
        
    public Commande commande;

    public void ajouterProduit(Produit produit){
    }

    public void payer() {
    }

    public void livrer(String adresse) {
    }

    public void annuler() {
        throw new IllegalStateException("Impossible d'annuler une commande qui a été payée.");
    }

}
