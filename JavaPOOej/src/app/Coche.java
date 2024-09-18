package app;

public class Coche {
    
    private String marca = "Toyota";
    private String modelo = "Corolla";
    private int año = 2020;
    private double precio = 20000;

    public void imprimirDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }
}

