/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Universidad {
    
    private String nombre;
    private String direccion;
    private int numeroEstudiantes;
    private int ranking;
    
    
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    public String getNombre(){
    
        return nombre;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }
    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public int getRanking() {
        return ranking;
    }
    
    
    public Universidad(String nombre, String direcciom, int numeroEstudiantes, int ranking){
    
        this.nombre = nombre;
        this.direccion = direcciom;
        this.numeroEstudiantes = numeroEstudiantes;
        this.ranking = ranking;
    }

    
    @Override
    public String toString(){
    
        return "Universidad{" +
                " Nombre='" + nombre + '\'' +
                ", Direcion='" + direccion + '\'' +
                ", Numero de estudiantes =" + numeroEstudiantes +
                ", Ranking ='" + ranking + '\'' +
                '}';
    }
    
    
    
    
  
    
}
