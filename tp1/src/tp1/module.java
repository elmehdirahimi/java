package tp1;
import tp1.professeur;

public class module {

	   private String      libelle;
	    private Integer     coefficient;
	    private Integer     nbrHeures;
	    private professeur  enseignent;
	    private double heuresCours;
	    private double heuresTD;
	    double heuresTP;
	    
	    
	    
	    
		public module() {
			super();
			// TODO Auto-generated constructor stub
		}
		public module(String libelle, Integer coefficient, Integer nbrHeures, professeur enseignent) {
			super();
			this.libelle = libelle;
			this.coefficient = coefficient;
			this.nbrHeures = nbrHeures;
			this.enseignent = enseignent;
		}
		
		public String getLibelle() {
			return libelle;
		}
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}
		public Integer getCoefficient() {
			return coefficient;
		}
		public void setCoefficient(Integer coefficient) {
			this.coefficient = coefficient;
		}
		public Integer getNbrHeures() {
			return nbrHeures;
		}
		public void setNbrHeures(Integer nbrHeures) {
			this.nbrHeures = nbrHeures;
		}
		public professeur getEnseignent() {
			return enseignent;
		}
		public void setEnseignent(professeur enseignent) {
			this.enseignent = enseignent;
		}
		@Override
		public String toString() {
			return "module [libelle=" + libelle + ", coefficient=" + coefficient + ", nbrHeures=" + nbrHeures
					+ ", enseignent=" + enseignent + "]";
		}
		public void afficher() {
	        System.out.println(this.toString());
	    }
		 public double getChargeHoraireModule() {
		        return (heuresCours * 1.5 + heuresTD + heuresTP * 0.75);
		    }
}
