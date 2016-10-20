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

    public Fitxa[] getFitxesIniciales() {
        return fitxesIniciales;
    }

    public Jugador[] getJugadors() {
        return jugadors;
    }

    public int getPassar() {
        return passar;
    }

    public void setPassar(int passar) {
        this.passar = passar;
    }
    
    public int getTorn() {
        return torn;
    }

    public void setTorn(int torn) {
        this.torn = torn;
    }
    
    public void repartirFitxes(){
       
        
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
    
    public void crearJugadors(){
        jugadors = new Jugador[4];
        for (int i = 0; i < 14; i++) {
            jugadors[i] = new Jugador("nom" + (i + 1));            
        }
    }
    
    
    
    
    
    
    
}

