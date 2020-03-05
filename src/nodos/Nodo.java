package nodos;

/**
Nodo: Un tipo de dato abstracto tiene un puntero y un contenido
y permite de alguna manera tener Listas o una serie de datos ordenados
para poder ser accedidos mediante ya sea consol o interfaz grafica.
 */
public class Nodo {
    private Nodo siguiente;
    private String contiene;

    public Nodo() {
        setSiguiente(null);
        setContiene(null);
    }
    
    public Nodo(String c) {
        setSiguiente(null);
        setContiene(c);
    }
    
    public Nodo(String c, Nodo n) {
        setSiguiente(n);
        setContiene(c);
    }
        
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getContiene() {
        return contiene;
    }

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }
    
    
}
