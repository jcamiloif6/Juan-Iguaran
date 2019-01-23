public class Fecha {

    

  private int d, m, a;


  Fecha fecha1 = new Fecha(dd,mm,aa);

  Fecha fecha2 = new Fecha(dd,mm,aa);



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



  Fecha fecha1 = new Fecha(dd,mm,aa);

  Fecha fecha2 = new Fecha(dd,mm,aa);


     int f1a = fecha1.anio(); int f1m = fecha1.mes(); int f1d = fecha1.dia();
 
     int f2a = fecha2.anio(); int f2m = fecha2.mes(); int f2d = fecha2.dia();

 
       if (f1a == f2a){
 
           if (f1m==f2m){
  
              if (f1d==f2d){
     
               return 0;
  
              }else if (f1d<f2d){

                    return 1;
    
            } else {

                    return -1;
 
               }
 
           } else if (f1m<f2m){

                return -1;

            } else {
 
               return 1;

            }
  
      } else if (f1a<f2a) {
 
           return -1;

        }else {
  
          return 1;
  
      }
  
  }

   
 public String toString() {

 
   }

}