
public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException();
        }
        solde += montant;
        return solde;
    }

    public double retirer(double montant) {
        if (montant <= 0 || montant > solde) {
            throw new IllegalArgumentException();
        }
        solde -= montant;
        return solde;
    }

    public double getSolde() {
        return solde;
    }
}
