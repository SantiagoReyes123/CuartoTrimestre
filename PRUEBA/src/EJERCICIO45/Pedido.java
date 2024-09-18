/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO45;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    
    int numeroPedido;
    String Cliente;
    int cantidadArticulos;
    double precioArticulos;
    double precioTotal;

    public Pedido(int numeroPedido, String Cliente, int cantidadArticulos, double precioArticulos) {
        this.numeroPedido = numeroPedido;
        this.Cliente = Cliente;
        this.cantidadArticulos = cantidadArticulos;
        this.precioArticulos = precioArticulos;
        this.precioTotal = metodoPrecioTotal();
    }

    
     public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }

   

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    public String getCliente() {
        return Cliente;
    }

    

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
        this.precioTotal = metodoPrecioTotal();
    }
    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    

    public void setPrecioArticulos(double precioArticulos) {
        this.precioArticulos = precioArticulos;
        this.precioTotal = metodoPrecioTotal();
    }
    public double getPrecioArticulos() {
        return precioArticulos;
    }

    

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
        
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public double metodoPrecioTotal(){
    
        return this.cantidadArticulos * this.precioArticulos;
    }

   
    @Override
    public String toString() {
        return "Pedido{" +
                ", Numero =" + numeroPedido +
                ", Cliente   =" + Cliente +
                ", Cantidad de articulos   =" + cantidadArticulos +
                ", Precio por articulo    =" + precioArticulos +
                ", Precio total      =" + metodoPrecioTotal()  +
                '}';
    }
    
    
    
    
    
}
