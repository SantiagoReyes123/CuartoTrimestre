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
public class Departamento {
    
    private String nombreDepartamento;
    private String ubicacion;
    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.nombreDepartamento = JOptionPane.showInputDialog( "Digite el nombre del departamento;");
        this.ubicacion = JOptionPane.showInputDialog("Digite la ubicacion del proyecto:");
        this.empleados = new ArrayList<>();
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
        JOptionPane.showMessageDialog(null,"El empleado: " + empleado.getNombre() + "se ha agregado al departamento: " + nombreDepartamento);
    }
    
    
    public void mostrarEmpleados(){
        StringBuilder listaEmpleados= new StringBuilder("Lista de los empleados en el departamento; " +  nombreDepartamento);
        
        for (Empleado emple: empleados) {
            listaEmpleados.append(emple.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
    
    
    
    
    
}
