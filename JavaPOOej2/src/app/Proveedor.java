
package app;

public class Proveedor {
   
    protected String nombre;
    protected String empresa;
    protected String telefono;
    
    public Proveedor(String nombre, String empresa, String telefono) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }
    
    public String mostrarInformacion() {
        return "nombre " + nombre +
                " / empresa " + empresa + 
                " / telefono " + telefono;
    }
}
