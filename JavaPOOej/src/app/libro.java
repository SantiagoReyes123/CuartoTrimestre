
package app;

public class libro {
    
    private String ISBN = "Nose";
    private String titulo = "Super Libro";
    private String autor = "Fulano";
    private boolean disponible = true;

    public void imprimirDetalles() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}


