public class Punto1
{
    //Este algoritmo da el numero de formas en que se pueden llenar
    // un rectangulo de 2xn cm^2 con rectangulos de 2x1 cm^2 en 
  public static int formasParaLlenarRectangulo(int x) { 
  if(x==0) //C1
    return 1; //C2
  else if(x==1) //C3 
    return 1; //C4
  else
    return formasParaLlenarRectangulo(x-2) + formasParaLlenarRectangulo(x-1); //C5
}
}
