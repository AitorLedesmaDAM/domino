/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class Jugador {
    
    private String nom;
    private ArrayList<Fitxa> fitxes; 

    /**
   * @param Nom de jugador de tipu String
   * @return  
    * Es el constructor de Jugador, iniciamos nombre de jugador y
    * ArrayList de fitxes.
*/
    public Jugador(String nom) {
        this.nom = nom;
        this.fitxes=new ArrayList();
    }
    
    
/**
   * @param 
   * @return  nom
    * Este metodo es para obtener nombre de jugador.
*/
    public String getNom() {
        return nom;
    }

    /**
   * @param 
   * @return  fitxes
    * Este metodo es para obtener fitxes.
*/
    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

    /**
   * Metodo toString para comprobar creacion de Jugadores.
*/
    @Override
    public String toString() {
        return "Jugador{" + "nom=" + nom + ", fitxes=" + fitxes + "}\n";
    }
    

    
    
    
    
    
    
    
    
    
    
}
