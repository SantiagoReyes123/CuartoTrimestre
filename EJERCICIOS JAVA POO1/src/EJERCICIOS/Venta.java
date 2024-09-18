/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Venta {
    
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;
    
    
    
    //metodo para sacar el precio total
   public double calcularPrecioTotal(){
        return this.cantidad * this.precioUnitario;
    }
   
    
    public void setProducto(String producto){
    
        this.producto = producto;
    }
    public String getProducto(){
    
        return producto;
    }

    
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = calcularPrecioTotal();
    }
    public int getCantidad() {
        return cantidad;
    }

    

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal();

    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    
    
    public Venta(String producto, int cantidad, double precioUnitario){
    
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal();
    }
    
     
    
    
        @Override

        public String toString() {
        return "Venta{" +
                "Producto='" + producto + '\'' +
                ", Cantidad=" + cantidad +
                ", Precio unitario=" + precioUnitario +
                ", Precio total=" + precioTotal +
                '}';
    }
    

    
    
    
    
}
