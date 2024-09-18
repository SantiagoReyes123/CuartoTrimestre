/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Factura1 {
    
    String numero;
    String cliente;
    double subtotal;
    
    public Factura1(String numero, String cliente, double subtotal){
    
        this.numero = numero;
        this.cliente = cliente;
        this.subtotal = subtotal;
        
    }
    
    
    //metodo iva
    private double calcularIva(){
    
        final double tasaIva = 0.19;
        return this.subtotal * tasaIva;
    }
    
    //metodo total factura
    private double totalFactura(){
    
        return this.subtotal + calcularIva();
    }
    
    //total
    public double total(){
    
        return totalFactura();
    }
    
    
    
    
     @Override
    public String toString() {
        return "Factura{" +
                "Numero='" + numero + '\'' +
                ", Cliente='" + cliente + '\'' +
                ", Subtotal=" + subtotal +
                ", Total con IVA=" + total() +
                '}';
    }
    
    
    
}
