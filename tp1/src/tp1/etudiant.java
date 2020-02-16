package tp1;

public class etudiant {
private String nom;
private Integer nummerEtudiant;

public etudiant() {
	super();
}

public etudiant(String nom, Integer nummerEtudiant) {
	super();
	this.nom = nom;
	this.nummerEtudiant = nummerEtudiant;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Integer getNummerEtudiant() {
	return nummerEtudiant;
}

public void setNummerEtudiant(Integer nummerEtudiant) {
	this.nummerEtudiant = nummerEtudiant;
}

@Override
public String toString() {
	return "etudiant [nom=" + nom + ", nummerEtudiant=" + nummerEtudiant + "]";
}

public String afficher() {
	return (this.toString());
}

}
