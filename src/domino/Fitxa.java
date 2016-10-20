package domino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNEDAM
 */
public class Fitxa {
    
    private int[] valors = new int[2];   
 

    public Fitxa(int[] valors) {
        this.valors = valors;
    }

    public int[] getValors() {
        return valors;
    }
    
    public void cambiarOrientacio(){
        int primer = valors[0];
        int segon = valors[1];
        
        valors[0] = segon;
        valors[1] = primer;
    }

    @Override
    public String toString() {
        return "Fitxa{" + "valors={" + valors[0] + " , "+ valors[1]+"}}";
    }
    
        
}
