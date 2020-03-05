
package nodos;

public class NodoPrincipal {
    public static void main(String[] args) {
        String persona1="Ariel";
        String persona2="Marco";
        String persona3="Tatiana";
        String persona4="Julia";
        
        Nodo n1=new Nodo(persona1);
        Nodo n2=new Nodo(persona2);
        Nodo n3=new Nodo(persona3);
        Nodo n4=new Nodo(persona4);
        
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);
        
        Nodo aux=n1;
        
        for (int i = 0; i < 4; i++) {
            String aux2=(String)aux.getContiene();
            System.out.println(aux2);
            aux=aux.getSiguiente();
        }
        
    }
}

