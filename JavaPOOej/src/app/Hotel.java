
package app;

public class Hotel {
    
    private String nombre;
    private String dirrecion;
    private int numHabitaciones;
    private int estrellas;

    public Hotel(String nombre, String dirrecion, int numHabitaciones, int estrellas) {
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.numHabitaciones = numHabitaciones;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Nombre: " + nombre +
                " / Dirrecion: " + dirrecion +
                " / Número de habitaciones: " + numHabitaciones +
                " / Estrellas: "+ estrellas;
        return retorno;
    }
}
