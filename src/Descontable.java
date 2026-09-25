/**
 * Interfaz que utilizamos para el descuento de un producto
 */
public interface Descontable {
    /**
     * Aplica un desceunto al producto
     * @param porcentaje porcentaje de descuento que se aplica
     * @return precio del producto despues de aplicar el descuento
     */
    double aplicarDescuento(double porcentaje);
}
