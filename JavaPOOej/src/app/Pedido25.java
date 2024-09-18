
package app;

public class Pedido25 {
    
    private String numeroPedido;
    private String cliente;
    private int cantidadArticulos;
    private double precioPorArticulo;
    private double precioTotal;

    public Pedido25(String numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.cantidadArticulos = cantidadArticulos;
        this.precioPorArticulo = precioPorArticulo;
        this.precioTotal = cantidadArticulos * precioPorArticulo;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Número de pedido: " + numeroPedido +
                " / Cliente: " + cliente +
                " / Cantidad de artículos: " + cantidadArticulos +
                " / Precio por artículo: " + precioPorArticulo +
                " / Precio total: " + precioTotal;
    }
}
