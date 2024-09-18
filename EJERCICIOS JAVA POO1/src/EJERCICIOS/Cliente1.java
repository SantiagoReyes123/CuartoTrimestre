/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Cliente1 {
    
    private String nombre;
    private String direccion;
    private String telefono;
    
    
    
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
    public String getNombre(){
        return nombre;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    
    
    public Cliente1(String nombre, String direccion, String telefono){
    
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
     @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Telefono='" + telefono + '\'' +
                '}';
    }
    
    
    
    
    
}
