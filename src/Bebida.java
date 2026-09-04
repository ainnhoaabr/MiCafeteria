public class Bebida extends Producto implements Descontable{
    String tamanio;

    public Bebida(String nombre, double precio, String categoria, String tamanio){
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarProductos() {
        System.out.println("Lista de productos: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Tamaño: " + tamanio);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = getPrecio() * (porcentaje/100);
        double precioFinal = (getPrecio() - descuento);
        return precioFinal;
    }
}
