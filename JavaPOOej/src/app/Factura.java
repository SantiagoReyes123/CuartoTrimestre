
package app;

public class Factura {
    
    private int numFactura;
    private String fecha;
    private String cliente;
    private double importeTotal;

    public Factura(int numFactura, String fecha, String cliente, double importeTotal) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importeTotal = importeTotal;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
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

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Número de factura: " + numFactura +
                " /  Fecha: " +  fecha +
                " / Cliente: " + cliente +
                " / Importe total: "+ importeTotal;
        return retorno;
    }
}
