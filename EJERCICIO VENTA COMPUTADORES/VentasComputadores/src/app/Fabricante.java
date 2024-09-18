/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Fabricante {
    
    private String nombre;
    private String pais;
    private String anioFundicion;

    public Fabricante(String nombre, String pais, String anioFundicion) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioFundicion = anioFundicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getAnioFundicion() {
        return anioFundicion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.pais);
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
        final Fabricante other = (Fabricante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.pais, other.pais);
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nombre=" + nombre + ", pais=" + pais + ", anioFundicion=" + anioFundicion + '}';
    }
    
    
    
    
    
}
