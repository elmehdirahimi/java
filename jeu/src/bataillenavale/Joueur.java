package bataillenavale;

/**
 * Cette classe executable gere les tours de jeu pour une bataille navale
 * @author   rahimi el mehdi
 */

public class Joueur {
	private String nom;

	public Joueur(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	public Grille getGrille() {
		Grille grille = new Grille();
		return (grille);
	}
}
