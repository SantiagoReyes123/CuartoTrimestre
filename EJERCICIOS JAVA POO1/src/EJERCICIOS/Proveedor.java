/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author USUARIO
 */
public class Proveedor {
    
    private String nombre;
    private String empresa;
    private int telefono;
    private String email;
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    public String getNombre(){
    
        return nombre;
    }

    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getEmpresa() {
        return empresa;
    }

    

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    
    public Proveedor(String nombre, String empresa, int telefono, String email){
    
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.email = email;
    }
    
     @Override
    public String toString(){
    
        return "Proveedor{" +
                " Nombre='" + nombre + '\'' +
                ", Empresa='" + empresa + '\'' +
                ", Telefono =" + telefono +
                ", Email ='" + email + '\'' +
                '}';
    }    
}
