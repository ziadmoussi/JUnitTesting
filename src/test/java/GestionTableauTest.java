
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GestionTableauTest {

    GestionTableau gestion = new GestionTableau();


    @Test
    void testContenuTableau() {
        int[] notesAttendu = {12, 15, 18, 20};
        assertArrayEquals(notesAttendu, gestion.obtenirNotes());
    }


    @Test
    void testSommeEgale65() {
        assertEquals(65, gestion.calculerSomme());
    }


    @Test
    void testSommeDifferente60() {
        assertNotEquals(60, gestion.calculerSomme());
    }


    @Test
    void testEchecVolontaire() {
        assertEquals(70, gestion.calculerSomme());
    }
}
