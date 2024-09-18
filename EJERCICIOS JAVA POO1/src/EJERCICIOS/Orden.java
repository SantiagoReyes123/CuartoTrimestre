/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Orden {
    
    private int numeroOrden;
    private String fecha;
    private String cliente;
    private double montoTotal;
    
    public void setNumeroOrden(int numeroOrden){
    
        this.numeroOrden =numeroOrden;
    }
    public int getNumeroOrden(){
    
        return numeroOrden;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }

    

    public void setCliente(String Cliente) {
        this.cliente = Cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    
    public Orden(int numeroOrden, String fecha, String cliente, double montoTotal){
    
        this.numeroOrden = numeroOrden;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        
        
    }
    
    @Override
    public String toString(){
    
        return "Restaurante{" +
                "Numero Orden='" + numeroOrden + '\'' +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                ", montoTotal='" + montoTotal + '\'' +
                '}';
    }

    
}
