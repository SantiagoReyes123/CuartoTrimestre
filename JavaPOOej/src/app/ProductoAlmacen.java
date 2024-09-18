
package app;

public class ProductoAlmacen {
    
   private String codigoProducto;
    private String nombreProducto;
    private int cantidadEnAlmacen;
    private double precioPorUnidad;
    private double valorTotalEnAlmacen;

    public ProductoAlmacen(String codigoProducto, String nombreProducto, int cantidadEnAlmacen, double precioPorUnidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadEnAlmacen = cantidadEnAlmacen;
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnAlmacen = cantidadEnAlmacen * precioPorUnidad;
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

    public int getCantidadEnAlmacen() {
        return cantidadEnAlmacen;
    }

    public void setCantidadEnAlmacen(int cantidadEnAlmacen) {
        this.cantidadEnAlmacen = cantidadEnAlmacen;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public double getValorTotalEnAlmacen() {
        return valorTotalEnAlmacen;
    }

    @Override
    public String toString() {
        return "Código del producto: " + codigoProducto +
                " / Nombre del producto: " + nombreProducto +
                " / Cantidad en almacén: " + cantidadEnAlmacen +
                " / Precio por unidad: " + precioPorUnidad +
                " / Valor total en almacén: " + valorTotalEnAlmacen;
    } 
}
