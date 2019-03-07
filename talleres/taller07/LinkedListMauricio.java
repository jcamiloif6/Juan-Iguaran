import java.lang.IndexOutOfBoundsException; 
import java.util.*;
public class LinkedListMauricio {
private Nodo first;
private int size;
private Nodo data;
ArrayList<Nodo>Lista = new ArrayList<>();
public LinkedListMauricio()
{
    size = 1;
    first = null;   
    
}

public int size()
{
return size;
}

/*private Nodo getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Nodo temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }*/
    
    public void get(int index) throws IndexOutOfBoundsException {
        if(index<Lista.size()) {
        System.out.println(Lista.get(index).getdatos());
    }
        else
        System.out.println("error, ingrese una posicion que este dentro de la lista");
    }

public void remove(int index) throws IndexOutOfBoundsException{
    if(index<Lista.size()){
    Lista.remove(index);
}
    else 
    System.out.println("error, ingrese una posicion que este dentro de la lista");
}

/*private boolean containsAux(int ElDato, Nodo nodo){
     if (nodo == null) // Condicion de parada
        return false;
     else
        if (nodo.dato == ElDato) // Otra condicion de parada
          return true;
        else  // Caso inductivo T(n) = T(n-1) + C = O(n)
          return containsAux(ElDato, nodo.next);
  }*/
  
  /*public boolean contains(int data){
   // Si el dato está a partir del primero
     return containsAux(data, first); 
}*/

public void insert(int dato, int dato1, int dato2)
{
    Lista.add(new Nodo(dato, dato1, dato2));
}
}
