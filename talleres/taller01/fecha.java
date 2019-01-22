PLANTILLA:   

TUTORIAL DE GIT:
https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab01/Guia%20para%20Laboratorios_Vr%2013.0.pdf

https://github.com/mauriciotoro/ST0245-Eafit/tree/master/talleres/taller01  

/**
 * La clase Punto tiene la intención de representar coordenadas en el espacio y calcular su distancia.
 * 
* @author Mauricio Toro, Andres Paez
 * @version 1
 */
import java.lang.Math;
public class Punto {

    private double x, y;

    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Punto(double xx, double yy) {
        x = xx; y = yy;
    }

    /**
     * Método para obtener la variable global x.
     *
     * @return eje coordenado x
     */
    public double x() {
         return x;
    }

public class Fecha {
    public Fecha() {

    }

    public int dia() {

    }

    public int mes() {

    }

    public int anio() {

    }

    // -1 si esta fecha es anterior a la otra
    // 0 si son iguales
    // 1 si esta fecha es posterior a la otra
    public int comparar(Fecha otra) {

    }

    public String toString() {
        
    }
}