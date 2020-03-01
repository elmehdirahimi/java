package jeu.bataillenavale;

import jeu.bataillenavale.Case;

public class Grille {

	static int NB_LIGNES = 10, NB_COLONNES = 10;
	private Case[][] cases = new Case[10][10];
	private Case[][] bateauCases = new Case[10][10];
	
	public Grille() {
		int i;
		int j;
		for (i = 0; i < NB_LIGNES; i++)
		{
			for(j = 0; j < NB_COLONNES; j++)
			{
				cases[i][j] = new Case();
				bateauCases[i][j] = new Case();
				bateauCases[i][j].etat = false;
			}
	
		}
	}

	   
    public void tir(int x, int y) throws TirCaseInexistante{
    	
            if(x < 0 || x > 9 || y < 0 || y > 9) throw new TirCaseInexistante();
            {
          
            	cases[x][y].etat =true;
       
            }
        }
    
    
	public void afficheTirs() {
		int i;
		int j;
		for (i = 0; i < NB_LIGNES; i++)
		{
			for(j = 0; j < NB_COLONNES; j++)
			{
				if(cases[i][j].etat == true && bateauCases[i][j].etat == true)
				{
					System.out.print("x\t");
					
				}
				else {
					System.out.print("-\t");
				}
			}
			System.out.println("");
		}
	}
	
    public void affiche()
    {
    	int i;
		int j;
		for (i = 0; i < NB_LIGNES; i++)
		{
			for(j = 0; j < NB_COLONNES; j++)
			{
	
				if(bateauCases[i][j].etat == true )
					System.out.print("x\t");
				else {
					System.out.print("-\t");
				}
			}
			System.out.println("");
		}
    }

    public void place(Bateau b,int x,int y)
    {
    	int i;
		int j;

		if (b.horizontal)
		{
			for(j = y; j < y + b.getTaille(); j++)
			{
			
				bateauCases[x][j].etat = true;
				this.cases[x][j].setBateau(b);
			}
		}
		else {
			for(i = x; i < x + b.getTaille(); i++)
			{
				bateauCases[i][y].etat = true;
				this.cases[i][y].setBateau(b);
			}
		}

    }


}
