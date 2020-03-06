/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesMakigas;

/**
 *
 * @author chamb
 * makigas
 * arbol binario de busqueda
 */
public class Empleado implements Comparable<Empleado>{
    
    private int id;
    private String nombre;
    private String puesto;
    private String despacho;

    public Empleado(int id, String nombre, String puesto, String despacho) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public int compareTo(Empleado empl) {
        if(id==empl.id){
            return 0;
        }else if(id <empl.id){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Empleado { id= "+ id+ " nombre= "+ nombre+ " puesto= "+ puesto+ "despacho= "+despacho;
    }
    
    
}
