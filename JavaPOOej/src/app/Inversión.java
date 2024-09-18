
package app;

public class Inversión {
    private String codigoInversion;
    private String inversor;
    private double montoInicial;
    private double tasaInteresAnual;
    private double interesGenerado;

    // Constructor
    public Inversión(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual) {
        this.codigoInversion = codigoInversion;
        this.inversor = inversor;
        this.montoInicial = montoInicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesGenerado = montoInicial * tasaInteresAnual / 100;
    }

    // Getters y Setters
    public String getCodigoInversion() {
        return codigoInversion;
    }

    public void setCodigoInversion(String codigoInversion) {
        this.codigoInversion = codigoInversion;
    }

    public String getInversor() {
        return inversor;
    }

    public void setInversor(String inversor) {
        this.inversor = inversor;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public double getInteresGenerado() {
        return interesGenerado;
    }

    @Override
    public String toString() {
        return "Código de inversión: " + codigoInversion +
                " / Inversor: " + inversor +
                " / Monto inicial: " + montoInicial +
                " / Tasa de interés anual: " + tasaInteresAnual +
                " / Interés generado: " + interesGenerado;
    }
}
