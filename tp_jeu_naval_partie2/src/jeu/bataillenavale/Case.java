package jeu.bataillenavale;

public class Case {

    public boolean etat;
    public Bateau bateau;
    public Case() {
        etat = false;
        bateau = null;
    }

    public Bateau getBateau() {
        return bateau;
    }

    public void setBateau(Bateau bateau) {
        this.bateau = bateau;
    }
}
