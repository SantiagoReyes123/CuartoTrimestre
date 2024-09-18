/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Proveedor1 {
    
    protected String nombre;
    protected String empresa;
    protected String telefono;

    public Proveedor1(String nombre, String empresa, String telefono){
    
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    

     public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getEmpresa() {
        return empresa;
    }

   

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    
    
    //se puede usar este metodo o el toSring
    public void metodoinfo(){
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("La empresa es: " + empresa);
        System.out.println("El telefono es: " + telefono);
        
    
        
    }

    
    
    

    
}
