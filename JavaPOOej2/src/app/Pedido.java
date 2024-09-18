
package app;

public class Pedido {
  
    protected String numero;
    protected String cliente;
    protected int cantidad;
    protected double precioPorUnidad;

    public Pedido(String numero, String cliente, int cantidad, double precioPorUnidad) {
        this.numero = numero;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }
    
     @Override
    public String toString() {
        return  "numero " + numero +
                " / cliente " + cliente +
                " / cantidad " + cantidad +
                " /  " + precioPorUnidad ;
    }
}
