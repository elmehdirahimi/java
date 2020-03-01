package jeu.bataillenavale;
import java.util.Random;
public class JoueurOrdi extends Joueur {

    public JoueurOrdi() {
    	super("mehdi");
        this.nom = "Ordinateur";
    }

    public void placementBateaux()
    {

    }

    public void tir(Grille grilleAdverse){
        Random rand = new Random();
        int x = rand.nextInt(10);//Range entre 0 et 9
        int y = rand.nextInt(10);
        try {
            grilleAdverse.tir(x, y);
        }catch (TirCaseInexistante e){
            //Impossible puisqu'on a toujours un random entre 0 et 9
        }
    }
}
