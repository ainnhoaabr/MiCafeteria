public class Camarero {
    private String nombre;
    private int codigoEmpleado;

    public Camarero(String nombre, int codigoEmpleado){
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Empleado: " + codigoEmpleado);
    }
}
