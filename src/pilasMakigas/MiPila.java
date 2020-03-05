package pilasMakigas;

/**
 *
 * @author chamb
 */
public class MiPila implements Pila{
    
    private Nodo cima=null;
    private int longitud=0;

    @Override
    public void apilar(URL url) {  //insertar al principio
      Nodo nodo = new Nodo(url);
      nodo.siguiente = cima;
      cima = nodo;
      longitud++;
    }

    @Override
    public void desapilar() { //eliminar principio
      if(cima !=null){
          Nodo eliminar = cima;
          cima=cima.siguiente;
          eliminar.siguiente=null;
          longitud--;
      }
    }

    @Override
    public URL obtener() {
        if(cima == null){
            return null;
        }else{
            return cima.url;
        }
      
    }

    @Override
    public int longitud() {
        return longitud;
    }

    @Override
    public boolean vacia() {
        return longitud==0;
    }
    
    
    
    private class Nodo{
        public URL url;
        public Nodo siguiente = null;
        
        public Nodo(URL url){
            this.url = url;
        }
    }
}
