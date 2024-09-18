/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Libro1 {
    private String titulo;
    private String autor;
    private int cantidadEnStock;
    
    public void mostrarLibro() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Cantidad en stock: " + cantidadEnStock);
    }
    
    
    public class InventarioBiblioteca{
    
        private Libro1[] libros;
        private int contador;
        
        
        public InventarioBiblioteca(int tamanio){
        
            libros = new Libro1[tamanio];
            contador =0;
        }
        
        public void agregarLibro(Libro1 libro){
        
            if (contador < libros.length) {
                libros[contador] = Libro1.this;
                contador++;
                
            } else {
                System.out.println("Inventario lleno, no se puede agregar más libros.");

            }
        }
        public void mostrarInventario() {
            for (int i = 0; i < contador; i++) {
            libros[i].mostrarLibro();
        }
            
        
    }
    }
    
}
