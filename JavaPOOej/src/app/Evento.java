package app;

public class Evento {
    
    private String nombre = "Concierto";
    private String fecha = "2023-08-15";
    private String lugar = "Estadio";
    private int asistentes = 10000;

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Lugar: " + lugar);
        System.out.println("Asistentes: " + asistentes);
    }
}
