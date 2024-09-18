/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Juego {
    
    private String titulo;
    private String plataforma;
    private int anioLanzamiento;
    private String genero;
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    
    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getPlataforma() {
        return plataforma;
    }
    
    
    public void setAnoLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public int getAnoLanzamiento() {
        return anioLanzamiento;
    }
    
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    
    
    public Juego(String titulo, String plataforma, int anioLanzamiento, String genero) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anioLanzamiento = anioLanzamiento;
        this.genero = genero;
    }
    
    
    @Override
    public String toString() {
        return "Juego{" +
                "Titulo='" + titulo + '\'' +
                ", Plataforma='" + plataforma + '\'' +
                ", Anio de lanzamiento=" + anioLanzamiento +
                ", Genero='" + genero + '\'' +
                '}';
    }
    
    
    
    

        
    
}
