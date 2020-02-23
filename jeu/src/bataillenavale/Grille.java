package bataillenavale;

public class Grille {
	private Case[][] cases = new Case[10][10];
	

	
	public Grille() {
		int i;
		int j;
		for (i = 0; i < 10; i++)
		{
			for(j = 0; j < 10; j++)
			{
				cases[i][j] = new Case();
			}
	
		}
	}

	public void tir(int x, int y) {
		cases[x][y].etat = true;
	}
	public void afficheTirs() {
		int i;
		int j;
		for (i = 0; i < 10; i++)
		{
			for(j = 0; j < 10; j++)
			{
				if(cases[i][j].etat == true)
					System.out.print("o\t");
				else {
					System.out.print("n\t");
				}
			}
			System.out.println("");
		}
	}
}
