/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Inversion {
    
    private int codigoInversion;
    private String inversor;
    private double montoInicial;
    private double tasaInteresAnual;
    private double interesGenerado;
    
    
    public double calcularInteresGenerado(){
    
        return this.montoInicial * this.tasaInteresAnual / 100;
    }
    
    
    public void setCodigoInversion(int codigoInversion){
        this.codigoInversion = codigoInversion;
    }
    public int getCodigoInversion(){
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
        this.interesGenerado = calcularInteresGenerado();
    }
    public double getMontoInicial() {
        return montoInicial;
    }

    

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesGenerado = calcularInteresGenerado();

    }
    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
    
    
    public Inversion(int codigoInversion, String inveror, double montoInicial, double tasaInteresAnual){
    
        this.codigoInversion = codigoInversion;
        this.inversor = inveror;
        this.montoInicial = montoInicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesGenerado = calcularInteresGenerado();
    }
    
    
    @Override
    public String toString() {
        return "Inversion{" +
                "Codigo inversion='" + codigoInversion + '\'' +
                ", Inversor =" + inversor +
                ", Monto inicial  =" + montoInicial +
                ", Tasa interes anual =" + tasaInteresAnual +
                ", Interes Generado   =" + interesGenerado +
                '}';
    }

    
    
    
    
    
    
}
