import fr.sdv.factory.bean.Element;

public class ElementFactory {
    
    public static Element getInstance(Type type, String nom, double qte, Unite unite) {
        switch (type) {
            case Ingredient:
                return new Ingredient(nom, qte, unite);
            case Allergene:
                return new Allergene(nom, qte, unite);
            case Additif:
                return new Additif(nom, qte, unite);
            default:
                throw new IllegalArgumentException("Type inconnu");
        }
    }

}
