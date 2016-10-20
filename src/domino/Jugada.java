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

    public Jugada(Jugador[] jugador, ArrayDeque<Fitxa> fitxesTaula) {
        this.jugador = jugador;
        this.fitxesTaula = fitxesTaula;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public ArrayDeque<Fitxa> getFitxesTaula() {
        return fitxesTaula;
    }
    
    public void jugadaDoble(Fitxa doble1, int extremDoble1, Fitxa doble2){
        fitxesTaula = new ArrayDeque();
        if (extremDoble1 == 0){
            fitxesTaula.addFirst(doble1);
            fitxesTaula.addLast(doble2);
        }else{
            fitxesTaula.addFirst(doble2);
            fitxesTaula.addLast(doble1);
        }        
    }
    
    public void jugadaNormal(Fitxa fitxa, int extrem){
        fitxesTaula = new ArrayDeque();
        if (extrem == 0){
            fitxesTaula.addFirst(fitxa);
        }else{
            fitxesTaula.addLast(fitxa);
        }        
    }
    
    public void passar(){
        jugador = new Jugador();
    }
    
}
