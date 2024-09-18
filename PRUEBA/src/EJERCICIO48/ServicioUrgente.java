/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO48;

/**
 *
 * @author USUARIO
 */
public class ServicioUrgente extends Servicio {
    
    double recargoUrgncia;
    double precioTotalRecargo;

    public ServicioUrgente( String codigoServicio, String descripcion, double precioHora, int horasTrabajadas, double recargoUrgncia) {
        super(codigoServicio, descripcion, precioHora, horasTrabajadas);
        this.recargoUrgncia = recargoUrgncia;
        this.precioTotalRecargo = metodoPrecioTotalRecargo();
        
        
    }

    
    public void setRecargoUrgncia(double recargoUrgncia) {
        this.recargoUrgncia = recargoUrgncia;
        this.precioTotalRecargo = metodoPrecioTotalRecargo();
    }
    public double getRecargoUrgncia() {
        return recargoUrgncia;
    }

    

    public void setPrecioTotalRecargo(double precioTotalRecargo) {
        this.precioTotalRecargo = precioTotalRecargo;
    }
    public double getPrecioTotalRecargo() {
        return precioTotalRecargo;
    }
    
    public double metodoPrecioTotalRecargo(){
    
        return this.precioTotal + this.recargoUrgncia;
    
    }
    
    @Override
    public String toString() {
        return "Servicio urgente{" +
                ", Codigo =" + getCodigoServicio() +
                ", Descripcion   =" + getDescripcion() +
                ", Precio por hora   =" + getPrecioHora() +
                ", Horas trabajadas    =" + getHorasTrabajadas() +
                ", Precio total      =" + metodoPrecioTotal() +
                ", Recargo urgencia= " + recargoUrgncia+
                ", Precio total con recargo= " + metodoPrecioTotalRecargo();
                
    }

    
    
    
    
    
    
}
