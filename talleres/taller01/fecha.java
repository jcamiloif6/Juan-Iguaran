public class Fecha {

  private int d, m, a;
   
    public Fecha(int dd, int mm, int aa) {
     d = dd; m = mm; a = aa;
    }

    public int dia() {
      return d;
    }

    public int mes() {
      return m;
    }

    public int anio() {
      return a;
    }

    // -1 si esta fecha es anterior a la otra
    // 0 si son iguales
    // 1 si esta fecha es posterior a la otra
    public int comparar(Fecha otra) {
      
    }

    public String toString() {
        
    }
}