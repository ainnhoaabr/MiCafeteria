public class Comida extends Producto{
    boolean esCaliente;

    public Comida(String nombre, double precio, String categoria, boolean esCaliente){
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    @Override
    public void mostrarProductos() {
        System.out.println("Lista de productos: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("¿La comida está caliente?: " + esCaliente);
    }
}
