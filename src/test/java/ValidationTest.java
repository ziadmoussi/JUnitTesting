import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {

    Validation validation = new Validation();


    @Test
    void testMotDePasseValide() {
        assertTrue(validation.motDePasseValide("Bonjour123"));
    }


    @Test
    void testMotDePasseInvalide() {
        assertFalse(validation.motDePasseValide("bonjour"));
    }


    @Test
    void testMotDePasseNull() {
        assertFalse(validation.motDePasseValide(null));
    }


    @Test
    void testExceptionMotDePasseInvalide() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validation.verifierMotDePasse("bonjour")
        );
    }


    @Test
    void testAucuneExceptionMotDePasseValide() {
        assertDoesNotThrow(
                () -> validation.verifierMotDePasse("Bonjour123")
        );
    }
}
