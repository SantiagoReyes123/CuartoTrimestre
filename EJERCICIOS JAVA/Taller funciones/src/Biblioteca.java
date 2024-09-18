



public class Biblioteca {
    
    public String titulo;
    public String autor;
    public int cantidad;

    public Biblioteca(String titulo, String autor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }
    
    
    public static void main(String[] args) {
        
        Biblioteca libro[] = {new Biblioteca("el lobo","juan", 3),
                              new Biblioteca("Lolo", "Andres", 2)};
        
        for (int i = 0; i < libro.length; i++) {
            
            
            
        }
        
    }
    
    
    
    
    
    
    
}
