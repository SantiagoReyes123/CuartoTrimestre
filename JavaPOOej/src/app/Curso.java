package app;

public class Curso {
    
    private String nombre = "Matemáticas";
    private String codigo = "MAT101";
    private int creditos = 3;
    private String profesor = "Prof. López";

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Créditos: " + creditos);
        System.out.println("Profesor: " + profesor);
    }
}

