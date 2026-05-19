import fr.sdv.factory.bean.Unite;
import fr.sdv.factory.bean.ELement;


public class Ingredient extends Element {
    
    public Ingredient() {

    }
    
    public Ingredient(String nomIngredient, double qteMilligramme, Unite unite) {
        super(nomIngredient, qteMilligramme, unite);
    }
    
}
