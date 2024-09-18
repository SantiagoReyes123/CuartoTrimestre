/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO45;


public class PedidoExpress extends Pedido{
    
    double costoEnvio;
    int tiempoEntrega;
    double precioTotall;

    public PedidoExpress(int numeroPedido, String Cliente, int cantidadArticulos, double precioArticulos, double precioTotal, int tiempoEntrega) {
        super(numeroPedido, Cliente, cantidadArticulos, precioArticulos);
        this.costoEnvio = costoEnvio;
        this.tiempoEntrega = tiempoEntrega;
        this.precioTotall = metodoPrecioTotall();
    }

    
    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
        this.precioTotall = metodoPrecioTotall();
    }
    public double getCostoEnvio() {
        return costoEnvio;
    }
    
    


    public void setTiempoEntrega(int tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }
    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public double getPrecioTotall() {
        return precioTotall;
    }

    public void setPrecioTotall(double precioTotall) {
        this.precioTotall = precioTotall;
    }
    
    
    

    public double metodoPrecioTotall(){
    
        return this.precioTotal - this.costoEnvio;
    }
    
    
    
    @Override
    public String toString() {
        return "Pedido Express{" +
                ", Numero =" + getNumeroPedido() +
                ", Cliente   =" + getCliente() +
                ", Cantidad de articulos   =" + getCantidadArticulos() +
                ", Precio por articulo    =" + getPrecioArticulos() +
                ", Precio total      =" + metodoPrecioTotal()  +
                ", Costo envio = " + costoEnvio +
                ", Tempo de entrega= " + costoEnvio+
                ", Precio total de envio= " + metodoPrecioTotall() +
                '}';
    }
    
    
    
    
    
    
    
    
}
