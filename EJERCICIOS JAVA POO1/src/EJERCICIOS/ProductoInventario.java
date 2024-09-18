/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class ProductoInventario {
    
    private int codigoProducto;
    private String nombreProducto;
    private int cantidadStock;
    private double precioUnidad;
    private double valorTotalStock;
    
    public double calcularValorTotalStock(){
    
        return this.cantidadStock * this.precioUnidad;
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

    

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
        this.valorTotalStock = calcularValorTotalStock();
    }
    public int getCantidadStock() {
        return cantidadStock;
    }

    

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
        this.valorTotalStock = calcularValorTotalStock();
    }
    public double getPrecioUnidad() {
        return precioUnidad;
    }
    
    
    public ProductoInventario(int codigoProducto, String nombreProducto, int cantidadStock, double precioUnidad){
    
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadStock = cantidadStock;
        this.precioUnidad = precioUnidad;
        this.valorTotalStock = calcularValorTotalStock();
        
    }
    
    
    
    @Override

        public String toString() {
        return "ProductoInventario{" +
                "Codigo del producto='" + codigoProducto + '\'' +
                ", Nombre del producto=" + nombreProducto +
                ",  Cantidad en Stock=" + cantidadStock +
                ", Precio por Unidad =" + precioUnidad +
                ",  Valor total en stock  =" + valorTotalStock +
                '}';
    }
    

    
    
    
    
}
