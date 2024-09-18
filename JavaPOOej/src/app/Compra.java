
package app;

public class Compra {
   private String numeroCompra;
    private String proveedor;
    private int cantidadProductos;
    private double precioPorProducto;
    private double precioTotal;

    public Compra(String numeroCompra, String proveedor, int cantidadProductos, double precioPorProducto) {
        this.numeroCompra = numeroCompra;
        this.proveedor = proveedor;
        this.cantidadProductos = cantidadProductos;
        this.precioPorProducto = precioPorProducto;
        this.precioTotal = cantidadProductos * precioPorProducto;
    } 

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getPrecioPorProducto() {
        return precioPorProducto;
    }

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
    
    @Override
    public String toString() {
        String retorno = 
                "Número de compra: "+ numeroCompra +
                " / Proveedor: " + proveedor +
                " / Cantidad de productos: " + cantidadProductos +
                " / Precio por producto: " + precioPorProducto +
                " / Precio total:" + precioTotal;
        return retorno;
    }
}
