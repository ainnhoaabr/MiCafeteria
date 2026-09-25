/**
 * Representa al cliente que entra a la cafeteria
 */
public class Cliente {
    private String nombre;
    private int telefono;

    /**
     * Crea el cliente de nuestra cafeteria
     *
     * @param nombre el nombre del cliente
     * @param telefono el telefono del cliente
     */
    public Cliente(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Modifica el nombre del cliente
     * @param nombre el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del cliente
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el telefono del cliente
     * @param telefono telefono del cliente
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el numero de telefono del cliente
     * @return numero de telefono del cliente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Muestra la info del cliente
     */
    public void mostrarInf(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}
