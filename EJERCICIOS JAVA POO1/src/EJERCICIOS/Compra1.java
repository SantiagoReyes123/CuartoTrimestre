/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Compra1 {
    
    private String numero;
    private String proveedor;
    private int cantProducto;
    private double precioProducto;
    
    public Compra1(String numero, String proveedor, int cantProducto, double precioProducto){
    
        this.numero = numero;
        this.proveedor = proveedor;
        this.cantProducto = cantProducto;
        this.precioProducto = precioProducto;
    }

    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public String getProveedor() {
        return proveedor;
    }

    

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }
    public int getCantProducto() {
        return cantProducto;
    }

    

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }
    
    
    public double CostoFinal1(){
    
        return this.cantProducto * this.precioProducto;
    }
    
    @Override
    public String toString() {
        return "Compra{" +
                "numero='" + numero + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", cantidadProductos=" + cantProducto +
                ", precioPorProducto=" + precioProducto +
                ", costoTotal=" + CostoFinal1() +
                '}';
    }
    
    

    
    
    
    
    
    
}
