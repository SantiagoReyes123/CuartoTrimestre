/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.time.LocalDate;

public class Factura {
    private int numeroFactura;
    private String fecha;
    private String cliente;
    private double importeTotal;
    
    public void setNumeroFactura(int numeroFactura){
    
        this.numeroFactura = numeroFactura;
    }
    public int getNumeroFactura(){
    
        return numeroFactura;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }

    
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getCliente() {
        return cliente;
    }

    

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    public double getImporteTotal() {
        return importeTotal;
    }
    
    public Factura(int numeroFactura, String fecha, String cliente, double importeTotal){
    
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importeTotal = importeTotal;
    }
    
    @Override
    public String toString(){
    
        return "Factura{" +
                " Numero de facura='" + numeroFactura + '\'' +
                ", Fecha='" + fecha + '\'' +
                ", Cliente =" + cliente +
                ", Importe total ='" + importeTotal + '\'' +
                '}';
    } 

    
    
    
    
    
}
