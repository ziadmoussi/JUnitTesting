
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteBancaireTest {

    @Test
    void testDepotDe200SurSolde500() {
        CompteBancaire compte = new CompteBancaire(500);

        double resultat = compte.deposer(200);

        assertEquals(700.0, resultat, 0.001);
    }

    @Test
    void testRetraitDe100SurSolde500() {
        CompteBancaire compte = new CompteBancaire(500);

        double resultat = compte.retirer(100);

        assertEquals(400.0, resultat, 0.001);
    }

    @Test
    void testDepotNegatifDeclencheException() {
        CompteBancaire compte = new CompteBancaire(500);

        assertThrows(
                IllegalArgumentException.class,
                () -> compte.deposer(-100)
        );
    }

    @Test
    void testRetraitSuperieurAuSoldeDeclencheException() {
        CompteBancaire compte = new CompteBancaire(500);

        assertThrows(
                IllegalArgumentException.class,
                () -> compte.retirer(600)
        );
    }
}
