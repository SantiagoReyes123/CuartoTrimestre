/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Ventas {
    
    private String producto;
    private int cantidad;
    private LocalDate fechaInicio;
    private LocalDate fehcaFin;
    //private String fecha;
    private double total;

    public Ventas(String producto, int cantidad, LocalDate fechaInicio, LocalDate fehcaFin, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaInicio = fechaInicio;
        this.fehcaFin = fehcaFin;
        this.total = total;
    }

   
    

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFehcaFin() {
        return fehcaFin;
    }


    public double getTotal() {
        return total;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.producto);
        hash = 11 * hash + this.cantidad;
        hash = 11 * hash + Objects.hashCode(this.fechaInicio);
        hash = 11 * hash + Objects.hashCode(this.fehcaFin);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ventas other = (Ventas) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        return Objects.equals(this.fehcaFin, other.fehcaFin);
    }

    @Override
    public String toString() {
        return "Ventas{" + "producto=" + producto + ", cantidad=" + cantidad + ", fechaInicio=" + fechaInicio + ", fehcaFin=" + fehcaFin + ", total=" + total + '}';
    }

   
    
    
}
