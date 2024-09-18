/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Proyecto {
    
    private String nombreProyecto;
    private double presupuesto;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList<Empleado> empleadosAsignados;

    public Proyecto() {
        this.nombreProyecto = JOptionPane.showInputDialog("Digite el nombre del proyecto:");
        this.presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Digite el presupuesto del proyecto:"));
        this.fechaInicio = JOptionPane.showInputDialog("Digite la fecha de inicio del proyecto:");
        this.fechaFin = JOptionPane.showInputDialog("Digite la fecha fin del proyecto;");
        this.empleadosAsignados = new ArrayList<>();

    }   

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public void asignarEmpleado(Empleado empleado){
        empleadosAsignados.add(empleado);
        JOptionPane.showMessageDialog(null, "El empleado: " + empleado.getNombre() + "fue asinado al proyecto: " + nombreProyecto);
    }
    public void mostrarEmpleadosAsigandos(){
        StringBuilder listaEmpleadosProyectos = new StringBuilder("Lista de los empleados asigandos a proyectos");
        
        for (Empleado emple : empleadosAsignados) {
            listaEmpleadosProyectos.append(emple.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null,listaEmpleadosProyectos.toString());
    }
    
    
    
    
    
}
