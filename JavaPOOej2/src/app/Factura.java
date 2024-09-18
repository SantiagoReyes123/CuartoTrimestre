
package app;


public class Factura {
    
    public String numero;
    public String cliente;
    public double subtotal;

    public Factura(String numero, String cliente, double subtotal) {
        this.numero = numero;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }
    
    private double calcularTotal() {
        double total = subtotal * 0.19;
        total = total + subtotal;
        return total;
    }
    
    public double obtenerTotal() {
        return calcularTotal();
    }
 
    @Override
    public String toString() {
        return  "Numero " + numero +
                " / Cliente '" + cliente +
                " / Subtotal " + subtotal;
    }
}
