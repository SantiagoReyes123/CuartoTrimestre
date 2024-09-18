
package app;

public class Producto {
    
    protected String codigo;
    protected String nombre;
    protected double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= this.precio * porcentaje / 100;
        }
    }
    
    @Override
    public String toString() {
        return "codigo " + codigo +
                " / nombre " + nombre +
                " / precio " + precio;
    }
}
