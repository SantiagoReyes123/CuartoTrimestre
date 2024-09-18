
package EJERCICIOS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //EJERCICIO 1
//        Libro libro = new Libro();
//        
//        llenar datos de atributos de la clase libro
//        libro.Isbn = "sss";
//        libro.Titulo ="el barco";
//        libro.Autor = "Maria";
//        
//        
//        llenado automatico
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ingrese el isbn");
//        libro.Isbn = sc.next();
//        System.out.println("ingrese el tiulo");
//        libro.Titulo = sc.next();
//        System.out.println("ingrese el autor");  
//        libro.Autor = sc.next();
//        
//        llamado del metodo creado en la clase libro
//        libro.metodoMostrar();
        
        System.out.println("****************************************");

        //EJERCICIO 2
        
        Estudiante estudiante = new Estudiante();
        
        estudiante.nombre = "sara";
        estudiante.edad = 12;
        estudiante.carrera = "ingenieria";
        estudiante.promedio = 3.5;
        
        estudiante.metodoEstudiante();
        
        System.out.println("******************************+");
        
        //EJERCICIO 3
        
        Empleado empleado = new Empleado();
        
        empleado.nombre = "andres";
        empleado.puesto = "gerente";
        empleado.salario = 2323.3;
        empleado.antiguedad = 4;
        
        empleado.metodoEmpleado();
        
        System.out.println("*****************************************");
        
        //EJERCICIO 4
        
        Producto producto = new Producto();
        
        producto.codigo = 234;
        producto.nombre = "arroz";
        producto.precio = 13.500;
        producto.stock = 3;
        
        producto.metodoProducto();
        
        System.out.println("*****************************************");

        //EJERCICIO 5
        
        Coche coche = new Coche();
        
        coche.marca = "ded";
        coche.modelo = "frf";
        coche.anio = 2024;
        coche.precio = 10.000;

        coche.metodoCoche();
        
        System.out.println("*****************************************");

        //EJERCICIO 6
        
        Cliente cliente = new Cliente();
        
        cliente.nombre = "Juan";
        cliente.direccion = "Cr1 #23-22";
        cliente.telefono = "3223327923";
        cliente.email = "juan@gmail.com";
        
        cliente.metodoCliente();
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 7
        
        Paciente paciente = new Paciente();
        
        paciente.nombre = "Catalina";
        paciente.edad = 34;
        paciente.enfermedad = "Infeccion pulmonar";
        paciente.doctor = "Camilo";
        
        paciente.metodoPaciente();
        
        System.out.println("*****************************************");

        //EJERCICIO 8
        
        Curso curso = new Curso();
        
        curso.nombre = "Chelsea";
        curso.codigo = 2340;
        curso.creditos = 10;
        curso.profesor = "Alejandro";
        
        curso.metodoCurso();
        
        System.out.println("*****************************************");

        
        //EJERCICIO 9
        
        Pedido pedido = new Pedido();
        
        pedido.codigoPedido = 2300;
        pedido.producto = "Crema para cara";
        pedido.cantidad = 2;
        pedido.precioTotal = 18.000;
        
        pedido.metodoPedido();
        
        System.out.println("*****************************************");

        
        //EJERCICIO 10
        
        Evento evento = new Evento();
        
        evento.nombre = "Matrimonio";
        evento.fecha = "19-marzo-2024";
        evento.lugar = "Parque silvestre";
        evento.asistentes = 1000;
        
        evento.metodoEvento();
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 11
        
        
        
        Pelicula pelicula1 = new Pelicula("Dora", "Juan", 2022, "Ciencia ficcion");
        Pelicula pelicula2 = new Pelicula("Anaconda", "Andres", 2002, "Terror");
        Pelicula pelicula3 = new Pelicula("Bety", "Sara", 1999, "Suspenso");

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 12
        
        Restaurante restaurante1 = new Restaurante("Sabor y Tradicion", "Calle 9", "Cocina nacional", 9.1);
        Restaurante restaurante2 = new Restaurante("La Terraza Delicia", "alle 12", "Cosina asiatica", 8.1);
        Restaurante restaurante3 = new Restaurante("El Rincon Gourmet", "Calle 34", "Cocina vegentariana", 7.9);
        
        
        System.out.println(restaurante1);
        System.out.println(restaurante2);
        System.out.println(restaurante3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 13
        
        Persona persona1 = new Persona("Camilo", "Torres", 20, "sogamoso");
        Persona persona2 = new Persona("Andrees", "Perez", 19, " Duitama");
        Persona persona3 = new Persona("Camila", "Castañeda", 30, "Bogota");
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 14
        
        Orden orden1 = new Orden(01, "2022-09-08", "Laura", 12.000);
        Orden orden2 = new Orden(02, "2024-05-10", "Andres", 50.000);
        Orden orden3 = new Orden(03, "2023-12-12", "Carlos", 45.000);
        
        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 15
        
        Mascota mascota1 = new Mascota("Lulu", "Perro", 3, "Katerine");
        Mascota mascota2 = new Mascota("Lupe", "gato", 1, "Juana");
        Mascota mascota3 = new Mascota("Caty", "gata", 4, "Aejandra");
        
        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(mascota3);
        
        
        System.out.println("*****************************************");

        //EJERCICIO 16
        
        Proveedor proveedor1 = new Proveedor("Andres", "TechNova Solutions", 322409282, "andres@gmail.com");
        Proveedor proveedor2 = new Proveedor("Carlos","Gastronomia Global", 387502847, "carlos@gmail.com" );
        
        System.out.println(proveedor1);
        System.out.println(proveedor2);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 17
        
        Factura factura1 = new Factura(01, "2023-10-01", "Santiago", 12.99);
        Factura  factura2 = new Factura(02, "2023-07-26", "Maria Garcia", 100.50);
        
        
        System.out.println(factura1);
        System.out.println(factura2);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 18
        
        Universidad universidad1 = new Universidad("Universidad de Madrid", "Calle Mayor, 1, Madrid", 20000, 1);
        Universidad universidad2 = new Universidad("Universidad de Barcelona", "Gran Via, 10, Barcelona", 15000, 2);
        
        System.out.println(universidad1);
        System.out.println(universidad2);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 19
        
        Juego juego1 = new Juego("The Legend of Zelda", "Nintendo Switch", 2017, "Aventura");
        Juego juego2 = new Juego("The Witcher 3: Wild Hunt", "PC", 2015, "RPG");
        Juego juego3 = new Juego("God of War", "PlayStation 4", 2018, "Accion");
        

        System.out.println(juego1);
        System.out.println(juego2);
        System.out.println(juego3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 20
        
        Hotel hotel1 = new Hotel("Hotel Gran Mar", "Calle del Mar, 15, Barcelona", 120, 5);
        Hotel hotel2 = new Hotel("Hotel Sierra", "Avenida Montania, 30, Madrid", 80, 4);
        Hotel hotel3 = new Hotel("Hotel Playa Sol", "Paseo de la Playa, 20, Valencia", 150, 3);
        
        System.out.println(hotel1);
        System.out.println(hotel2);
        System.out.println(hotel3);
            
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 21
        
        Venta venta1 = new Venta("Laptop", 2, 999.99);
        Venta venta2 = new Venta("Smartphone", 5, 599.99);
        Venta venta3 = new Venta("Tablet", 3, 299.99);

        // Mostrar los valores de los objetos venta
        System.out.println(venta1);
        System.out.println(venta2);
        System.out.println(venta3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 22
        
        
        Empleadoo empleado1 = new Empleadoo("Juan ", 40, 15.5);
        Empleadoo empleado2 = new Empleadoo("María ", 35, 18.0);
        Empleadoo empleado3 = new Empleadoo("Carlos ", 45, 20.0);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 23
        
        
        ProductoInventario ProductoInventario1 = new ProductoInventario(2221, "Manzana", 10, 1.500);
        ProductoInventario ProductoInventario2 = new ProductoInventario(8844, "Naranja", 15, 9.00);
        ProductoInventario ProductoInventario3 = new ProductoInventario(5677, "Banano", 45, 1.100);
        
        System.out.println(ProductoInventario1);
        System.out.println(ProductoInventario2);
        System.out.println(ProductoInventario3);
        
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 24
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 25
        
        Pedidoo pedido1 = new Pedidoo(1001, "Juan ", 5, 12.99);
        Pedidoo pedido2 = new Pedidoo(1002, "Maria ", 3, 25.50);
        Pedidoo pedido3 = new Pedidoo(1003, "Alejandra ", 5, 35.50);

        
        
        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(pedido3);
       
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 26
        
        Inversion inversion1 = new Inversion(66, "Camila ", 10000, 5);
        Inversion inversion2 = new Inversion(33, "Fernando ", 5000, 3.5);
        Inversion inversion3 = new Inversion(33, "Danilo ", 7000, 3.9);


        System.out.println(inversion1);
        System.out.println(inversion2);
        System.out.println(inversion3);
        
       
        
        System.out.println("*****************************************");

        
        //EJERCICIO 27
        
        ProductoAlmacen ProductoAlmacen1 = new ProductoAlmacen(2020, "Pollo", 3, 20.000);
        ProductoAlmacen ProductoAlmacen2 = new ProductoAlmacen(2021, "Pinia", 5, 5.00);
        ProductoAlmacen ProductoAlmacen3 = new ProductoAlmacen(2022, "Jamon", 7, 10.000);

        
        System.out.println(ProductoAlmacen1);
        System.out.println(ProductoAlmacen2);
        System.out.println(ProductoAlmacen3);

        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 28
        
        Pago pago1 = new Pago(1001, "Camilo ", 2000, 100, 200);
        Pago pago2 = new Pago(1002, "Fernanda ", 2500, 150, 300);
        Pago pago3 = new Pago(1003, "Aura ", 5500, 180, 400);

        System.out.println(pago1);
        System.out.println(pago2);
        System.out.println(pago3);
        
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 29
        
        
        Servicio servicio1 = new Servicio(034, "Limpieza", 50.000, 5);
        Servicio servicio2 = new Servicio(054, "Internet", 30.000, 3);
        Servicio servicio3 = new Servicio(004, "Gas", 55.000, 2);
        
        System.out.println(servicio1);
        System.out.println(servicio2);
        System.out.println(servicio3);
        
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 30
        
        Compra compra1 = new Compra(001, "Juan", 4, 10.000);
        Compra compra2 = new Compra(002, "Carla", 6, 12.000);
        Compra compra3 = new Compra(003, "Albeiro", 9, 5.000);
        
        
        System.out.println(compra1);
        System.out.println(compra2);
        System.out.println(compra3);
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 31
        
        
        Empleado1 empleado12 = new Empleado1("ana", 200.000);
        
        System.out.println(empleado12);
        
        
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 32
        
        Producto1 producto1 = new Producto1("001", "Laptop", 1500.0);
        
        System.out.println(producto1);
        producto1.metodoDescuento(10);
        
        System.out.println("Precio despues del descuento");
        System.out.println(producto1);
        
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 33
        
        Cliente1 cliente1 = new Cliente1("Luis Martinez", "Calle Falsa, 123", "5551234");
        
        System.out.println(cliente1);

        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 34
        
        
        Factura1 factura12 = new Factura1("F001", "Juan ", 1000.0);
        
        System.out.println(factura12);
        
       
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 35
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 36
        
        Inventario1 inventario1 = new Inventario1("33w", 3, 4.000);
        
        inventario1.mostrarInformacion();
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 37
        
        Proveedor1 proveedor12 = new Proveedor1("Andres", "Fluver", "3224459088");
        proveedor12.metodoinfo();
        
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 38
        
        Compra1 compra12 = new Compra1("Compra 1", "Carlos", 3, 2.300);
        System.out.println(compra12);
        
        
        System.out.println("*****************************************");

        
        //EJERCICIO 39
        
        Venta1 venta12 = new Venta1();
        venta12.producto = "Papa";
        venta12.cantidad = 5;
        venta12.precioUnitario =5.000;
        
        venta12.metodoMostrar();
        
        
        System.out.println("*****************************************");

        
        
        //EJERCICIO 40
        
        Servicio1 servicio12 = new Servicio1();
        servicio12.codigo ="ter45";
        servicio12.descripcion = "Arreglo de luz";
        servicio12.precioHora = 20.000;
        servicio12.horaTrabajada = 5;
        
        servicio12.mostrar();
        
        
        
        System.out.println("*****************************************");

        
        //HERENCIA (2)
        //EJERCICIO 41
        
        
        
        
        
    }
    
    
    
}
