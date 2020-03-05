/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author chamb
 */
public class ArbolMain {
    public static void main(String[] args) {
        ArbolBinario arbol= new ArbolBinario();
        arbol.insertar(4, "Naranja");
        arbol.insertar(8, "Manzana");
        arbol.insertar(1, "Uva");
        arbol.insertar(9, "Sandia");
        arbol.insertar(7, "Pera");
        
        arbol.recorrer(arbol.raiz);
        
    }
}
