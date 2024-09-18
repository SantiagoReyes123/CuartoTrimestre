package app;

public class Pedido {
    
    private String codigoPedido = "P001";
    private String producto = "Monitor";
    private int cantidad = 2;
    private double precioTotal = 400;

    public void imprimirDetalles() {
        System.out.println("Código del Pedido: " + codigoPedido);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Total: " + precioTotal);
    }
}

