package jeu.bataillenavale;

public class Destroyer extends Bateau {

    public Destroyer() {
        super(2);
    }

    @Override
    public String getSymbole() {
        return new String("D");
    }
}
