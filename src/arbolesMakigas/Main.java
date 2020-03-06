/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesMakigas;

import java.util.Arrays;

/**
 *
 * @author chamb
 */
public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(20, "Pepito Perez", "Ventas", "A-252");
        Empleado e2 = new Empleado(44, "Ana Lopez", "Recursos Humanos", "B-198");
        Empleado e3 = new Empleado(18, "Elena Nito", "Ventas", "A-241");
        Empleado e4 = new Empleado(33, "Jose Gomez", "Contabilidad", "B-96");
        Empleado e5 = new Empleado(64, "Fransisco Perez", "Marketing", "A-69");
        Empleado e6 = new Empleado(55, "Javier Lopez", "Informatica", "B-161");

        
        
        BST bst=new BST();
        
        Arrays.asList(e1,e2,e3,e4,e5,e6).forEach(bst::insertar);
        
        bst.eliminar(20);
        
        bst.inorden();
        
        /*BST bst = new BST();
        System.out.println("Esta vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());

        bst.insertar(e1);
        System.out.println("Esta vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());

        bst.insertar(e2);
        System.out.println("Esta vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());

        localizar(bst, 44);
        localizar(bst, 5);*/
    }

   /* private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
            System.out.println(bst.obtener(id));
        } else {
            System.out.println("No encuentro el empleado "+ id);
        }
    }*/
}
