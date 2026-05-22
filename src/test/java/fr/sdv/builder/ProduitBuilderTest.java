package fr.sdv.builder;

import junit.framework.TestCase;
import org.junit.Test;

import fr.sdv.builder.Builder.ProduitBuilder;

public class ProduitBuilderTest extends TestCase {

    @Test
    public void testProduitBuilder() {

        ProduitBuilder builder = new ProduitBuilder();
        builder.setNom("Produit1")
               .setMarque("Marque1")
               .setCategorie("Categorie1")
               .setIngredient("Ingredient1", 10.0)
               .setAllergene("Allergene1", 5.0)
               .setAdditif("Additif1", 2.0);

        assertNotNull(builder);
        assertEquals("Produit1", builder.get().getNom());
        assertEquals("Marque1", builder.get().getMarque().getNom());
        assertEquals("Categorie1", builder.get().getCategorie().getNom());
        assertEquals("Ingredient1", builder.get().getIngredient().getNom());
        assertEquals(10.0, builder.get().getIngredient().getQteMilligramme(), 0.0001);
        assertEquals("Allergene1", builder.get().getAllergene().getNom());
        assertEquals(5.0, builder.get().getAllergene().getQteMilligramme(), 0.0001);
        assertEquals("Additif1", builder.get().getAdditif().getNom());  

    }
}
