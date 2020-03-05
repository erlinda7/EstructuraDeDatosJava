
package colasMakigas;

/**
 *
 * @author chamb
 */
public interface ColaProceso {
    void encolar(Trabajo t);
    void eliminar();
    Trabajo obtener();
}
