import java.util.concurrent.TimeUnit;
/**
 * Write a description of class recur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class taller5
{
 public static void main(String[] args){
       for (int i = 1; i <= 20; i++){
           long start = System.currentTimeMillis();
           suma(new int[i]);
           long end = System.currentTimeMillis();
           System.out.println(end-start);
       }
    }
    
    public static int suma (int[]array){
      int suma = 0; // C1
    	for (int i=0; i<array.length;i++)  //C2 * n     
           suma += array[i];// C3 * n
      return suma;// C4
        // T(n) = C1 + C2 * n + C3 * n + C4
        // T(n) = O(n)
    }
}


