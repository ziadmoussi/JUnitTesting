
public class Validation {

    public boolean motDePasseValide(String mdp) {
        if (mdp == null || mdp.length() < 8) {
            return false;
        }

        return mdp.matches(".*[A-Z].*")
                && mdp.matches(".*[0-9].*");
    }

    public void verifierMotDePasse(String mdp) {
        if (!motDePasseValide(mdp)) {
            throw new IllegalArgumentException(
                    "Mot de passe invalide"
            );
        }
    }
}
