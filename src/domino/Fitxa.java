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

    /**
     * @param arrays de valors tipu int
     * @return 
     * Creamos el constructor de Fitxa, como una array de int.
     */
    public Fitxa(int[] valors) {
        this.valors = valors;
    }

    /**
     * @param
     * @return valors 
     * Este metodo es para obtener el valors.
     */
    public int[] getValors() {
        return valors;
    }

    /**
     * @param 
     * @return 
     * Este metodo estamos cambiando posicion de numeros dentro
     * de fichas, para que en juego cada lado de fichas que sea el mismo
     * numero.
     */
    public void cambiarOrientacio() {
        int primer = valors[0];
        int segon = valors[1];

        valors[0] = segon;
        valors[1] = primer;
    }

    /**
     * Metodo toString para comprobar creacion de fichas.
     * @return Els valors de la fitxa
     */
    @Override
    public String toString() {
        return valors[0] + "|" + valors[1];
    }

}
