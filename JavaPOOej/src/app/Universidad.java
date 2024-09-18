
package app;

public class Universidad {
    
    private String nombre;
    private String dirrecion;
    private int numeroEstudiantes;
    private int ranking;

    public Universidad(String nombre, String dirrecion, int numeroEstudiantes, int ranking) {
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.numeroEstudiantes = numeroEstudiantes;
        this.ranking = ranking;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Nombre: " + nombre +
                " / Dirección: " + dirrecion +
                " / Número de estudiantes: " + numeroEstudiantes +
                " / Ranking: "+ ranking;
        return retorno;
    }
}
