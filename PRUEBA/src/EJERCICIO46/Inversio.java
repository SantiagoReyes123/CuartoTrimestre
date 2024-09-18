/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO46;


public class Inversio {
    
    String codigoInversion;
    String inversor;
    double montoInicial;
    double tasaInteresAnual;
    double interesGenerado;

    
    
    public void setCodigoInversion(String codigoInversion) {
        this.codigoInversion = codigoInversion;
    }
    public String getCodigoInversion() {
        return codigoInversion;
    }

    

    public void setInversor(String inversor) {
        this.inversor = inversor;
    }
    public String getInversor() {
        return inversor;
    }

    

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
        this.interesGenerado = metodoInteresGenerado();
    }
    public double getMontoInicial() {
        return montoInicial;
    }

    

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesGenerado = metodoInteresGenerado();
    }
    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    

    public void setInteresGenerado(double interesGenerado) {
        this.interesGenerado = interesGenerado;
    }
    public double getInteresGenerado() {
        return interesGenerado;
    }

    public Inversio(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual) {
        this.codigoInversion = codigoInversion;
        this.inversor = inversor;
        this.montoInicial = montoInicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesGenerado = metodoInteresGenerado();
    }
    
    public double metodoInteresGenerado(){
    
        return this.montoInicial *  this.tasaInteresAnual /100;
    }
    
    
    @Override
    public String toString() {
        return "Inversion{" +
                ", Codigo inversion =" + codigoInversion +
                ", Inversor   =" + inversor +
                ", Tasa interes anual     =" + tasaInteresAnual +
                ", Interes generado      =" + metodoInteresGenerado() +
                '}';
    }
    
    
    

    
    
    
    
    
}
