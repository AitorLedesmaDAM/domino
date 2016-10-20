/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayDeque;
import java.util.Random;

/**
 *
 * @author ALUMNEDAM
 */
public class Domino {

    private ArrayDeque<Fitxa> fitxesTaula;
    private Fitxa[] fitxesIniciales;
    private Jugador[] jugadors;
    private int passar;
    private int torn;

    public ArrayDeque<Fitxa> getFitxesTaula() {
        return fitxesTaula;
    }

    public Jugador[] getJugadors() {
        return jugadors;
    }

    public void setPassar(int passar) {
        this.passar = passar;
    }

    public int getTorn() {
        return torn;
    }

    public Fitxa[] getFitxesIniciales() {
        return fitxesIniciales;
    }

    public void crearFitxes() {
        fitxesIniciales = new Fitxa[28];
        int pos = 0;
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                int[] valors = {i, j};
                fitxesIniciales[pos++] = new Fitxa(valors);
            }
        }
    }

      public void repartirFitxes(){
   	 
    	int [] aleatoris = generarAleatoris();
    	int pos = 0;
    	for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 7; j++) {
            	jugadors[i].getFitxes().add(this.fitxesIniciales[aleatoris[pos++]]);
        	}
    	}
   	 
	}

    private int[] generarAleatoris() {
        int[] aleatorio = new int[28];
        boolean[] aux = new boolean[28];
        int num;
        Random rand = new Random();

        for (int i = 0; i < 28;) {
            num = rand.nextInt(28);
            if (!aux[num]) {
                aleatorio[i] = num;
                aux[num] = true;
                i++;
            }
        }
        return aleatorio;

    }

    public void crearJugadors() {
        jugadors = new Jugador[4];
        for (int i = 0; i < 4; i++) {
            jugadors[i] = new Jugador("nom" + (i + 1));
        }
    }

    public void actualitzarJoc() {

    }

    public void comptarPunts() {

    }

    public void primerTorn() {
        for (int i = 0; i < 4; i++) {
            if (jugadors[i].getFitxes().contains(fitxesIniciales[27])) {
                torn = i;
                break;
            }
        }
    }

    public int comptarFitxes() {

        int x = 0;
        for (int i = 0; i < 5; i++) {
            if (jugadors[i].getFitxes().size() > jugadors[i + 1].getFitxes().size()) {
                x = i;

            }

        }
        return x;

    }

}
