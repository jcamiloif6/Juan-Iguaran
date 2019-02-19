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
    
    public static void ordenar(int[]a){
        int b=0;
    for(int i= 0; i<a.length; i++){//c1+c2*n
      for(int j=0; j<a.length; j++) { //c3+c4*n^2
        if(a[i]<a[j]) {//c5*n^2
        b=a[i];//c6*n^2    
        a[i] = a[j];//c7*n^2
        a[j] = b;//c8*n^2
        }
        }
    }
    for(int k=0; k<a.length; k++){//c9+c10*n
    System.out.println(a[k]);//c11*n
    }
    //T(n)=(c1+c2*n) + (c3+c4*n^2) + (c5*n^2) + (c6*n^2) + (c7*n^2) + (c8*n^2) + (c9+c10*n) + (c11*n)
    //T(n) = O(n*n)
    }
}


