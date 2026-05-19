
@Entity
public class Categorie {

    @Id
    private String Nom;

    public Categorie() {

    }
    
    public Categorie(String nomCategorie) {
        super();
        this.Nom = nomCategorie;
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
    public List<Produit> getProduits() {
        return produits;
    }

    /* setter */
    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }


}