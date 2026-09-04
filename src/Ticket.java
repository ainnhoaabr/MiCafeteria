
public class Ticket {

    Cliente cliente;
    Camarero camarero;
    Producto[] productos;
    int contadorProductos;
    double precioConDescuento;
    Producto productoDescuento;

    public Ticket(Cliente cliente, Camarero camarero){
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[6];
        this.contadorProductos = 0;
    }

    public void agregarProducto(Producto producto){
        productos[contadorProductos] = producto;
        contadorProductos += 1;
    }

    public void productoDescontado(Producto producto, double precio){
        this.productoDescuento = producto;
        this.precioConDescuento = precio;

    }

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

    public void mostrarTicket(){
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Camarero: " + camarero.getNombre());

        System.out.println("Productos: ");
        for (int i = 0; i < contadorProductos;i++){
            System.out.println("- " + productos[i].getNombre() + " - " + productos[i].getPrecio() + "€");
        }
        System.out.println("Total productos: " + contadorProductos);
        System.out.println("Descuento aplicado al café");
        System.out.println("Total precio: " + calcularTotal() + "€");

    }

}
