
package app;

public class Servicio {
   
    public String codigo;
    public String descripcion;
    public double precioPorHora;
    public int horasTrabajadas;
    
    public Servicio(String codigo, String descripcion, double precioPorHora, int horasTrabajadas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    protected double calcularCostoTotal() {
        return precioPorHora * horasTrabajadas;
    }

    public double obtenerCostoTotal() {
        return calcularCostoTotal();
    }

    @Override
    public String toString() {
        return  "codigo" + codigo +
                " / descripcion " + descripcion + 
                " / precioPorHora " + precioPorHora +
                " / horasTrabajadas " + horasTrabajadas;
    }
}
