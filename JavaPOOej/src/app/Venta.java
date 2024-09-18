
package app;

public class Venta {
    
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;

    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = cantidad * precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
    
    @Override
    public String toString() {
        String retorno = 
                "Producto: "+ producto +
                " / Cantidad: " + cantidad +
                " / Precio Unitario: " + precioUnitario +
                " / Precio total: " + precioTotal;
        return retorno;
    }
    
    
        
}
