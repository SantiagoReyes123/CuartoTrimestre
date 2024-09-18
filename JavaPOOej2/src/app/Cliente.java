
package app;

public class Cliente {
 
    String nombre;
    String direccion;
    String telefono;

    
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return  "nombre " + nombre +
                " / direccion " + direccion + 
                " /telefono " + telefono;
    }
}
