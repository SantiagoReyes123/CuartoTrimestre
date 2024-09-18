// Aprendiz: Julian Alberto Gonzalez Carrascal
// Ejercicos de Java POO 30-...
package app;


public class Main {
    
    public static void main(String[] args) {
        
        // 31
        System.out.println("EJ 31");
        Empleado empleado = new Empleado("Fulano",1000);
        System.out.println(empleado);
        System.out.println("El salario anual es: " + empleado.calcularSalarioAnual());
        System.out.println("- - - - - - - - - - -"); 
        
        // 32
        System.out.println("EJ 32");
        Producto producto = new Producto("001","Funda celular", 30.99);
        producto.aplicarDescuento(5);
        System.out.println(producto);
        System.out.println("- - - - - - - - - - -"); 
        
        // 33
        System.out.println("EJ 33");
        Cliente cliente = new Cliente("Fulano", "Calle 18", "3207890");
        System.out.println(cliente);
        System.out.println("- - - - - - - - - - -"); 
        
        // 34
        System.out.println("EJ 34");
        Factura factura = new Factura("0325", "Fulano", 150.75);
        System.out.println(factura);
        System.out.println("El valor total de la factura es: "+ factura.obtenerTotal());
        System.out.println("- - - - - - - - - - -"); 
        
        // 35 No lo imprimi 
        System.out.println("EJ 35");
        System.out.println("- - - - - - - - - - -"); 
        
        // 36
        System.out.println("EJ 36");
        Inventario inventario  = new Inventario("001", 30, 10);
        System.out.println(inventario);
        System.out.println("El valor total es de " + inventario.obtenerValorTotal());
        System.out.println("- - - - - - - - - - -"); 
        
        // 37
        System.out.println("EJ 37");
        Proveedor proveedor = new Proveedor("Carlos", "JC", "24323553");
        System.out.println(proveedor.mostrarInformacion());
        System.out.println("- - - - - - - - - - -"); 
        
        // 38
        System.out.println("EJ 38");
        Compra compra = new Compra("001","Carlos", 10, 13.99);
        System.out.println(compra);
        System.out.println("Costo total "+ compra.calcularCostoTotal());
        System.out.println("- - - - - - - - - - -"); 
        
        /* 39
        System.out.println("EJ 39");
        System.out.println("- - - - - - - - - - -"); 
        */
        // 39
        System.out.println("EJ 39");
        Venta venta = new Venta("Sandalias", 5, 10 );
        System.out.println(venta);
        System.out.println("El total es de: "+venta.obtenerTotal());
        System.out.println("- - - - - - - - - - -"); 
        
        // 40
        System.out.println("EJ 40");
        Servicio servicio = new Servicio("001","Mantenimiento", 70, 6);
        System.out.println(servicio);
        System.out.println("El total es de: " + servicio.calcularCostoTotal());
        System.out.println("- - - - - - - - - - -"); 
    }
    
}
