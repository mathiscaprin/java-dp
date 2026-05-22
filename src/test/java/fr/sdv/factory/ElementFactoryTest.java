package fr.sdv.factory;


import fr.sdv.factory.Factory.ElementFactory;
import fr.sdv.factory.bean.Additif;
import fr.sdv.factory.bean.Allergene;
import fr.sdv.factory.bean.Element;
import fr.sdv.factory.bean.Ingredient;
import fr.sdv.factory.bean.Type;
import fr.sdv.factory.bean.Unite;
import junit.framework.TestCase;

public class ElementFactoryTest extends TestCase{

    public void testGetInstance() {
        Element ingredient = ElementFactory.getInstance(Type.Ingredient, "Sucre", 100, Unite.MILLI_GRAMMES);
        assertTrue(ingredient instanceof Ingredient);
        assertEquals("Sucre", ingredient.getNom());
        assertEquals(100, ingredient.getQte());
        assertEquals(Unite.MILLI_GRAMMES, ingredient.getUnite());

        Element allergene = ElementFactory.getInstance(Type.Allergene, "Gluten", 50, Unite.MILLI_GRAMMES);
        assertTrue(allergene instanceof Allergene);
        assertEquals("Gluten", allergene.getNom());
        assertEquals(50, allergene.getQte());
        assertEquals(Unite.MILLI_GRAMMES, allergene.getUnite());

        Element additif = ElementFactory.getInstance(Type.Additif, "E100", 10, Unite.MILLI_GRAMMES);
        assertTrue(additif instanceof Additif);
        assertEquals("E100", additif.getNom());
        assertEquals(10, additif.getQte());
        assertEquals(Unite.MILLI_GRAMMES, additif.getUnite());
    }
    
}
