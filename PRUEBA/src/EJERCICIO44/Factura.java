/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO44;

/**
 *
 * @author USUARIO
 */
public class Factura {
    
    int numeroFactura;
    double subTotal;
    double iva;
    double Total;

    public Factura(int numeroFactura, double subTotal) {
        this.numeroFactura = numeroFactura;
        this.subTotal = subTotal;
        this.iva = metodoIva();
        this.Total = totalIva();
    }

    
    
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public int getNumeroFactura() {
        return numeroFactura;
    }

    

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
        this.iva = metodoIva();
        this.Total = totalIva();
    }
    public double getSubTotal() {
        return subTotal;
    }

    

    public void setIva(double iva) {
        this.iva = iva;
        this.Total = metodoIva();
    }
    public double getIva() {
        return iva;
    }

    

     public void setTotal(double Total) {
        this.Total = Total;
        this.Total = total();
        
    }
    public double getTotal() {
        return Total;
    }

    
    public double metodoIva(){
    
        final double tasaIva = 0.19;
        return this.Total * tasaIva;
    }
    
    public double totalIva(){
        
        return this.subTotal + this.iva;
    
    }
    
    public double total(){
    
        return totalIva();
    }
    
    @Override
    public String toString() {
        return "Factura " + 
                ", Numero ;" + numeroFactura + 
                ", SubTotal : " + subTotal + 
                ", Iva = "+ iva+
                ", Total = " + Total;
                

                
    }
   

    
    
    
    
}
