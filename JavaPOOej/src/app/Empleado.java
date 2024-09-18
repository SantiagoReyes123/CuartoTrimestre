package app;

public class Empleado {
    
    private String nombre = "Ana";
    private String puesto = "Gerente";
    private double salario = 50000;
    private int antiguedad = 5;

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
        System.out.println("Antigüedad: " + antiguedad + " años");
    }
}

