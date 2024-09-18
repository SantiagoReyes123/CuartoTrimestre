
package app;

import java.util.Date;

public class Factura24 {
    
   private String numeroFactura;
    private Date fecha;
    private double subtotal;
    private double IVA;
    private double total;

    // Constructor
    public Factura24(String numeroFactura, Date fecha, double subtotal) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.IVA = subtotal * 0.19;
        this.total = subtotal + this.IVA;
    }

    // Getters y Setters
    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public double getTotal() {
        return total;
    } 
    
    @Override
    public String toString() {
        return "Numero de factura: " + numeroFactura +
                " / Fecha: " + fecha +
                " / Subtotal: " + subtotal +
                " / IVA: " + IVA +
                " / Total: " + total;
    }
}
