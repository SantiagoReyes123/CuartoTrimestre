/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO49;

/**
 *
 * @author USUARIO
 */
public class CompraInternacional extends Compra {
    
    double impuestoImportacion;
    double PrecioTotalConImpuesto;

    public CompraInternacional( int numeroCompra, String proveedor, int cantidadProducto, double precioPorProducto, double impuestoImportacion) {
        super(numeroCompra, proveedor, cantidadProducto, precioPorProducto);
        this.impuestoImportacion = impuestoImportacion;
        this.PrecioTotalConImpuesto = metodoPrecioTotalConImpuesto();
        
        
    }

    
    public void setImpuestoImportacion(double impuestoImportacion) {
        this.impuestoImportacion = impuestoImportacion;
        this.PrecioTotalConImpuesto = metodoPrecioTotalConImpuesto();
    }
    public double getImpuestoImportacion() {
        return impuestoImportacion;
    }

    

    public void setPrecioTotalConImpuesto(double PrecioTotalConImpuesto) {
        this.PrecioTotalConImpuesto = PrecioTotalConImpuesto;
    }
    public double getPrecioTotalConImpuesto() {
        return PrecioTotalConImpuesto;
    }

    
    public double metodoPrecioTotalConImpuesto(){
    
        return this.precioTotal + this.impuestoImportacion;
    }
    
    
    @Override
    public String toString() {
        return "Compra {" +
            "Numero compra=" + getNumeroCompra() +
            ", Proveedor=" + getProveedor() +
            ", Cantidad de productos=" + getCantidadProducto() +
            ", Precio por producto=" + getPrecioPorProducto() +
            ", Precio total=" + metodoPrecioTotal() +
            ", Impuesto de importación=" + getImpuestoImportacion() +
            ", Precio total con impuesto=" + metodoPrecioTotalConImpuesto() +
            '}';
    
    }    
}
