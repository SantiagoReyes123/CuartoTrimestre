/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;


public class Pelicula {
    
    private String titulo;
    private String director;
    private int anio;
    private String genero;
    
    
    //metodo set
    public void setTitulo(String titulo){
        this.titulo = titulo;
        
    } 
    //metodo get
    public String getTitulo(){
        return titulo;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
    
    
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

     public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    //METODO CONTRUCTOR
    
    public Pelicula(String titulo, String director, int anio, String genero){
        
        this.titulo = titulo;
        this.director =director;
        this.anio = anio;
        this.genero = genero;
    
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Pelicula = " +
                "Titulo='" + titulo + '\'' +
                ", Director='" + director + '\'' +
                ", Año=" + anio +
                ", Genero='" + genero + '\'' +
                '}';
    }
    
    

   
    
    

    
    
    
    
    
}
