package app;

public class Paciente {
    
    private String nombre = "María";
    private int edad = 30;
    private String enfermedad = "Gripe";
    private String doctor = "Dr. Pérez";

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Enfermedad: " + enfermedad);
        System.out.println("Doctor: " + doctor);
    }
}

