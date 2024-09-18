/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Servicio1 {
    
    String codigo;
    String descripcion;
    double precioHora;
    int horaTrabajada;
    
    protected double calcularTotalServicio(){
    
        return this.precioHora * this.horaTrabajada;
    }
    public double obtenerTotalServicio(){
    
        return calcularTotalServicio();
    }
    
    public void mostrar(){
    
        System.out.println("El codigo es: " + codigo);
        System.out.println("La descripcion es: " + descripcion);
        System.out.println("El precio por cada hora es: " + precioHora);
        System.out.println("Las horas trabajadas son: " + horaTrabajada);
        System.out.println("El costo total del servicio es: " + obtenerTotalServicio());
    }
    
    
}
