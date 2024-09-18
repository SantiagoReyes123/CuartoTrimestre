/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBA1;

/**
 *
 * @author USUARIO
 */
public class ProductoPerecedero extends Producto{
    
    String fechaCaducidad;
    double descuento;
    
    

    // Constructor
    public ProductoPerecedero(String codigoProducto, String nombreProducto, double precioPorUnidad, String fechaCaducidad, double descuento) {
        super(codigoProducto, nombreProducto, precioPorUnidad); // Llama al constructor de la superclase
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = descuento;
    }
    
    // Getters
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public double getDescuento() {
        return descuento;
    }

    // Setters
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de caducidad: " + fechaCaducidad + ", Descuento: " + descuento + "%";
    }
}
