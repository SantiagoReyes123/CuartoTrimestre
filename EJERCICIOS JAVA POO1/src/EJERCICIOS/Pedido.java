/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

public class Pedido {
    
    int codigoPedido;
    String producto;
    int cantidad;
    double precioTotal;
    
    public void metodoPedido(){
        
        System.out.println("La informacion sobre el producto es:");
        System.out.println("El codigo es: " + codigoPedido);
        System.out.println("El producto es: " + producto);
        System.out.println("La cantidad es de: " + cantidad);
        System.out.println("El precio es de: " + precioTotal);
        
    }
    
}
