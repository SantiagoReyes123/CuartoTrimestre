
package app;

public class Servicio {
    
    private String codigoServicio;
    private String descripcion;
    private double precioPorHora;
    private int horasTrabajadas;
    private double precioTotal;

    public Servicio(String codigoServicio, String descripcion, double precioPorHora, int horasTrabajadas) {
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = precioPorHora * horasTrabajadas;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Código de servicio: " + codigoServicio +
                " / Descripción: " + descripcion +
                " / Precio por hora: " + precioPorHora +
                " / Horas trabajadas: " + horasTrabajadas +
                " / Precio total: " + precioTotal;
    }
}
