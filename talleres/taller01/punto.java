 

/**
 * La clase Punto tiene la intenci�n de representar coordenadas en el espacio y calcular su distancia.
 * Juan Iguaran, Santiago Vanegas
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
     * M�todo para obtener la variable global x.
     *
     * @return eje coordenado x
     */
    public double x() {
         return x;
    }

    /**
     * M�todo para obtener la variable global y.
     *
     * @return eje coordenado y
     */
    public double y() {
        return y;
    }

    /**
     * M�todo para obtener el radio polar, en este caso se puede obtener por medio del teorema de pit�goras.
     * 
     *
     * @return radio polar
     *
     * @see <a href="http://mathworld.wolfram.com/PolarCoordinates.html"> Ver m�s <a/>
     */
    
    public double radioPolar() {
         // la hipotenusa
         // raiz de x al cuadrado + y  cuadrado 
         return Math.sqrt(x*x+y*y);/la hipotenusa
        // raiz de x al cuadrado + y al cuadrado
      return Math.squrt(x*x+y*y);
    }


    /**
     * M�todo para obtener el �ngulo polar, en este caso se puede obtener por medio de la tangente inversa.
     * 
     *
     * @return angulo polar
     *
     * @see <a href="http://mathworld.wolfram.com/PolarCoordinates.html"> Ver m�s <a/>
     */
    public double anguloPolar() {
        return Math.arctan(y/x);          return Math.arctan(y/x);
    }

    /**
     * M�todo para obtener la distacia euclidiana. La distacia
     * euclidiana o eucl�dea es la distancia "ordinaria" (que se medir�a con una regla) entre 
     * dos puntos de un espacio eucl�deo, la cual se deduce a partir del teorema de Pit�goras.
     * En otras palabras es halla el radio polar a la diferencia entre los dos puntos.
     *
     *
     *
     * @return distancia euclidiana (radio polar a la diferencia de dos puntos)
     *
     * @param otro Este par�metro hace referencia a otro Punto en el espacio con es cual se desea
     * comparar el Punto desde el cual fue llamado.
     * @see <a href="http://mathworld.wolfram.com/Distance.html"> Ver m�s <a/>
     */
  
    public double distanciaEuclidiana(Punto otro) {  
      Math.sqrt((x-otro.x())*(x-otro.x()) + (y - otro.y())*(y - otro.y()));
    }
}