
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagasinTest {

    Magasin magasin = new Magasin();


    @Test
    void testContenuEtOrdre() {
        List<String> attendu = List.of("PC", "Téléphone", "Tablette");

        assertIterableEquals(attendu, magasin.obtenirProduits());
    }

    @Test
    void testNombreProduits() {
        assertEquals(3, magasin.obtenirProduits().size());
    }


    @Test
    void testPremierProduit() {
        assertEquals("PC", magasin.obtenirProduits().get(0));
    }

    @Test
    void testProduitDifferentImprimante() {
        assertNotEquals("Imprimante", magasin.obtenirProduits().get(0));
    }


    @Test
    void testToutesLesVerifications() {
        List<String> produits = magasin.obtenirProduits();

        assertAll(
                () -> assertEquals(3, produits.size()),
                () -> assertEquals("PC", produits.get(0)),
                () -> assertEquals("Téléphone", produits.get(1)),
                () -> assertEquals("Tablette", produits.get(2)),
                () -> assertNotEquals("Imprimante", produits.get(0))
        );
    }
}
