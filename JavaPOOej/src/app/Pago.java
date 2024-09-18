
package app;

public class Pago {
    
    private String numeroPago;
    private String empleado;
    private double salarioBase;
    private double bonificacion;
    private double deduccion;
    private double salarioNeto;

    public Pago(String numeroPago, String empleado, double salarioBase, double bonificacion, double deduccion) {
        this.numeroPago = numeroPago;
        this.empleado = empleado;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
        this.deduccion = deduccion;
        this.salarioNeto = salarioBase + bonificacion - deduccion;
    }

    public String getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(String numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    @Override
    public String toString() {
        return "Número de pago: " + numeroPago +
                " / Empleado: " + empleado +
                " / Salario base: " + salarioBase +
                " / Bonificación: " + bonificacion +
                " / Deducción: " + deduccion +
                " / Salario neto: " + salarioNeto;
    }
}
