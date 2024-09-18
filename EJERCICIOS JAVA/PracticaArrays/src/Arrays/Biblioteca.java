//package Arrays;
//
//import java.util.Scanner;
//
//public class Biblioteca {
//
//    static String[] titulos = {"Libro Q", "Libro B", "Libro C"};
//    static String[] autores = {"Autor P", "Autor B", "Autor C"};
//    static int[] cantidades = {3, 2, 6};
//
//    
//    //MOSTRAR INVENTARIO
//    public static void mostrarInventario() {
//        System.out.println("Inventario");
//        for (int i = 0; i < titulos.length; i++) {
//            System.out.println(titulos[i] + " por " + autores[i] + " - " + cantidades[i] + " copias");
//        }
//    }
//    
//    // AGREGAR COPIAS
//    public static void agregarCopias(String titulo, int cantidad){
//    
//        for (int i = 0; i < titulos.length; i++) {
//            
//            if (titulos[i].equalsIgnoreCase(titulo)) {
//                
//                cantidades[i] += cantidad;
//                System.out.println("Copias agregadas");
//                return;
//            }
//            
//        }
//    }
//    
//    //PRESTAR LIBROS
//    public static void prestarLibro(String titulo){
//    
//        for (int i = 0; i < titulos.length; i++) {
//            
//            if (cantidades[i]>0) {
//                cantidades[i]--;
//                System.out.println("Libro prestado");
//            }else{
//            
//                System.out.println("no hay copias disponibles");
//            }
//            return;
//        }
//    }
//    
//    //BUSCAR LIBRO
//    public static void buscarLibro(String titulo){
//    
//        for (int i = 0; i < titulos.length; i++) {
//            
//            if (titulos[i].equalsIgnoreCase(titulo)){
//                System.out.println("Libro encontrado" + titulos[i] + "por" + autores[i] + "-" + cantidades[i] + "copias");
//                return;
//            }
//        }
//    }
//    
//    //ORDENAR EL INVENTARIO POR TITULO
//    public static void ordenarInventario(){
//    
//        for (int i = 0; i < titulos.length; i++){
//            
//            for (int j = i; j < titulos.length; j++) {
//                if (titulos[i].compareTo(titulos[j])>0) {
//                    
//                    String Titulo = titulos[i];
//                    String Autor = autores[i];
//                    int Cantidades = cantidades[i];
//                    
//                    titulos[i] = titulos[j];
//                    autores[i] = autores[j];
//                    cantidades[i] = cantidades[j];
//                    
//                    titulos[i] = Titulo;
//                    autores[i] = Autor;
//                    cantidades[i] = Cantidades;
//                    
//                }
//                
//            }
//            
//        }
//        System.out.println("Inventario ordenado por titulo");
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        boolean salir = false;
//
//        while (!salir) {
//
//            System.out.println("\nMENU");
//            System.out.println("1. MOSTRAR INVENTARIO");
//            System.out.println("*******************************");
//            System.out.println("2.AGREGAR COPIAS");
//            System.out.println("*******************************");
//            System.out.println("3.PRESTAR LIBROS");
//            System.out.println("*******************************");
//            System.out.println("4.BUSCAR LIBROS");
//            System.out.println("*******************************");
//            System.out.println("5.ORDENAR INVENTARIO POR TITULO");
//            System.out.println("6.SALIR");
//            System.out.println("*******************************");
//            System.out.print("SELECCIONE UNA OPCION: ");
//
//            int opcion = sc.nextInt();
//            sc.nextLine(); // Consumir la nueva línea
//
//            switch (opcion) {
//                case 1:
//                    mostrarInventario();
//                    break;
//                    
//                case 2:
//                    System.out.println("Ingresa el nombre del libro para agrgar la cipia");
//                    String tituloAgregar = sc.nextLine();
//                    System.out.println("Ingrese la cantidad de cipias a agregar;");
//                    int cantidadAgregar = sc.nextInt();
//                    agregarCopias(tituloAgregar, cantidadAgregar);
//                    break;
//                    
//                case 3:
//                    System.out.println("Ingrse el nombre del libro;");
//                    String tituloPrestar = sc.nextLine();
//                    prestarLibro(tituloPrestar);
//                    break;
//                    
//                case 4:
//                    System.out.println("Ingrese el nombre del libro");
//                    String tituloBuscar = sc.nextLine();
//                    buscarLibro(tituloBuscar);
//                    break;
//                    
//                case 5:
//                    ordenarInventario();
//                    break;
//                    
//                    
//                case 6:
//                    salir=true;
//                default:
//                    System.out.println("Opción no válida.");
//                    break;
//            }
//        }
//
//        sc.close();
//    }
//}
//
//
