package jeu.bataillenavale;

public class PorteAvions extends Bateau {

    public PorteAvions() {
        super(4);
    }

    @Override
    public String getSymbole() {
        return new String("PA");
    }
}
