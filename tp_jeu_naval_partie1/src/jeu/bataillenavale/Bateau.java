package jeu.bataillenavale;

import java.util.HashSet;
import java.util.Iterator;

public class Bateau {
    private int taille;
    public boolean horizontal;
    HashSet<Case> cases;

  
    public Bateau(int taille) {
        this.taille = taille;
        cases = new HashSet<Case>();
    }
    
    public Boolean estCoule() {
  	  Iterator<Case> i = this.cases.iterator(); 
        while (i.hasNext()) 
        {
            if (i.next().etat == true)
					return (true);
        }
        return (false);
	}
    
    public int getTaille() {
        return taille;
    }
    public void ajouteCase(Case c) throws ToutesCasesAffecteesException {
        if (cases.size() == taille) throw new ToutesCasesAffecteesException();
        cases.add(c);
    }
}
