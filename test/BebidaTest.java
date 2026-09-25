import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BebidaTest {
private Bebida bebida;
private Bebida bebida2;
    @BeforeEach
    void crearBebida(){
        bebida = new Bebida("Café", 2.25, "Café", "Mediano");
        bebida2 = new Bebida("Coca Cola", 2.50, "Bebida", "Mediana");
    }

    @Test
    void probardescuento(){
        double resultado = bebida.aplicarDescuento(10);
        Assertions.assertEquals(2.025, resultado);
    }


    @Test
    void probardescuento2(){
        double resultado = bebida2.aplicarDescuento(10);
        Assertions.assertEquals(2.25, resultado);
    }

    @AfterEach
    void limpia(){
        bebida = null;
        bebida2 = null;
    }

}
