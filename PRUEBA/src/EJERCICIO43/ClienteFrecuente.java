/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO43;


public class ClienteFrecuente extends Cliente {
    
    double descuento;
    int numeroCompras;
    
    
    public ClienteFrecuente(String nombre, String direccion, String telefono, double descuento, int numeroCompras){
    
        super(nombre,direccion,telefono);
        this.descuento = descuento;
        this.numeroCompras  = numeroCompras;
    }

    
    
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getDescuento() {
        return descuento;
    }

    

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }
    public int getNumeroCompras() {
        return numeroCompras;
    }

    
    @Override
    public String toString() {
        return "Cliente Frecuente " + 
                ", Nombre ;" + getNombre() + 
                ", Direccion : " + getDireccion() +
                ", Telefono : " + getTelefono() +
                ", Descuento: " + descuento +
                ", Numero compras: " + numeroCompras;
                
    }
    
    
    
}
