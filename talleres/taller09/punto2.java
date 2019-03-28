import java.util.HashMap;
public class punto2{
    HashMap<String, String> empresas = new HashMap<String, String>();
     public void empresas() {
    empresas.put("Google", "Estados Unidos");
    empresas.put("La locura", "Colombia");
    empresas.put("Nokia", "Finlandia");
    empresas.put("Sony", "Japon");
    System.out.println(empresas); 
  }
  
  public void mostrar(String empresa){
      System.out.println(empresas.get(empresa));
    }
}
