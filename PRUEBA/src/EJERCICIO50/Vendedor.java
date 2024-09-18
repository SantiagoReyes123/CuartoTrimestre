/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO50;

/**
 *
 * @author USUARIO
 */
public class Vendedor extends Empleado{
    
    double comisionVenta;
    double salarioTotal;

    public Vendedor( String nombre, double salarioBase, double comisionVenta) {
        super(nombre, salarioBase);
        this.comisionVenta = comisionVenta;
        this.salarioTotal = metodoSalarioTotal3();
    }

    
    public void setComisionVenta(double comisionVenta) {
        this.comisionVenta = comisionVenta;
        this.salarioTotal = metodoSalarioTotal3();
    }
    public double getComisionVenta() {
        return comisionVenta;
    }

    

     public void setSalarioTotal(double salarioToral) {
        this.salarioTotal = salarioToral;
    }
    public double getSalarioToral() {
        return salarioTotal;
    }
    
    public double metodoSalarioTotal3(){
    
        return this.salarioBase + this.comisionVenta;
    }
    
    @Override
    public String toString() {
        return "Vendedor {" +
            ", Nombre=" + getNombre() +
            ", Salario base=" + getSalarioBase() +
            ", Comisiones por venta = " + comisionVenta+
            ", Salario total = " + metodoSalarioTotal3() +
            '}';
    
    }  

   
    
    
    
    
    
}
