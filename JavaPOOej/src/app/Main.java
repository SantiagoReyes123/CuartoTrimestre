// Aprendiz: Julian Alberto Gonzalez Carrascal
// Ejercicos de Java POO 1-30
package app;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        // 1
        System.out.println("EJ 1");
        libro libro = new libro();
        libro.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 2
        System.out.println("EJ 2");
        Estudiante Estudiante = new Estudiante();
        Estudiante.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 3
        System.out.println("EJ 3");
        Empleado Empleado = new Empleado();
        Empleado.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 4
        System.out.println("EJ 4");
        Producto Producto = new Producto();
        Producto.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 5
        System.out.println("EJ 5");
        Coche Coche = new Coche();
        Coche.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 6
        System.out.println("EJ 6");
        Cliente Cliente = new Cliente();
        Cliente.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 7
        System.out.println("EJ 7");
        Paciente Paciente = new Paciente();
        Paciente.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 8
        System.out.println("EJ 8");
        Curso Curso = new Curso();
        Curso.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 9
        System.out.println("EJ 9");
        Pedido Pedido = new Pedido();
        Pedido.imprimirDetalles();
        System.out.println("- - - - - - - - - - -");
        // 10
        System.out.println("EJ 10");
        Evento Evento = new Evento();
        Evento.imprimirDetalles();
        
        System.out.println("- - - - - - - - - - -");
        System.out.println("- - - - - - - - - - -");
        System.out.println("- - - - - - - - - - -");
        
        // 11
        System.out.println("EJ 11");
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficción");
        System.out.println(pelicula1);
        Pelicula pelicula2 = new Pelicula("Pacific Rim", "Guillermo del toro", 2013, "Ciencia Ficción");
        System.out.println(pelicula2);
        Pelicula pelicula3 = new Pelicula("Gato con Bota: El ultimo deseo", "Joel Crawford", 2022, " Comedia y Aventura");
        System.out.println(pelicula3);
        System.out.println("- - - - - - - - - - -");
        
        // 12
        System.out.println("EJ 12");
        Restaurante restaurante1 = new Restaurante("Frisby" ,"Carrera 26 - Num 12-15","Comida Rapida",3);
        System.out.println(restaurante1);
        Restaurante restaurante2 = new Restaurante("Imperio Paisa" ,"Carrera 12 - Num 42","Comida Rapida",1);
        System.out.println(restaurante2);
        Restaurante restaurante3 = new Restaurante("Akitiko" ,"Calle 17 - Num 27-68","Comida China",5);
        System.out.println(restaurante3);
        System.out.println("- - - - - - - - - - -");
        
        // 13
        System.out.println("EJ 13");
        Persona persona1 = new Persona("Fulano" ,"De tal", 17, "Calle 17");
        System.out.println(persona1);
        Persona persona2 = new Persona("Carlos" ,"Rodriguez", 34, "Calle 80-5");
        System.out.println(persona2);
        Persona persona3 = new Persona("Maria" ,"Torres", 122, "Carrera 23-1");
        System.out.println(persona3);
        System.out.println("- - - - - - - - - - -");
        
        // 14
        System.out.println("EJ 14");
        Orden orden1 = new Orden(404,"Abril 25-2025","Julian Gonzalez",100);
        System.out.println(orden1);
        Orden orden2 = new Orden(405,"Agosto 29-2024","Kevin Avendaño",500);
        System.out.println(orden2);
        System.out.println("- - - - - - - - - - -");
        
        // 15
        System.out.println("EJ 15");
        Mascota mascota1 = new Mascota("Nala", "Gato", 4,"Julian Gonzalez");
        System.out.println(mascota1);
        Mascota mascota2 = new Mascota("Luky", "Perro", 15,"Juan Pablo");
        System.out.println(mascota2);
        Mascota mascota3 = new Mascota("Lupita", "Tortuga", 15,"Julian Gonzalez");
        System.out.println(mascota3);
        System.out.println("- - - - - - - - - - -");
        
        // 16
        System.out.println("EJ 16");
        Proveedor proveedor1 = new Proveedor("Andres", "Yummy's", "32040202", "andres@gmail");
        System.out.println(proveedor1);
        Proveedor proveedor2 = new Proveedor("Felipe", "EmpresaY", "1209324", "felipe@gmail");
        System.out.println(proveedor2);
        Proveedor proveedor3 = new Proveedor("Amicar", "Bloom and Doom", "12039432", "amilcar@gmail");
        System.out.println(proveedor3);
        System.out.println("- - - - - - - - - - -");
        
        // 17
        System.out.println("EJ 17");
        Factura factura1 = new Factura(1, "22 de abril", "fulano", 10000);
        System.out.println(factura1);
        Factura factura2 = new Factura(1, "25 de abril", "fulano", 17500);
        System.out.println(factura2);
        Factura factura3 = new Factura(1, "28 de abril", "fulano", 15500);
        System.out.println(factura3);
        System.out.println("- - - - - - - - - - -");
        
        // 18
        System.out.println("EJ 18");
        Universidad universidad1 = new Universidad("Uptc", "Calle 2", 100, 100);
        System.out.println(universidad1);
        Universidad universidad2 = new Universidad("UniMinuto", "Carreraa 26", 10, 1);
        System.out.println(universidad2);
        Universidad universidad3 = new Universidad("UneX", "Calle 23", 1000, 50);
        System.out.println(universidad3);
        System.out.println("- - - - - - - - - - -");
        
        // 19
        System.out.println("EJ 19");
        Juego juego1 = new Juego("Hollow Knigth", "Todas", "2017", "Metroidvania");
        System.out.println(juego1);
        Juego juego2 = new Juego("Monster Hunter", "PS2", "2005", "Action-Rpg");
        System.out.println(juego2);
        Juego juego3 = new Juego("Gears of War", "Xbox 360", "2011", "Third Person Shooter");
        System.out.println(juego3);
        System.out.println("- - - - - - - - - - -");
        
        // 20
        System.out.println("EJ 20");
        Hotel hotel1 = new Hotel("Hotel Trivago", "Calle 7", 40, 4);
        System.out.println(hotel1);
        Hotel hotel2 = new Hotel("Hotel Haboo", "Calle 8", 999, 2);
        System.out.println(hotel2);
        System.out.println("- - - - - - - - - - -");
        
        System.out.println("- - - - - - - - - - -");
        System.out.println("- - - - - - - - - - -");
        System.out.println("- - - - - - - - - - -");
        
        // 21
        System.out.println("EJ 21");
        Venta venta1 = new Venta("Producto X", 5, 10.99);
        System.out.println(venta1);
        Venta venta2 = new Venta("Producto Y", 10, 75.99);
        System.out.println(venta2);
        Venta venta3 = new Venta("Producto Z", 3, 80.99);
        System.out.println(venta3);
        System.out.println("- - - - - - - - - - -");
        
        // 22
        System.out.println("EJ 22");
        Empleado22 empleado21 = new Empleado22("Fulano", 8, 75);
        System.out.println(empleado21);
        Empleado22 empleado22 = new Empleado22("Nicolas", 6, 100);
        System.out.println(empleado22);
        System.out.println("- - - - - - - - - - -");
        
        // 23
        System.out.println("EJ 23");
        ProductoInventario producto1 = new ProductoInventario("001", "Producto A", 50, 10.0);
        System.out.println(producto1);
        ProductoInventario producto2 = new ProductoInventario("002", "Producto B", 30, 20.0);
        System.out.println(producto2);
        ProductoInventario producto3 = new ProductoInventario("003", "Producto C", 100, 5.0);
        System.out.println(producto3);
        System.out.println("- - - - - - - - - - -");
        
        // 24
        System.out.println("EJ 24");
        Factura24 facturaUno = new Factura24("F001", new Date(), 100.0);
        System.out.println(facturaUno);
        Factura24 facturaDos = new Factura24("F002", new Date(), 200.0);
        System.out.println(facturaDos);
        Factura24 facturaTres = new Factura24("F003", new Date(), 300.0);
        System.out.println(facturaTres);
        System.out.println("- - - - - - - - - - -");
        
        // 25
        System.out.println("EJ 25");
        Pedido25 pedido1 = new Pedido25("P001", "Fulano", 10, 15.99);
        System.out.println(pedido1);
        Pedido25 pedido2 = new Pedido25("P002", "Carlos", 5, 20.99);
        System.out.println(pedido2);
        Pedido25 pedido3 = new Pedido25("P003", "Cliente X", 20, 10.99);
        System.out.println(pedido3);
        System.out.println("- - - - - - - - - - -");
        
        // 26
        System.out.println("EJ 26");
        Inversión inversion1 = new Inversión("I001", "Cachetadas a Domicilio", 10000, 5.0);
        System.out.println(inversion1);
        Inversión inversion2 = new Inversión("I002", "Leche Femboy", 5000, 4.0);
        System.out.println(inversion2);
        Inversión inversion3 = new Inversión("I003", "Inversor X", 20000, 3.5);
        System.out.println(inversion3);
        System.out.println("- - - - - - - - - - -");
        
        // 27
        System.out.println("EJ 27");
        ProductoAlmacen productoUno = new ProductoAlmacen("001", "Producto A", 50, 10.0);
        System.out.println(productoUno);
        ProductoAlmacen productoDos = new ProductoAlmacen("002", "Producto B", 30, 20.0);
        System.out.println(productoDos);
        ProductoAlmacen productoTres = new ProductoAlmacen("003", "Producto C", 100, 5.0);
        System.out.println(productoTres);
        System.out.println("- - - - - - - - - - -");
        
        // 28
        System.out.println("EJ 28");
        Pago pago1 = new Pago("P001", "Empleado X", 1000.0, 200.0, 50.0);
        System.out.println(pago1);
        Pago pago2 = new Pago("P002", "Empleado Y", 1200.0, 100.0, 75.0);
        System.out.println(pago2);
        Pago pago3 = new Pago("P003", "Empleado Z", 800.0, 150.0, 25.0);
        System.out.println(pago3);
        System.out.println("- - - - - - - - - - -");
        
        // 29
        System.out.println("EJ 29");
         Servicio servicio1 = new Servicio("S001", "Tapiceria", 50.0, 10);
         System.out.println(servicio1);
        Servicio servicio2 = new Servicio("S002", "Limpieza", 70.0, 8);
        System.out.println(servicio2);
        Servicio servicio3 = new Servicio("S003", "Mantenimiento", 30.0, 15);
        System.out.println(servicio3);
        System.out.println("- - - - - - - - - - -");
        
        // 30
        System.out.println("EJ 30");
        Compra compra1 = new Compra("C101", "Fulano", 5 ,10.99);
        System.out.println(compra1);
        Compra compra2 = new Compra("C102", "Fulano", 10 ,12.99);
        System.out.println(compra2);
        Compra compra3 = new Compra("C103", "Fulano", 15 ,10.99);
        System.out.println(compra3);
        System.out.println("- - - - - - - - - - -");
    }
}
