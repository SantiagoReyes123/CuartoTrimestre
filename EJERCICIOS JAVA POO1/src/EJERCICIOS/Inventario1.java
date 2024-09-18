/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Inventario1 {
    
    String codigoProducto;
    int cantidad;
    double precioUnidad;
    
    
    
    public Inventario1(String codigoProducto, int cantidad, double precioUnidad ){
    
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }
    
    private double metodoValorTotal(){
    
        return this.cantidad * this.precioUnidad;
    }
    
    public double metodoValorFinal(){
    
        return metodoValorTotal();
    }
    
    
    public void mostrarInformacion(){
    
        System.out.println("El codigo es: " + codigoProducto);
        System.out.println("La cantidad es: " + cantidad);
        System.out.println("El precio por unidad es: " + precioUnidad);
        System.out.println("Valor total en inventario: " + metodoValorFinal());
    }
    
    
}
