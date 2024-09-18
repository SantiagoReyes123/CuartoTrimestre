
package app;

public class ProductoInventario {
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadEnStock;
    private double precioPorUnidad;
    private double valorTotalEnStock;
    
    public ProductoInventario(String codigoProducto, String nombreProducto, int cantidadEnStock, double precioPorUnidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadEnStock = cantidadEnStock;
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnStock = cantidadEnStock * precioPorUnidad;
    }
    
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;      
    }

    public double getValorTotalEnStock() {
        return valorTotalEnStock;
    }
    
    @Override
    public String toString() {
        String retorno =
                "Producto: " + nombreProducto +
                " / Código: " + codigoProducto +
                " / Cantidad en stock: " + cantidadEnStock +
                " / Precio por unidad: " + precioPorUnidad +
                " / Valor total en stock: " + valorTotalEnStock;
        return retorno;
    }
}
