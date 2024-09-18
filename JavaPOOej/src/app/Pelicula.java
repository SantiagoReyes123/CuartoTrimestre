
package app;

public class Pelicula {

    private String titulo;
    private String director;
    private int año;
    private String genero;

    // Constructor para inicializar todos los atributos
    public Pelicula(String titulo, String director, int año, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.genero = genero;
    }
    
    // Metodos Getter Y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Titulo: " + titulo +
                " / Director: " + director +
                " / Año: " + año +
                " / Genero: "+ genero;
        return retorno;
    }
}
