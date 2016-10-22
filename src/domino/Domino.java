/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author ALUMNEDAM
 */
public class Domino {

    private ArrayDeque<Fitxa> fitxesTaula;
    private Fitxa[] fitxesIniciales;
    private Jugador[] jugadors;
    private int passar = 0;
    private int torn;

    /**
     * @param @return fitxesTaula Metodo para obtener cartes que estan en la
     * mesa
     */
    public ArrayDeque<Fitxa> getFitxesTaula() {
        return fitxesTaula;
    }

    /**
     * @param @return jugadors metodo para obtener jugadores
     */
    public Jugador[] getJugadors() {
        return jugadors;
    }

    /**
     * @param passar que es un int
     * @return metodo set para modificar variable passar.
     */
    public void setPassar(int passar) {
        this.passar = passar;
    }

    /**
     * @param @return torn metodo get para obtener turno.
     */
    public int getTorn() {
        return torn;
    }

    /**
     * @param @return fitxesIniciales metodo get para obtener fitxesIniciales.
     */
    public Fitxa[] getFitxesIniciales() {
        return fitxesIniciales;
    }

    /**
     * Con este metodo estamos creando una arrays de fitxes que tendra 28
     * fitxes. Con dos bucles estamos creando dos numeros para cada carta.
     */
    public void crearFitxes() {
        fitxesIniciales = new Fitxa[28];
        int pos = 0;
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                int[] valors = {i, j};
                fitxesIniciales[pos++] = new Fitxa(valors);
            }
        }
    }

    /**
     * Este metodo es para repartir las cartes entre jugadores. (4 jugadores).
     * Cada jugador tendra 7 cartas aleatorios.
     */
    public void repartirFitxes() {

        int[] aleatoris = generarAleatoris();
        int pos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                jugadors[i].getFitxes().add(this.fitxesIniciales[aleatoris[pos++]]);
            }
        }

    }

    /**
     * return aleatorio Con este metodo estamos generando cartas aleatorios,
     * para poder repartir entre jugadores.
     */
    private int[] generarAleatoris() {
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

    /**
     * Este metodo es para crear 4 jugadores y guardamos en una arrays
     */
    public void crearJugadors() {
        jugadors = new Jugador[4];
        for (int i = 0; i < 4; i++) {
            jugadors[i] = new Jugador("nom" + (i + 1));
        }
    }

    /**
     * Este metodo es para contar los puntos que tiene cada jugador.
     */
    public void comptarPunts() {
        for (int i = 0; i < 4; i++) {
            if (jugadors[i].getFitxes().get(this.)) {
                suma += jugadors[i].getFitxes();
                break;
            }
        }
    }

    /**
     * Es este metodo comprobamos que quien tiene la carte de 6:6. Para saber
     * que jugador va a empezar el juego.
     */
    public void primerTorn() {
        for (int i = 0; i < 4; i++) {
            if (jugadors[i].getFitxes().contains(fitxesIniciales[27])) {
                torn = i;
                break;
            }
        }
    }

    /**
     * @return x 
     * En este metodo contamos las fichas que tiene cada jugador. 
     * Para saber quien gana por las cartes.
     */
    public int comptarFitxes() {

        int numeroFitxes = 0;
        int jugadorMenysFitxes = 0;
        for (int i = 0; i < 4; i++) {
            if (jugadors[i].getFitxes().size() > numeroFitxes) {
                jugadorMenysFitxes = i;
                numeroFitxes = jugadors[i].getFitxes().size();

            }

        }
        return jugadorMenysFitxes;
    }

    
    /**
     * @param numeroJugada se recoje para saber que tipo de jugada ha realizado
     * el jugador (jugada normal, doble o pasar)
     * @param jugadors de tipus Jugador
     * Es para tener actualizado el estado de juego.
     */
    private void actualitzarJoc(int numeroJugada) {

        
        if (numeroJugada == 3) {
            passar++;
        } else {
            passar = 0;
        }
        if (passar == 4) {
            comptarPunts();
            comptarFitxes();
        }

        if (jugadors[torn].getFitxes().isEmpty()) {
            System.out.println("el jugador" + jugadors + "ha ganado la partida!!");
            System.exit(0);            
        } else {
            torn++;
            jugadors.equals(torn);
        }
    }
}
