
package app;

public class Orden {
    
    private int numOrden;
    private String fecha;
    private String cliente;
    private double montoTotal;

    public Orden(int numOrden, String fecha, String cliente, double montoTotal) {
        this.numOrden = numOrden;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Número de orden: " + numOrden +
                " / Fecha: " + fecha +
                " / Cliente: " + cliente +
                " / Monto total: "+ montoTotal;
        return retorno;
    }
}
