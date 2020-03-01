package jeu.bataillenavale;

public class TirCaseInexistante extends Exception {
    public TirCaseInexistante() {
        super("La case dont tu as choisis est inexistante");
    }
}
