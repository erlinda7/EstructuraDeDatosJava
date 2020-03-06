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
public class BST implements IBST<Empleado> {

    private Empleado valor;
    private BST izdo, dcho;

    private BST padre;

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public boolean esHoja() {
        return valor != null && izdo == null && dcho == null;
    }

    private void insertarImpl(Empleado empl, BST padre) {
        if (valor == null) {
            this.valor = empl;
            this.padre = padre;
        } else {
            if (empl.compareTo(valor) < 0) {
                if (izdo == null) {
                    izdo = new BST();
                }
                izdo.insertarImpl(empl, this);
            } else if (empl.compareTo(valor) > 0) {
                if (dcho == null) {
                    dcho = new BST();
                }
                dcho.insertarImpl(empl, this);
            } else {
                //nada
                throw new RuntimeException("Insertando elemento duplicado");
            }
        }
    }

    @Override
    public void insertar(Empleado empl) {
        insertarImpl(empl, null);
    }

    @Override
    public boolean existe(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return true;
            } else if (id < valor.getId() && izdo != null) {
                return izdo.existe(id);
            } else if (id > valor.getId() && dcho != null) {
                return dcho.existe(id);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Empleado obtener(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return valor;
            } else if (id < valor.getId() && izdo != null) {
                return izdo.obtener(id);
            } else if (id > valor.getId() && dcho != null) {
                return dcho.obtener(id);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public void preorden() {
        /* if (valor != null) {
         System.out.println(valor);
         if (izdo != null) {
         izdo.preorden();
         }
         if (dcho != null) {
         dcho.preorden();
         }
         }*/
        preordenImpl("");
    }

    private void preordenImpl(String prefijo) {
        if (valor != null) {
            System.out.println(prefijo + valor);
            if (izdo != null) {
                izdo.preordenImpl(prefijo + "  ");
            }
            if (dcho != null) {
                dcho.preordenImpl(prefijo + "  ");
            }
        }
    }

    @Override
    public void inorden() {
        /*  if (valor != null) {
         if (izdo != null) {
         izdo.inorden();
         }
         System.out.println(valor);
         if (dcho != null) {
         dcho.inorden();
         }
         }*/
        inordenImpl("");
    }

    private void inordenImpl(String prefijo) {
        if (valor != null) {
            if (izdo != null) {
                izdo.inordenImpl(prefijo + "  ");
            }
            System.out.println(prefijo + valor);
            if (dcho != null) {
                dcho.inordenImpl(prefijo + "  ");
            }
        }
    }

    @Override
    public void postorden() {
        /*if (valor != null) {
         if (izdo != null) {
         izdo.postorden();
         }
         if (dcho != null) {
         dcho.postorden();
         }
         System.out.println(valor);
         }*/
        postordenImpl("");
    }

    private void postordenImpl(String prefijo) {
        if (valor != null) {
            if (izdo != null) {
                izdo.postordenImpl(prefijo + "  ");
            }
            if (dcho != null) {
                dcho.postordenImpl(prefijo + "  ");
            }
            System.out.println(prefijo + valor);
        }
    }

    @Override
    public void eliminar(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                //Eliminare valor
                eliminarImpl(id);
            } else if (id < valor.getId() && izdo != null) {
                izdo.eliminar(id);
            } else if (id > valor.getId() && dcho != null) {
                dcho.eliminar(id);
            }
        }
    }

    
    private void eliminarImpl(int id) {
        if (izdo != null && dcho != null) {
            //eliminaar con 2 hijos
            BST minimo = dcho.minimo();
            this.valor =minimo.valor;
            dcho.eliminar(minimo.valor.getId());
            
        } else if (izdo != null || dcho != null) {
            //Eliminar con 1 hijo
            BST sustituto = izdo !=null ? izdo:dcho;
            this.valor = sustituto.valor;
            this.izdo =sustituto.izdo;
            this.dcho =sustituto.dcho;
        } else {
            //eliminar 0 hijo
            if(padre!= null){
                if(this == padre.izdo){
                    padre.izdo=null;
                }
                if(this == padre.dcho){
                    padre.dcho=null;
                }
                padre =null;
            }
            valor=null;
        }
    }
    
    private BST minimo(){
        if(izdo != null && !izdo.esVacio()){
            return izdo.minimo();
        }else{
            return this;
        }
    }
}
