package jeu.bataillenavale;

public class ToutesCasesAffecteesException extends Exception {
    public ToutesCasesAffecteesException() {
        super("Toutes les cases du bateau ont deja ete affectees");
    }
}
