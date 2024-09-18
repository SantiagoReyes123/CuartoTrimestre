/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Servicio {
    
    private int codigoServicio;
    private String descripcion;
    private double precioHora;
    private int horasTrabajadas;
    private double precioTotal;
    
    
    
    public double calcularPrecioTotal(){
    
        return this.precioHora * this.horasTrabajadas;
    }

    
    
    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }
    public int getCodigoServicio() {
        return codigoServicio;
    }

    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
        this.precioTotal = calcularPrecioTotal();
    }
    public double getPrecioHora() {
        return precioHora;
    }

    

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = calcularPrecioTotal();

    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    
    
    public Servicio(int codigoServicio, String descripcion, double precioHora, int horasTrabajadas){
    
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = calcularPrecioTotal();
    }
    
    
    @Override
    public String toString() {
        return "Servicio{" +
                "Codigo servicio='" + codigoServicio + '\'' +
                ", Descripcion =" + descripcion +
                ", Precio por hora  =" + precioHora +
                ",  Horas trabajadas=" + horasTrabajadas +
                ",  Precio total =" + precioTotal +
                '}';
    }

    
    
    
    
    
}
