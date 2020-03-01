package jeu.bataillenavale;

import jeu.bataillenavale.Grille;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Joueur {
    public static final int NB_CROISEURS = 1;
    public static final int NB_DESTROYEURS = 1;
    public static final int NB_PORTEAVIONS = 1;
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
    
    private Bateau type(int taille) {
    	if (taille == 1)
    		return  (Bateau)(new Destroyer());
    	if (taille == 2)
    		return  (Bateau)(new Croiseur());
    	return (Bateau)(new PorteAvions());
	}
    
    public void placementBateaux()
    {
    	   Scanner sc = new Scanner(System.in); 
    	   System.out.println("entrer le type de votre bateau\n 1 : destroyeur\n 2 : croiseur\n 3 : porte-avion ");
    	   int n = sc.nextInt();
    	   Bateau e = type(n);
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
    public void tir(Grille grilleAdverse)
    {
        boolean tirOk = false;
        while (!tirOk) {
            try {
                System.out.println("Indiquez les coordonnees du tir (x puis y) entre 0 et 9");
                int x = saisiePosition();
                int y = saisiePosition();
                grilleAdverse.tir(x, y);
                tirOk = true;
            } catch (IndexOutOfBoundsException | TirCaseInexistante ex) {
                System.out.println("Erreur : " + ex.getMessage());
                System.out.println("Recommencez");
            }
        }
    }
    public static int saisiePosition() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pos = -1;
        while (pos == -1) {
            try {
                pos = Integer.parseInt(reader.readLine());
                if ((pos < 0)||(pos > 9)) {
                    System.out.println("Erreur - entrez une position entre 0 et 9");
                    pos = -1;
                }
            } catch (Exception ex) {
                pos = -1;
                System.out.println("Erreur - entrez une position valide");
            }
        }
        return pos;
    }
}
