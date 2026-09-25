/**
 * Representa una comida de nuestra cafeteria
 * Hereda características de la clase Producto y dice si es caliente o no
 */
public class Comida extends Producto{
    boolean esCaliente;

    /**
     * Creamos una comida
     * @param nombre el nombre de la comida
     * @param precio el precio de la comida
     * @param categoria la categoria de la comida
     * @param esCaliente indica si la comida está caliente
     */
    public Comida(String nombre, double precio, String categoria, boolean esCaliente){
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    /**
     * Muestra la lista de productos e indica si esta caliente
     */
    @Override
    public void mostrarProductos() {
        System.out.println("Lista de productos: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("¿La comida está caliente?: " + esCaliente);
    }
}
