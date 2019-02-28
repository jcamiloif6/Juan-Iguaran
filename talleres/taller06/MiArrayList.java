public class MiArrayList{
    private int size;
    private static final int DEFAULT_CAPACITY = 1;
    private int elements[]; 

    public int size() {
        return size;
    }  

    public MiArrayList() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }  

    public void add(int e) {
        if(size>=DEFAULT_CAPACITY){
            int[] elements2 = new int[size*2];
            for(int i=0; i<size; i++){
                elements2[i] = elements[i];
            }
            elements = elements2;
        }
        elements[size]=e;
        size++;
    }  

    public void del(int index){

        if(index > size){
            System.out.print("Ingrese una posición que esté en el arreglo");
        }else{
            try{
                if (size == 0){
                    System.out.print("No hay elementos en el arreglo");
                }
                else{

                    if(index!= (size-1)){
                        for(int i= index; i<size ;i++){
                            elements[i] = elements[i+1];
                        }
                    }
                    size--;
                }
            } catch (Exception e){
                System.out.print("Error");
            }
        }   
    }

    public  int get(int i)  {
        if(i>size){
            System.out.println("Error: la posición "+i+" no está dentro del arreglo");
        }
        else{
            try{
                return elements[i];
            }
            catch(Exception e){
                System.out.println ("Error: la posición "+i+" no está dentro del arreglo");
            }
        }
        return 0;
    }
}