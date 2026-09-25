/**
 *Representa una bebida de nuestra cafetería.
 * Hereda características de Producto y añade información de su tamaño.
 */
public class Bebida extends Producto implements Descontable{
    String tamanio;

    /**
     * Creamos una bebida con nombre, precio, categoria y tamaño.
     * @param nombre es el nombre de la bebida
     * @param precio es el precio de la bebida
     * @param categoria es la categoria de la bebida
     * @param tamanio es el tamaño de la bebida
     */
    public Bebida(String nombre, double precio, String categoria, String tamanio){
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    /**
     * Muestra la info del producto y su tamaño
     */
    @Override
    public void mostrarProductos() {
        System.out.println("Lista de productos: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Tamaño: " + tamanio);
    }

    /**
     * Se calcula el precio de la bebida con el descuento.
     * @param porcentaje el porcentaje de descuento
     * @return precio de la bebida con el descuento añadido
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = getPrecio() * (porcentaje/100);
        double precioFinal = (getPrecio() - descuento);
        return precioFinal;
    }
}
