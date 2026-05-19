
@Entity
public class Ingredient {

    @Id
    private String Nom;
    private double QteMilligramme;
    public Ingredient() {

    }
    
    public Ingredient(String nomIngredient, double qteMilligramme) {
        super();
        this.Nom = nomIngredient;
        this.QteMilligramme = qteMilligramme;
    }

}