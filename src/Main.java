/**
 * Clase principal donde se ejecuta el programa.
 */
public class Main {
    /**
     * Método principal en el que se crean los productos, el cliente, el camarero,
     * genera un ticket, aplica un descuento y muestra el ticket.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Lidia", 689789887);

        Camarero camarero = new Camarero("Jose", 756);

        Bebida p1 = new Bebida("Café", 2.25, "Bebida", "Mediano");
        Producto p2 = new Bebida("Colacao", 2.30, "Bebida", "Mediano");
        Producto p3 = new Bebida("Agua", 1.05, "Bebida", "Normal");

        Producto p4 = new Comida("Croissant", 1.05, "Comida",false);
        Producto p5 = new Comida("Sandwich mixto", 2.15, "Comida", true);
        Producto p6 = new Comida("Churros", 3.10, "Comida", true);


        Ticket ticket = new Ticket(c1, camarero);
        ticket.agregarProducto(p1);
        ticket.agregarProducto(p6);
        ticket.agregarProducto(p3);
        ticket.agregarProducto(p4);

        double porcentaje = 10;
        double precioconDescuento = p1.aplicarDescuento(porcentaje);

        ticket.productoDescontado(p1, precioconDescuento);

        ticket.mostrarTicket();

    }
}
