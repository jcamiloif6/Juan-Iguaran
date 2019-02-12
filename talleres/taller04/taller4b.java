import java.util.concurrent.TimeUnit;
public class taller4b {
 public static int f(int i){
    return i <= 1 ? i : f(i-1)+f(i-2);
}
public static void main(String[] args){
  for(int i = 18; i <= 38; i++){
         long start = System.currentTimeMillis();
         f(i);
         long tiempo =  System.currentTimeMillis() - start;
         System.out.println(tiempo);
    }
}
}
