/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Empleado1 {
    
    private String nombre;
    private double salario;
    
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setSalario(double salario){
    
        this.salario = salario;
    }
    public double getSalario(){
    
        return salario;
    }
    
    
    public double calcularSalario(){
    
        return this.salario * 12;
    }
    
    public  Empleado1(String nombre, double salario){
    
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Salario anual=" + salario +
                '}';
    }
    
}
