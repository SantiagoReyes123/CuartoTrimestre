
package app;

public class Empleado22 {
    
    private String nombre;
    private int horasTrabajadas;
    private double pagoHora;
    private double salarioTotal;

    public Empleado22(String nombre, int horasTrabajadas, double pagoHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
        this.salarioTotal = horasTrabajadas * pagoHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
    
    @Override
    public String toString() {
        String retorno = 
                "Producto: "+ nombre +
                " / Horas trabajadas: " + horasTrabajadas +
                " / Pago por hora: " + pagoHora +
                " / Salario total: " + salarioTotal;
        return retorno;
    }
    
}
