/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO44;

/**
 *
 * @author USUARIO
 */
public class FacturaConDescuento extends Factura {
    
    double descuentoAplicado;
    double totalDescuento;

    public FacturaConDescuento(int numeroFactura, double subTotal, double descuentoAplicado) {
        super(numeroFactura, subTotal);
        this.descuentoAplicado = descuentoAplicado;
        this.totalDescuento = metodoTotalDesceunto();
    }

    
    public void setDescuentoAplicado(double descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
        this.totalDescuento = metodoDescuentoTotal();
    }
    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }
    public double getTotalDescuento() {
        return totalDescuento;
    }
    
    public double metodoDescuentoTotal(){
    
        return this.Total - this.descuentoAplicado;
    }
    
    public double metodoTotalDesceunto(){
    
        return this.Total - this.descuentoAplicado;
    }
    
    @Override
    public String toString() {
        return "Factura con descuento " + 
                ", Numero ;" + getNumeroFactura() + 
                ", Subtotal : " + getSubTotal() +
                ", Descuento : " + descuentoAplicado+
                ", Total con descuento: " + metodoTotalDesceunto();
                
                
    }
    
    

    
    
    
    
    
    
    
    
}
