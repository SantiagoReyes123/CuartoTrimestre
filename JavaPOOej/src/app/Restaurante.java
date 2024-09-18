
package app;


public class Restaurante {
    
    private String nombre;
    private String direccion;
    private String tipoCocina;
    private int calificacion;
    //
    public Restaurante(String nombre, String direccion, String tipoCocina, int calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCocina = tipoCocina;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Nombre: " + nombre +
                " / Dirección: " + direccion +
                " / Tipo de cocina: " + tipoCocina +
                " / Genero: "+ calificacion;
        return retorno;
    }
    
}
