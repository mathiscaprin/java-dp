package fr.sdv.state;

public interface Commande_Etat {

   public void ajouterProduit(Produit produit);

    public void payer() ;

    public void livrer(String adresse) ;

    public void annuler() ;
    


}
