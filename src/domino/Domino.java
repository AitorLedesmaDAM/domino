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

    private ArrayDeque<Fitxa> fitxesDeJugador;
    private Fitxa[] fitxesIniciales;
    private Jugador[] jugadors;
    private int comptPassar;
    private int torn;

    public ArrayDeque<Fitxa> getFitxesDeJugador() {
        return fitxesDeJugador;
    }

    public Fitxa[] getFitxesIniciales() {
        return fitxesIniciales;
    }

    public Jugador[] getJugadors() {
        return jugadors;
    }

    public int getComptPassar() {
        return comptPassar;
    }

    public int getTorn() {
        return torn;
    }
    
    
    
    
    
    
    
    
    public void crearFitxes(){
        fitxesIniciales = new Fitxa[28];
    }
    
    public void repartirFitxes(){
        
        int [] aleatoris = generaraAleatoris();
        int pos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                ///jugador.[i].getFitxes().add(this.);
                
                
            }
        }
        
    }
    
    private int[] generaraAleatoris() {
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
    
    
}

