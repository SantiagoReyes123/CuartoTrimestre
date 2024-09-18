/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Tienda {
    
    private ArrayList<Producto> productos;
    private ArrayList<Fabricante> fabricantes;
    private ArrayList<Ventas> ventas;
    
    public void agregarProductos(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto");
        String tipoProducto = JOptionPane.showInputDialog("Ingrese el tipo del producto");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        
        Producto producto = new Producto(nombre, codigo, tipoProducto, precio);
        productos.add(producto);
        JOptionPane.showMessageDialog(null,"Porducto agregado");

    }
    
    public void registrarFabricantes(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del fabricante");
        String pais = JOptionPane.showInputDialog("Ingrese el pais de origen del fabricante");
        String anioFundicion = JOptionPane.showInputDialog("Ingrese el año de fundacion");
        
        Fabricante fabricante = new Fabricante(nombre, pais, anioFundicion);
        fabricantes.add(fabricante);
        JOptionPane.showInputDialog(null,"Registro de fabricante exitoso!!");
    }
    
    public void realizarVentas(){
        String codigo = JOptionPane.showInputDialog("Ingrese le codigo del prodcuto");
        String nombreF =JOptionPane.showInputDialog("Ingrese el nombre del fabricante");
        String pais = JOptionPane.showInputDialog("Ingrese el pais del fabricante");
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del prodcuto");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
        LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha inicio de la venta"));
        LocalDate fechaFin = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha fin de las evntas"));

        double total = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta"));
        
        
        Producto producto = productos.stream()
            .filter(p -> p.getCodigo().equals(codigo))
            .findFirst()
            .orElse(null);

        
         Fabricante fabricante = fabricantes.stream()
            .filter(f -> f.getNombre().equalsIgnoreCase(nombreF))
            .filter(f -> f.getPais().equalsIgnoreCase(pais))
            .findFirst()
            .orElse(null);
        
        if(producto != null && fabricante != null){
            //Tienda venta = new Tienda(producto,fabricante,nombreProducto,cantidad,LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE));
            Ventas ventass = new Ventas(nombreProducto,cantidad,fechaInicio,fechaFin,total);
            ventas.add(ventass);
            JOptionPane.showMessageDialog(null, "Venta exitosa\n" + ventas);
        }else{
            JOptionPane.showMessageDialog(null, "Cuidado!! producto o fabricante no encontrado");
        }
    }
    
    public double totalVentas(){
        LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha inicio del palso"));
        LocalDate fechaFin = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha fin del palso"));

        double total = 0;
        for (Ventas ventass : ventas) {
            if(ventass.getFechaInicio().isAfter(fechaInicio) && ventass.getFehcaFin().isBefore(fechaFin)){
                total += ventass.getTotal();
            }
        }
        
        JOptionPane.showMessageDialog(null, "El total de ventas es de: " + total);
        return total;
        
    }
    
}
