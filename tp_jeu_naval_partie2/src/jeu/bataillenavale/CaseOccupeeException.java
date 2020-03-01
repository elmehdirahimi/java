package jeu.bataillenavale;

public class CaseOccupeeException extends Exception {
    public CaseOccupeeException() {
        super("Les bâteaux se chevauchent");
    }
}
