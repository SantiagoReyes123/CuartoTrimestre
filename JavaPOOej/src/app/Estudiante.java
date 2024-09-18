package app;

public class Estudiante {
    
    private String nombre = "Juan";
    private int edad = 20;
    private String carrera = "Ingeniería";
    private double promedio = 8.5;

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}
