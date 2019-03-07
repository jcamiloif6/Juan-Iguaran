
class Nodo {

   public int dato;
   public int next;
   public int ant;
   
   public Nodo(int dato, int next, int ANT){
        this.dato = dato;
        this.next=next;
        ant = ANT;
    }
    
    
    public void setDato(int data){
        dato = data;
    }
    
    public void setnext(int nex){
        next = nex;
    }
    
    public void setant(int Ant){
        ant = Ant;
    }
    
    public String getdatos(){
        return dato+ " " + next + " "+ ant;
    }
}