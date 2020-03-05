/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasMakigas;
/**
 *
 * @author chamb
 */
public interface Pila {
    void apilar(URL url);
    void desapilar();
    URL obtener();
    int longitud();
    boolean vacia();
}