/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO50;

/**
 *
 * @author USUARIO
 */
public class Empleado {
   
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    
    @Override
    public String toString() {
        return "Empleado {" +
            ", Nombre=" + nombre +
            ", Salario base=" + salarioBase +
            '}';
    
    }   

    
    
    
}
