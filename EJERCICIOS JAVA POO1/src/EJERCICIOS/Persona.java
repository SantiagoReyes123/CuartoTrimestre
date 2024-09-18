/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    public String getNombre(){
    
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }

    

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    
    public Persona(String nombre, String apellido, int edad, String direccion){
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){

        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", Direccion ='" + direccion + '\'' +
                '}';
    }
    
    
    
    
    
}
