
import EJERCICIO43.ClienteFrecuente;
import EJERCICIO44.Factura;
import EJERCICIO44.FacturaConDescuento;
import EJERCICIO45.PedidoExpress;
import EJERCICIO48.ServicioUrgente;
import EJERCICIO49.CompraInternacional;
import EJERCICIO50.Vendedor;
import PRUEBA1.Producto;
import PRUEBA1.ProductoPerecedero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        //EJERCICIO 42
        Producto producto1 = new Producto("001", "Lata de Tomates", 1.50);
        ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("002", "Leche", 0.99, "2024-08-15", 20);
        ProductoPerecedero productoPerecedero2 = new ProductoPerecedero("003", "Yogurt", 1.20, "2024-08-05", 30);

        System.out.println(producto1);
        System.out.println(productoPerecedero1);
        System.out.println(productoPerecedero2);
        
        
        
        System.out.println("*********************************************************************************************");
        
        //EJERCICIO 43
        ClienteFrecuente cliente1 = new ClienteFrecuente("Andres", "calle #33", "3455",10,4);
        
        System.out.println(cliente1);
        
        
        
        System.out.println("*********************************************************************************************");

        
        
        
        //EJERCICIO 44
        
        FacturaConDescuento facturaDes1 = new FacturaConDescuento(1,30.000, 40);
        
        System.out.println(facturaDes1);
        
        
        
        System.out.println("*********************************************************************************************");

        
        //EJERCICIO 45
        
        PedidoExpress ee = new PedidoExpress(1, "Sara", 4, 10.000, 5000, 3);
        
        System.out.println(ee);
        
        
        
        System.out.println("*********************************************************************************************");

        
        
        //EJERCICIO 46
        
        //EJERCICIO 48
        
        ServicioUrgente servicio = new ServicioUrgente("34r", "Camcio de tubo", 4.000, 6, 25);
        
        System.out.println(servicio);
        
        
        System.out.println("*********************************************************************************************");

        
        //EJERCICIO 49
        
        CompraInternacional compra1 = new CompraInternacional(1, "Juan", 3, 5.000, 15);
        
        System.out.println(compra1);
        
        
        
        System.out.println("*********************************************************************************************");

        
        //EJERCICIO 50
        
        Vendedor vendedor = new Vendedor("Andres", 10.000, 500);
        System.out.println(vendedor);


        
        System.out.println("*********************************************************************************************");

        
        //EJERCICIO 51
        
        
    }
    
}
