import java.util.HashMap;
public class punto1 {
HashMap <String, Integer> people = new HashMap<String, Integer>();

  
  public void insertar(String nombre, int numero) {
      people.put(nombre, numero);
    }
    
    public void mostrar(){
        for (String i : people.keySet()) {
      System.out.println(  i + ":  " + people.get(i));
    }
    }
    
    public void buscar(String nombre){
        System.out.println(people.get(nombre));
    }
    
    
}
