package app;

public class Cliente {
    
    private String nombre = "Carlos";
    private String direccion = "Calle 123";
    private String telefono = "123456789";
    private String email = "carlos@gmail.com";

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }
}

