/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO49;

/**
 *
 * @author USUARIO
 */
public class Compra {
    
    int numeroCompra;
    String proveedor;
    int cantidadProducto;
    double precioPorProducto;
    double precioTotal;

    public Compra(int numeroCompra, String proveedor, int cantidadProducto, double precioPorProducto) {
        this.numeroCompra = numeroCompra;
        this.proveedor = proveedor;
        this.cantidadProducto = cantidadProducto;
        this.precioPorProducto = precioPorProducto;
        this.precioTotal = metodoPrecioTotal();
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
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }

   

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }
    public double getPrecioPorProducto() {
        return precioPorProducto;
    }

    

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public double metodoPrecioTotal(){
    
        return this.cantidadProducto * this.precioPorProducto;
    }
    
    @Override
    public String toString() {
        return "Compra{" +
                ", Numero comora =" + numeroCompra +
                ", Proveedor   =" + proveedor +
                ", Cantidad de productos   =" + cantidadProducto +
                ", Precio por producto    =" + precioPorProducto +
                ", Precio total      =" + metodoPrecioTotal()  +
                '}';
    }

    
    
    
    
}
