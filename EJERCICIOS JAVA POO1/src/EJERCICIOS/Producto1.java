/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Producto1 {
    
    protected String codigo;
    protected String nombre;
    protected double precio;
    
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    

     public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    
    
    
    public void metodoDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio = this.precio - (this.precio * porcentaje / 100);
        }
    }
    
    public Producto1(String codigo, String nombre, double precio){
    
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
     @Override
    public String toString() {
        return "Producto{" +
                "Codigo='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                '}';
    }
    
    

   
    
    
    
    
}
