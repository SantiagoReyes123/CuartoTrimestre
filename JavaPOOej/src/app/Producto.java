package app;

public class Producto {
    
    private String codigo = "A123";
    private String nombre = "Laptop";
    private double precio = 1000;
    private int stock = 50;

    public void imprimirDetalles() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}
