/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasMakigas;

/**
 *
 * @author chamb
 */
public class MicolaProceso implements ColaProceso {

    private NodoProceso cabeza, ultimo;

    @Override
    public void encolar(Trabajo t) { //insertar final
        NodoProceso nuevoNodo = new NodoProceso(t);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
        }

        ultimo = nuevoNodo;
    }

    @Override
    public void eliminar() { //eliminar inicio
        if(cabeza !=null ){
         NodoProceso eliminar=cabeza;
         cabeza = cabeza.siguiente;
         eliminar.siguiente=null;
         
         if(cabeza==null){
             ultimo=null;
         }
        }
    }

    @Override
    public Trabajo obtener() {
        if(cabeza==null){
            return null;
        }else{
            return cabeza.trabajo;
        }
    }

    private class NodoProceso {

        public Trabajo trabajo;
        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }

}
