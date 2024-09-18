/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;
    private String puesto;

     public Empleado() {
        this.nombre = JOptionPane.showInputDialog("Ingrese le nombre del empleado:");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del empleado:"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado"));
        this.puesto = JOptionPane.showInputDialog("Digite el cargo del empleado:");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void asiganarProyecto(Proyecto proyecto){
        JOptionPane.showMessageDialog(null, "El empleado: " + nombre + "se asigano al proyecto" + proyecto.getNombreProyecto());
    }    
}
