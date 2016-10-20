
import domino.Domino;
import domino.Fitxa;
import domino.Jugador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNEDAM
 */
public class TestDomino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Domino domino=new Domino();
       domino.crearJugadors();
       
        for (Jugador j:domino.getJugadors()) {
            System.out.println(j);
        }
        
        domino.crearFitxes();
        
        for (Fitxa f: domino.getFitxesIniciales()) {
            System.out.println(f);
        }
    }
    
}
