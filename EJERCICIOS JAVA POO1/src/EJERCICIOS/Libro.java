/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;


public class Libro {
    String Isbn;
    String Titulo;
    String Autor;
    boolean Disponible;
    
    
    //metodo imprimir informacion
    public void metodoMostrar(){
        System.out.println("El isbn es: " + Isbn);
        System.out.println("El titulo es: " + Titulo);
        System.out.println("El autor es: " + Autor);
        System.out.println("El disponible es: " + Disponible);

    }
    
}
