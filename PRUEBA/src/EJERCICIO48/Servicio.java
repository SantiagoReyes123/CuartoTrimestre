/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO48;

/**
 *
 * @author USUARIO
 */
public class Servicio {
    
    String codigoServicio;
    String descripcion;
    double precioHora;
    int horasTrabajadas;
    double precioTotal;

    public Servicio(String codigoServicio, String descripcion, double precioHora, int horasTrabajadas) {
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = metodoPrecioTotal();
    }

    
    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }
    public String getCodigoServicio() {
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
        this.precioTotal = metodoPrecioTotal();
    }
    public double getPrecioHora() {
        return precioHora;
    }

    

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = metodoPrecioTotal();
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public double metodoPrecioTotal(){
    
        return this.precioHora * this.horasTrabajadas;
    }
    
    @Override
    public String toString() {
        return "Servicio{" +
                ", Codigo =" + codigoServicio +
                ", Descripcion   =" + descripcion +
                ", Precio por hora   =" + precioHora +
                ", Horas trabajadas    =" + horasTrabajadas +
                ", Precio total      =" + metodoPrecioTotal()  +
                '}';
    }

    
    
    
    

    
    
    
    
    
    
    
    
}
