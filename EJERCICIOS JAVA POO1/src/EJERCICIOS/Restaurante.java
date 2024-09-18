/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Restaurante {
    private String nombre;
    private String direccion;
    private String tipoCocina;
    private double calificacion;
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    public String getNombre(){
        
        return nombre;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }
    public String getTipoCocina() {
        return tipoCocina;
    }

    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public double getCalificacion() {
        return calificacion;
    }

    public Restaurante(String nombre, String direccion, String tipoCocina, double calificacion){
    
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCocina = tipoCocina;
        this.calificacion = calificacion;
        
    }
    
    @Override
    public String toString(){
    
        return "Restaurante{" +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Tipo de cocina=" + tipoCocina +
                ", Calificacion='" + calificacion + '\'' +
                '}';
    }
    
    
    
}
