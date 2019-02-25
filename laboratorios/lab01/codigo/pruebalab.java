
/**
 * Write a description of class pruebalab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pruebalab
{
int solucionar (int n, int a, int b, int c) {
 if (n == 0 || (n < a && n < b && n < c))
 return 0;
 int res = solucionar(n-1, a ,b, c) + 1;
 res = Math.max(res,solucionar(n-1,a,b,c));
 res = Math.max(res,solucionar(n-1,a,b,c));
 return res; }

 public int formas(int n){
 if(n <= 2) return n;
 return formas(n-1) +
 formas(n-2);
 }
 
  public int suma(String n) {
 return sumaAux(n, 0);
 }

 private int sumaAux(String n, int i){
 if (i >= n.length()) {
 return 0;
 }
 if(i + 1 < n.length() &&
 n.charAt(i) == n.charAt(i + 1)){
 return i=i+2;
 }
 return (n.charAt(i) - '0') + sumaAux(n,i+1);
}

int cuantas(int K, int[] v, int n){
 if(K == 0){
 return 1;
 }
 boolean imposible;
 imposible = n <= 0 && K >= 1;
 imposible = imposible || K < 0;
 if(imposible){
 return 0;
 }
 int ni = cuantas(K, v, n - 1);
 int nj = cuantas(K - v[n-1], v, n);
 int suma = ni + nj;
 return suma;
 }


}
