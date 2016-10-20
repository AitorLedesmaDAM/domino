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

    public Jugador(String nom) {
        this.nom = nom;
        this.fitxes=new ArrayList();
    }
    
    

    public String getNom() {
        return nom;
    }

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

    
    //?
    public void treureFitxa(Fitxa fitxes){
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "nom=" + nom + ", fitxes=" + fitxes + "}\n";
    }
    

    
    
    
    
    
    
    
    
    
    
}
