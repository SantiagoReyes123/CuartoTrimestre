
package app;

public class Empleado {
    
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
    
    @Override
    public String toString() {
        return "nombre " + nombre +
                " / salario " + salario;
    }
}
