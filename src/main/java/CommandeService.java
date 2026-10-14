
public class CommandeService {

    public double calculerTotal(double prix, int quantite) {
        if (prix < 0 || quantite <= 0) {
            throw new IllegalArgumentException();
        }

        return prix * quantite;
    }

    public boolean estEligibleLivraisonGratuite(double total) {
        return total >= 500;
    }
}
