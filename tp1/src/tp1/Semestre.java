package tp1;
import java.util.Arrays;

import tp1.module;

public class Semestre {
	 private int numero;
	 private module []modules = new module[6];
	    
	public Semestre() {
		// TODO Auto-generated constructor stub
	}

    public Semestre(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public module   get(int i) {
        if (i < 0 || i > 5)
            return null;
        return modules[i];
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void     set(module []modules) {
        this.modules = modules;
    }

    @Override
    public String   toString() {
        return "{" +
                "numero=" + numero +
                ", modules=" + Arrays.toString(modules) +
                "}\n";
    }

    public void     afficher() {
        System.out.println(this.toString());
    }

    public double   getChargeHoraireSemestre(){
    	int i;
    	double sum;
    	
    	sum = 0.0;
    	for(i = 0; i < 5; i++)
    		sum += modules[i].getChargeHoraireModule();
    	return (sum);
    }
}
