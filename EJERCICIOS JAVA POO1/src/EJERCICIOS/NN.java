
package EJERCICIOS;

public class NN {
    
    private String nombre;
    private double salario;
    
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setSalario(double salario){
    
        this.salario = salario;
    }
    public double getSalario(){
    
        return salario;
    }
    
    
    public double calcularSalario(){
    
        return salario * 12;
    }
    
    public void NN(String nombre, double salario){
    
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Salario anual=" + salario +
                '}';
    }
    
}
