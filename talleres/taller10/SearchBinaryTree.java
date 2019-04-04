

//juan iguaran
public class SearchBinaryTree{
    Nodo root;
    
     public void insertar (int data)
      {
          Nodo nodo;
          nodo = new Nodo ();
          nodo.data = data;
          nodo.izq = null;
          nodo.der = null;
          if (root == null)
              root = nodo;
          else
          {
              Nodo anterior = null, reco;
              reco = root;
              while (reco != null)
              {
                  anterior = reco;
                  if (data < reco.data)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (data < anterior.data)
                  anterior.izq = nodo;
              else
                  anterior.der = nodo;
          }
      }
      
      public boolean buscar(int a){
          Nodo reco = root;
          while(reco != null){
              if(a == reco.data){
                  return true;
                }
                else if(a > reco.data){
                    reco = reco.der;
                }
                else {
                    reco = reco.izq;
                }
            }
            return false;
        }
}
