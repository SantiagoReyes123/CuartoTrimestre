/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Hotel {
    
    private String nombre;
    private String direccion;
    private int numeroHabitaciones;
    private int estrellas;
    
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    
    
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }
    
    
    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    public int getEstrellas() {
        return estrellas;
    }
    
    
    public Hotel(String nombre, String direccion, int numeroHabitaciones, int estrellas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.estrellas = estrellas;
    }
    
    @Override
    public String toString() {
        return "Hotel{" +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Numero de habitaciones=" + numeroHabitaciones +
                ", Estrellas=" + estrellas +
                '}';
    }
    
    
    
}
