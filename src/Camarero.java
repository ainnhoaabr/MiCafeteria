/**
 * Representa al camarero de nuestra cafeteria
 */
public class Camarero {
    private String nombre;
    private int codigoEmpleado;

    /**
     * Creamos al camarero
     *
     * @param nombre el nombre del camarero
     * @param codigoEmpleado el codigo con el que se identifica al camarero
     */

    public Camarero(String nombre, int codigoEmpleado){
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Modifica el nombre del camarero
     * @param nombre nuevo nombre del camarero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del camarero
     * @return nombre del camarero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el codigo de empleado
     *
     * @param codigoEmpleado nuevo codigo del camarero
     */

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Devuelve el codigo del camarero
     *
     * @return codigo del camarero
     */

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Muestra la info del camarero
     */

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Empleado: " + codigoEmpleado);
    }
}
