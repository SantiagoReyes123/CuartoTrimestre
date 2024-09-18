/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Producto {
    
    private String nombre;
    private String codigo;
    private String tipoProducto;
    private double precio;
    private ArrayList<Fabricante> fabricantes;

    public Producto(String nombre, String codigo, String tipoProducto, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.fabricantes = new  ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", tipoProducto=" + tipoProducto + ", precio=" + precio + ", fabricantes=" + fabricantes + '}';
    }
    
    
    
    
    
    
    
}
