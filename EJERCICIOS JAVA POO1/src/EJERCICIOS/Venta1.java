/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Venta1 {
    
    String producto;
    int cantidad;
    double precioUnitario;
    
    
    
    private double calcularTotalVenta(){
    
        return this.cantidad * this.precioUnitario;
    }
    
    public double obtenerTotalVenta(){
    
        return calcularTotalVenta();
    }
    
    public void metodoMostrar(){
    
        System.out.println("El producto es: " + producto);
        System.out.println("La cantidad es: " + cantidad);
        System.out.println("El precio unitario es: " + precioUnitario);
        System.out.println("El totalde la compra es: " + obtenerTotalVenta());
        
    }
    
}
