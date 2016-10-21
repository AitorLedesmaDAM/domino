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
     * @param arrays de valos tipu int
     * @return Creamos el constructor de Fitxa, con una arrays de int.
     */
    public Fitxa(int[] valors) {
        this.valors = valors;
    }

    /**
     * @param @return valors Este metodo es para obtener el valor.
     */
    public int[] getValors() {
        return valors;
    }

    /**
     * @param 
     * @return 
     * Este metodo estamos cambiando posicion de numeros dentro
     * de cartas, para que en juego cada lado de cartas que sean el mismo
     * numero.
     */
    public void cambiarOrientacio() {
        int primer = valors[0];
        int segon = valors[1];

        valors[0] = segon;
        valors[1] = primer;
    }

    /**
     * Metodo toString para comprobar creacion de fitxes.
     */
    @Override
    public String toString() {
        return "Fitxa{" + "valors={" + valors[0] + " , " + valors[1] + "}}";
    }

}
