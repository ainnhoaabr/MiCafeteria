import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {
    private Comida comida;
    private Bebida bebida;
    private Bebida bebida2;
    private Ticket ticket;

    @BeforeEach
    void crearProductos(){
        comida = new Comida("Croissant", 1.10, "Bollería", false);
        bebida = new Bebida("Agua", 1.10, "Agua", "Pequeña");
        bebida2 = new Bebida("Café", 2.10, "Café", "Mediano");
    }

    @Test
    void calcularProductos(){
        ticket.agregarProducto(comida);
        ticket.agregarProducto(bebida);

        double resultado = ticket.calcularTotal();
        Assertions.assertEquals(2.20, resultado);
    }


    @BeforeEach
    void contarProductos(){
        Cliente cliente = new Cliente("Lidia", 678328389);
        Camarero camarero = new Camarero("Jose", 01);
        ticket = new Ticket(cliente, camarero);
    }

    @Test
    void crear(){
        Producto p1 = new Producto("Croissant", 1.05, "Bollería");
        Producto p2 = new Producto("Agua", 1.05, "Agua");
        Producto p3 = new Producto("Café", 2.10, "Cafés");
        Producto p4 = new Producto("Colacao", 1.50, "Bebida");
        Producto p5 = new Producto("Churros", 3.40, "Bollería");
        Producto p6 = new Producto("Sandwich", 2, "Sandwiches");
        Producto p7 = new Producto("Nestea", 2.75, "Bebidas");

        ticket.agregarProducto(p1);
        ticket.agregarProducto(p2);
        ticket.agregarProducto(p3);
        ticket.agregarProducto(p4);
        ticket.agregarProducto(p5);
        ticket.agregarProducto(p6);
        ticket.agregarProducto(p7);

        Assertions.assertEquals(6,ticket.contadorProductos);

    }

    @AfterEach
    void limpiar(){
        bebida = null;
        comida = null;
        bebida2 = null;
        ticket = null;
    }


}
