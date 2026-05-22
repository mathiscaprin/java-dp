package fr.sdv.factory.Factory;

import fr.sdv.factory.bean.Additif;
import fr.sdv.factory.bean.Allergene;
import fr.sdv.factory.bean.Element;
import fr.sdv.factory.bean.Ingredient;
import fr.sdv.factory.bean.Unite;
import fr.sdv.factory.bean.Type;

public class ElementFactory {
    
    public static Element getInstance(Type type, String nom, double qte, Unite unite) {
        if (type == Type.Additif) {
            return new Additif(nom, qte);
        } else if (type == Type.Allergene) {
            return new Allergene(nom, qte, unite);
        } else if (type == Type.Ingredient) {
            return new Ingredient(nom, qte, unite);
        }
        return null;
    }

}
