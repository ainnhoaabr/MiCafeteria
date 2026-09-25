/**
 * Representa un producto de nuestra cafetería.
 * Cada producto tiene un nombre, un precio y una categoría
 */
public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Aquí creamos un producto con un nombre, precio y categoria.
     * @param nombre es el nombre del producto.
     * @param precio es el precio del producto.
     * @param categoria es la categoria del producto.
     */
    public Producto(String nombre, double precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Modifica el nombre del producto
     * @param nombre nuevo nombre del producto
     */

    public void setNombre(String nombre){
        this.nombre =nombre;
    }

    /**
     * Devuelve el nombre del producto
     *
     * @return nombre del producto
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Modifica el precio del producto
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio){
        this.precio = precio;
    }

    /**
     * Devuelve el precio del producto
     *
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica la categoría del producto.
     * @param categoria nueva categoria del producto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve la categporia del producto
     *
     * @return categoria del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Muestra la lista de productos que hay en la cafetería.
     */
    public void mostrarProductos(){
        System.out.println("Lista de productos: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoría: " + categoria);

    }
}
