/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesMakigas;

/**
 *
 * @author chamb
 */
public interface IBST <T extends Comparable>{
    void insertar(T empl);
    
    boolean existe(int id);
    
    T obtener(int id);
    
    boolean esHoja();
    
    boolean esVacio();
    
    void preorden();
    
    void inorden();
    
    void postorden();
    
    void eliminar(int id);
    
}
