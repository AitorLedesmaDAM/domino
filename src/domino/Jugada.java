/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayDeque;

/**
 *
 * @author ALUMNEDAM
 */
public class Jugada {

    private Jugador[] jugador;
    private ArrayDeque<Fitxa> fitxesTaula;

    /**
     * @param jugador como un array
     * @param fitxesTaula que es una ArrayDeque
     * Creamos el constructor de jugada, con arrayDeque podremos
     * modificar possicion el principio o el final de arrays.
     */
    public Jugada(Jugador[] jugador, ArrayDeque<Fitxa> fitxesTaula) {
        this.jugador = jugador;
        this.fitxesTaula = fitxesTaula;
    }
/**
    * @return  jugador
    * Este metodo es para obtener jugador.
*/
    public Jugador[] getJugador() {
        return jugador;
    }
/**
    * @return  fitxesTaula
    * Este metodo es para obtener fichas que estan en la mesa.
*/

    public ArrayDeque<Fitxa> getFitxesTaula() {
        return fitxesTaula;
    }
/**
    * @param doble1  de tipus Fitxa
    * @param extremDoble1 de tipus int
    * @param doble2 de tipus Fitxa
    * Este metodo es para double jugada, si algun jugador quiere  
    * poner 2 fichas, el jugador eligira posicion donde quiere poner  
    * cada ficha y segun eso las fichas añadimos al principio o al  
    * final.
*/
    public void jugadaDoble(Fitxa doble1, int extremDoble1, Fitxa doble2) {
        fitxesTaula = new ArrayDeque();
        if (extremDoble1 == 0) {
            fitxesTaula.addFirst(doble1);
            fitxesTaula.addLast(doble2);
        } else {
            fitxesTaula.addFirst(doble2);
            fitxesTaula.addLast(doble1);
        }
    }
/**
     * @param fitxa 
     * @param extrem
     * En este metodo añadimos la ficha al principio de arrays fitxesTaula   
     * o al final, segon como quiera el jugador.
*/
    public void jugadaNormal(Fitxa fitxa, int extrem) {
        fitxesTaula = new ArrayDeque();
        if (extrem == 0) {
            fitxesTaula.addFirst(fitxa);
        } else {
            fitxesTaula.addLast(fitxa);
        }
    }
}
