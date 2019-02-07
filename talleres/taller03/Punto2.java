public class Punto2
{
private static void permutaciones(String loQueLlevo, String loQueFalta){
      int n = loQueFalta.length();   
      if (n == 0){
        System.out.println(loQueLlevo);
      } else
           for (int i = 0 ; i < n ; i++){
             permutaciones(loQueLlevo + loQueFalta.charAt(i), loQueFalta.substring(0, i) + loQueFalta.substring(i+1,n));
           }
    }
}