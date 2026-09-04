public class Cliente {
    private String nombre;
    private int telefono;

    public Cliente(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void mostrarInf(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}
