public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void setNombre(String nombre){
        this.nombre =nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void mostrarProductos(){
        System.out.println("Lista de productos: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoría: " + categoria);

    }
}
