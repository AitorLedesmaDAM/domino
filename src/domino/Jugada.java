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
     * @param una array, jugador de tipu Jugador y un arreyDeque de Fitxa como
     * fitxesTaula.
     * @return
     * Creamos el constructor de jugada, con arrayDeque podremos
     * modificar possicion el principio o el final de arrays.
     * 
     */
    public Jugada(Jugador[] jugador, ArrayDeque<Fitxa> fitxesTaula) {
        this.jugador = jugador;
        this.fitxesTaula = fitxesTaula;
    }
/**
   * @param 
   * @return  jugador
    * Este metodo es para obtener jugador.
*/
    public Jugador[] getJugador() {
        return jugador;
    }
/**
   * @param 
   * @return  fitxesTaula
    * Este metodo es para obtener cartas de la mesa.
*/

    public ArrayDeque<Fitxa> getFitxesTaula() {
        return fitxesTaula;
    }
/**
    *  @param una Fitxa double y su extremo, y otro Fitxa.
    * Este metodo es para double jugada, si algun jugador quiere  
    * poner 2 cartes, el jugador eligira posicion donde quiere poner  
    * cada carta y segun eso las cartas añadimos al principio o al  
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
     * @param fitxa de tipu Fitxa y su extremo
     * @return
     * En este metodo añadimos la carta al principio de arrays fitxes   
     * Taula o al final, segon como quiera el jugador.
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
