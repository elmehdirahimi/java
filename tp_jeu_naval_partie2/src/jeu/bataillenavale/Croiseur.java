package jeu.bataillenavale;

public class Croiseur extends Bateau {
    public Croiseur() {
        super(3);
    }

    @Override
    public String getSymbole() {
        return new String("Cr");
    }
}
