/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Pago {
    
    private int numeroPago;
    private String empleado;
    private double salarioBase;
    private double bonificacion;
    private double deduccion;
    private double salarioNeto;
    
    
    public double calcularSalarioNeto(){
    
        return this.salarioBase + this.bonificacion - this.deduccion;
    }

    
    
    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }
    public int getNumeroPago() {
        return numeroPago;
    }

    

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    public String getEmpleado() {
        return empleado;
    }

   

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        this.salarioNeto = calcularSalarioNeto();
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
        this.salarioNeto = calcularSalarioNeto();

    }
    public double getBonificacion() {
        return bonificacion;
    }

    

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
        this.salarioNeto = calcularSalarioNeto();

    }
    public double getDeduccion() {
        return deduccion;
    }
    
    
    public Pago(int numeroPago, String empleado, double salarioBase, double bonificacin, double deduccion){
    
        this.numeroPago = numeroPago;
        this.empleado = empleado;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacin;
        this.deduccion = deduccion;
        this.salarioNeto = calcularSalarioNeto();
    }
    
    
    
    @Override
    public String toString() {
        return "Pago{" +
                "Numero pago='" + numeroPago + '\'' +
                ", Empleado =" + empleado +
                ", Salario base  =" + salarioBase +
                ", Bonificacion =" + bonificacion +
                ", Deduccion =" + deduccion +
                ", Salario neto =" + salarioNeto +
                '}';
    }
    
    

    
    
    
    
    
}
