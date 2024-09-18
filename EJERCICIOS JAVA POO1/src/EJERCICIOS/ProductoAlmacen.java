/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class ProductoAlmacen {
    
    private int codigoProducto;
    private String nombreProducto;
    private int cantidadAlmacen;
    private double precioUnidad;
    private double valorTotalAlmacen;
    
    
    public double calcularValorTotalAlmacen(){
    
        return this.cantidadAlmacen * this.precioUnidad;
    }
    
    
    public void setCodigoProducto(int codigoProducto){
        this.codigoProducto = codigoProducto;
    }
    public int getCodigoProducto(){
        return codigoProducto;
    }

    
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    

    public void setCantidadAlmacen(int cantidadAlmacen) {
        this.cantidadAlmacen = cantidadAlmacen;
    }
    public int getCantidadAlmacen() {
        return cantidadAlmacen;
    }

    
    
    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    public double getPrecioUnidad() {
        return precioUnidad;
    }

    
    
    public ProductoAlmacen(int codigoProducto, String nombreProducto, int cantidadAlmacen, double precioUnidad){
    
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadAlmacen = cantidadAlmacen;
        this.precioUnidad = precioUnidad;
        this.valorTotalAlmacen = calcularValorTotalAlmacen();
    }
    
    
    
    @Override
    public String toString() {
        return "ProductoAlmacen{" +
                "Codigo producto='" + codigoProducto + '\'' +
                ", Nombre producto =" + nombreProducto +
                ", Cantidad almacen  =" + cantidadAlmacen +
                ", Precio unidad =" + precioUnidad +
                ", Valor total en almacen  =" + valorTotalAlmacen +
                '}';
    }
    
    
    
    
}
