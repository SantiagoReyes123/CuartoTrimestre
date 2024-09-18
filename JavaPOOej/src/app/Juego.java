
package app;

public class Juego {
    
    private String titulo;
    private String plataforma;
    private String añoLazamiento;
    private String genero;

    public Juego(String titulo, String plataforma, String añoLazamiento, String genero) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.añoLazamiento = añoLazamiento;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getAñoLazamiento() {
        return añoLazamiento;
    }

    public void setAñoLazamiento(String añoLazamiento) {
        this.añoLazamiento = añoLazamiento;
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
                "Título: " + titulo +
                " / Plataforma: " + plataforma +
                " / Año de lanzamiento: " + añoLazamiento +
                " / Género: "+ genero;
        return retorno;
    }
}
