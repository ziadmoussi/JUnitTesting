
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivreTest {

    @Test
    void testDeuxReferencesMemeObjet() {
        Livre livre1 = new Livre("Java");
        Livre livre2 = livre1;

        assertSame(livre1, livre2);
    }

    @Test
    void testDeuxObjetsDifferents() {
        Livre livre1 = new Livre("Java");
        Livre livre2 = new Livre("Java");

        assertNotSame(livre1, livre2);
    }
}
