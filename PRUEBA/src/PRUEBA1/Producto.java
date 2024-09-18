/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBA1;

public class Producto {
    
    String codigoProducto;
    String nombreProducto;
    double precioUnidad;

    public Producto(String codigoProducto, String nombreProducto, double precioUnidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
    }

    
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public String getCodigoProducto() {
        return codigoProducto;
    }

    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    @Override
    public String toString() {
        return "Producto " + 
                ", Codigo ;" + codigoProducto + 
                ", Nombre : " + nombreProducto +
                ", Precio unidad: " + precioUnidad;
                
    }
    
    
    
}
