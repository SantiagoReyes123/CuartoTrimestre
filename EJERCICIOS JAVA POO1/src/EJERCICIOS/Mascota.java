/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Mascota {
    
    private String nombre;
    private String tipo;
    private int edad;
    private String dueno;
    
    public void StringNombre(String nombre){
    
        this.nombre = nombre;
    }
    public String getNombre(){
    
        return nombre;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    

    public void setDueño(String dueño) {
        this.dueno = dueño;
    }
    public String getDueno() {
        return dueno;
    }

    public Mascota(String nombre, String tipo, int edad, String dueno){
    
        this.nombre =nombre;
        this.tipo =tipo;
        this.edad = edad;
        this.dueno = dueno;
    }
    
    
    @Override
    public String toString(){
    
        return "Mascota{" +
                " Nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", edad =" + edad +
                ", dueno ='" + dueno + '\'' +
                '}';
    }
    
    
    
    
   
    
}
