
package app;

public class Compra {
    
    private String numero;
    private String proveedor;
    private int cantidadProductos;
    private double precioPorProducto;

    public Compra(String numero, String proveedor, int cantidadProductos, double precioPorProducto) {
        this.numero = numero;
        this.proveedor = proveedor;
        this.cantidadProductos = cantidadProductos;
        this.precioPorProducto = precioPorProducto;
    }
    
    
    
    public double calcularCostoTotal() {
        return cantidadProductos * precioPorProducto;
    }
    
    @Override
    public String toString() {
        return "numero " + numero +
                " / proveedor " + proveedor +
                " / cantidadProductos " + cantidadProductos +
                " / precioPorProducto " + precioPorProducto;
    }
    
}
