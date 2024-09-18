/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Pedidoo {
    
    private int numeroPedido;
    private String cliente;
    private int cantidadArticulo;
    private double precioArticulo;
    private double precioTotal;
    
    
    public double calcularPrecioTotal(){
    
        return this.cantidadArticulo * this.precioArticulo;
    }
    
    
    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido  = numeroPedido;
    }
    public int getNumeroPedido(){
        return numeroPedido;
    }

    
    public void setCliente(String Cliente) {
        this.cliente = Cliente;
    }
    public String getCliente() {
        return cliente;
    }

    

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
        this.precioTotal = calcularPrecioTotal();
    }
    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
        this.precioTotal = calcularPrecioTotal();

    }
    public double getPrecioArticulo() {
        return precioArticulo;
    }
    
    
    public Pedidoo(int numeroPedido, String cliente, int cantidadArticulo, double precioArticulo){
    
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.cantidadArticulo = cantidadArticulo;
        this.precioArticulo = precioArticulo;
        this.precioTotal = calcularPrecioTotal();
    }
    
     @Override
    public String toString() {
        return "Pedidoo{" +
                "Numero pedido='" + numeroPedido + '\'' +
                ", Cliente =" + cliente +
                ", Cantidad artiulos  =" + cantidadArticulo +
                ", Precio articulo =" + precioArticulo +
                ", Precio total  =" + precioTotal +
                '}';
    }
    
   
   

    
    
    
    
    
    
    
    
}
