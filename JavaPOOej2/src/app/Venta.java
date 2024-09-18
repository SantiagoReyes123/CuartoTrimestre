
package app;

public class Venta {

    public String producto;
    public int cantidad;
    public double precioUnitario;

    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    private double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public double obtenerTotal() {
        return calcularTotal();
    }

    @Override
    public String toString() {
        return  "producto " + producto +
                " / cantidad " + cantidad +
                " / precioUnitario " + precioUnitario;
    }
}
