
package app;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String dirrecion;

    public Persona(String nombre, String apellido,int edad, String dirrecion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Nombre: " + nombre +
                " / Apellido: " + apellido +
                " / Edad: " + edad +
                " / Dirección: "+ dirrecion;
        return retorno;
    }
    
    
}
