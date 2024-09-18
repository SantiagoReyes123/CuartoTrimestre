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
public class Principal1 {
    public static void main(String[] args) {
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de trabajadores:"));
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        for (int i = 0; i < numeroEmpleados; i++) {
            listaEmpleados.add(new Empleado());
        }
        
        Departamento departamento = new Departamento();
        
        for (Empleado empleado : listaEmpleados) {
            departamento.agregarEmpleado(empleado);
            departamento.mostrarEmpleados();
        }
        
        Proyecto proyecto = new Proyecto();
        for (Empleado empleado : listaEmpleados) {
            proyecto.asignarEmpleado(empleado);
        }
        proyecto.mostrarEmpleadosAsigandos();
    }
    
}
