/**
 * Representa el ticket de lo que ha consumido el cliente.
 */
public class Ticket {
    Cliente cliente;
    Camarero camarero;
    Producto[] productos;
    int contadorProductos;
    double precioConDescuento;
    Producto productoDescuento;

    /**
     * Crea el ticket del cliente.
     * @param cliente nombre del cliente
     * @param camarero nombre del camarero
     */
    public Ticket(Cliente cliente, Camarero camarero){
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[6];
        this.contadorProductos = 0;
    }

    /**
     * Agrega los productos consumidos al ticket
     * @param producto el producto consumido por el cliente
     */

    public void agregarProducto(Producto producto){
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos += 1;
        }else {
            System.out.println("No se pueden añador mas productos");
        }
    }

    /**
     *Guarda el producto al que se le ha aplicado el descuento.
     * @param producto nombre del producto al que se le aplica el descuento
     * @param precio precio del producto después del descuento
     */

    public void productoDescontado(Producto producto, double precio){
        this.productoDescuento = producto;
        this.precioConDescuento = precio;

    }

    /**
     * Se calcula el total de todos los productos que ha consumido el cliente
     * @return precio total de la cuenta
     */

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i<contadorProductos; i++) {
            if (productos[i] == productoDescuento) {
                total += precioConDescuento;
            } else {
                total += productos[i].getPrecio();
            }
        }
        return total;
    }

    /**
     * Muestra el ticket, con la info del cliente y del camarero, lo que ha consumido el cliente y el precio total
     */
    public void mostrarTicket(){
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Camarero: " + camarero.getNombre());

        System.out.println("Productos: ");

        for (int i = 0; i < contadorProductos;i++) {
            if (productos[i] == productoDescuento) {
                System.out.println("- " + productos[i].getNombre() + " - Precio con descuento: " + precioConDescuento + "€");
            } else {
                System.out.println("- " + productos[i].getNombre() + " - " + productos[i].getPrecio() + "€");
            }
        }

        System.out.println("Total productos: " + contadorProductos);
        System.out.println("Descuento aplicado al café");
        System.out.println("Total precio: " + calcularTotal() + "€");

    }

}
