/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Empleadoo {
    
    private String nombre;
    private int horasTrabajadas;
    private double pagoHora;
    private double salarioTotal;
    
    public double calcularSalarioTotal(){
    
        return this.horasTrabajadas * this.pagoHora;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){  
        return nombre;
    }

    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.salarioTotal = calcularSalarioTotal();
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
        this.salarioTotal = calcularSalarioTotal();
    }
    public double getPagoHora() {
        return pagoHora;
    }
    
    public double getSalarioTotal() {
        return salarioTotal;
    }
    
    
    public Empleadoo(String nombre, int horasTrabajadas, double pagoHora){
    
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
        this.salarioTotal = calcularSalarioTotal();
    }
    
    
    
    
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Horas trabajadas=" + horasTrabajadas +
                ", Pago por hora=" + pagoHora +
                ", Salario total=" + salarioTotal +
                '}';
    }

    
    
    
    
    
    
}
