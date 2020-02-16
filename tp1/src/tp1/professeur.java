package tp1;

public class professeur {
    private String  nom;
    private Integer nummerSomme;
    private String  email;
    private String  grade;
	public professeur(String nom, Integer nummerSomme, String email, String grade) {
		super();
		this.nom = nom;
		this.nummerSomme = nummerSomme;
		this.email = email;
		this.grade = grade;
	}
	public professeur() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
    


    @Override
	public String toString() {
		return "professeur [nom=" + nom + ", nummerSomme=" + nummerSomme + ", email=" + email + ", grade=" + grade
				+ "]";
	}
	public void afficher() {
        System.out.println(this.toString());
    }
}
