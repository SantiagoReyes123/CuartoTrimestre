/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Compra {
    
    private int numeroCompra;
    private String proveedor;
    private int cantidadProducto;
    private double precioProducto;
    private double precioTotal;
    
    
    
    public double calcularPrecioTotal(){
    
        return this.cantidadProducto *this.precioProducto;
        
    }

    
    
    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }
    public int getNumeroCompra() {
        return numeroCompra;
    }

    

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public String getProveedor() {
        return proveedor;
    }

    

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioTotal = calcularPrecioTotal();
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
        this.precioTotal = calcularPrecioTotal();
    }
    public double getPrecioProducto() {
        return precioProducto;
    }

    
    
    public Compra(int numeroCompra, String proveedor, int cantidadProducto, double precioProducto){
    
        this.numeroCompra = numeroCompra;
        this.proveedor = proveedor;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.precioTotal =calcularPrecioTotal();
    }
    
    
    @Override
    public String toString() {
        return "Compra{" +
                "Numero compra='" + numeroCompra + '\'' +
                ", Proveedor =" + proveedor +
                ", Cantidad de productos  =" + cantidadProducto +
                ", Precio por producto =" + precioProducto +
                ", Precio total  =" + precioTotal +
                '}';
    }
    
    
    
    
    
    
}
