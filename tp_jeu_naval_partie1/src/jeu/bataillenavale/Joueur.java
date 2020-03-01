package jeu.bataillenavale;
import java.util.Scanner; 

import jeu.bataillenavale.Grille;
import java.util.ArrayList;
import java.util.Iterator;


public class Joueur {
    public String nom;
    public Grille grille;
    ArrayList<Bateau> bateaux;
   
    public Joueur(String name){
       grille = new Grille();
       nom = name;
        bateaux = new ArrayList<Bateau>();
    }
    public String getNom(){
        return (nom);
    }

    public Grille getGrille() {
        return grille;
    }
    public void placementBateaux() throws ToutesCasesAffecteesException
    {
    	   Scanner sc = new Scanner(System.in); 
    	   System.out.println("entrer la taile de votre bateau");
    	   int n = sc.nextInt();
    	   Bateau e = new Bateau(n);
    	   int x,y,or;
    	   
        	System.out.println("Enter x :");
            x = sc.nextInt();
            System.out.println("Enter y :");
            y = sc.nextInt();
            System.out.println("1 : horizontal ou  2 : vertical :");
            or = sc.nextInt();
            if (or == 1)
            	e.horizontal = true;
            else {
				e.horizontal = false;
			}
           this.grille.place(e, x, y);
           Case c = new Case();
           c.setBateau(e);
           e.ajouteCase(c);
           this.bateaux.add(e);
    }
    
    public boolean aPerdu()
    {
		  Iterator<Bateau> i = this.bateaux.iterator(); 
	        while (i.hasNext()) 
	        {
	            if (i.next().estCoule() == true)
						return (true);
	        }
	        return (false);
    }
   }