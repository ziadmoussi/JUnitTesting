
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandeServiceTest {

    CommandeService service = new CommandeService();


    @Test
    void testCalculerTotal() {
        assertEquals(300.0, service.calculerTotal(100.0, 3), 0.001);
    }

    @Test
    void testTotalDifferent() {
        assertNotEquals(400.0, service.calculerTotal(100.0, 3), 0.001);
    }


    @Test
    void testLivraisonGratuiteEligible() {
        assertTrue(service.estEligibleLivraisonGratuite(500.0));
    }

    @Test
    void testLivraisonGratuiteNonEligible() {
        assertFalse(service.estEligibleLivraisonGratuite(300.0));
    }


    @Test
    void testPrixNegatif() {
        assertThrows(IllegalArgumentException.class,
                () -> service.calculerTotal(-10.0, 2));
    }


    @Test
    void testCommandeValideSansException() {
        assertDoesNotThrow(
                () -> service.calculerTotal(100.0, 2));
    }


    @Test
    void testTousLesScenarios() {
        assertAll(
                () -> assertEquals(200.0, service.calculerTotal(100.0, 2), 0.001),
                () -> assertTrue(service.estEligibleLivraisonGratuite(500.0)),
                () -> assertFalse(service.estEligibleLivraisonGratuite(499.0)),
                () -> assertThrows(IllegalArgumentException.class,
                        () -> service.calculerTotal(100.0, 0))
        );
    }
}
