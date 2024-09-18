///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Matriz;
//
//import java.util.Scanner;
//
///**
// *
// * @author USUARIO
// */
//public class Libreria {
//    
//    static String[][] libros = new String[10][4];
//    static int[] stock = new int[10];
//    static int contador = 0;
//    
//    
//    public static void agregarLibro(){
//    
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingrese el titulo, autor, isbn , precio del libro y la cantidad en stock");
//        for (int i = 0; i < 4; i++) libros[contador][i] =  sc.nextLine();
//        stock[contador++] =sc.nextInt();
//        System.out.println("Libro agregado al inventario");
//            
//        
//    }
//    public static void eliminarLibro(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el isbn del libro a eliminar");
//        String isbn = sc.nextLine();
//        
//        for (int i = 0; i < contador; i++) {
//            if (libros[i][2].equals(isbn)) {
//                for (int j = i; j < contador - 1; j++) {
//                    libros[j] = libros[j +1];
//                    stock[j] = stock[j + 1];
//                    
//                }
//                libros[--contador] = new String[4];
//                stock[contador] = 0;
//                System.out.println("Libro eliminado");
//                return;
//                
//            }
//            
//        }
//        
//    }
//    public static void valorTotalInventario(){
//    
//        double valorTotal = 0;
//        
//        for (int i = 0; i < contador; i++) {
//            valorTotal += Double.parseDouble(libros[i][3]) * stock[i];
//            System.out.println("Valor total del inventario: " + valorTotal);
//        }
//    }
//    
//    public static void mostrarInventario(){
//    
//        System.out.println("Inventario de la libreria");
//        for (int i = 0; i < contador; i++) {
//            double precio = Double.parseDouble(libros[i][3]);
//            System.out.println("Titulo:" + libros[i][0]+
//                                ", Autor:" + libros[i][1]+
//                                ", ISBN:" + libros[i][2]+
//                                ", Precio:" + precio+
//                                ", Stock:" + stock[i]+
//                                ", Valor total en stock:" + (precio * stock[i]));
//            
//        }
//    }
//    
//    public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("\nMenú de la Librería:");
//            System.out.println("1. Agregar libro");
//            System.out.println("2. Eliminar libro");
//            System.out.println("3. Calcular valor total del inventario");
//            System.out.println("4. Mostrar inventario");
//            System.out.println("5. Salir");
//            System.out.print("Seleccione una opción: ");
//
//            int opcion = sc.nextInt();
//            sc.nextLine(); // Consumir la nueva línea
//
//            switch (opcion) {
//                case 1 -> agregarLibro();
//                case 2 -> eliminarLibro();
//                case 3 -> valorTotalInventario();
//                case 4 -> mostrarInventario();
//                case 5 -> System.exit(0);
//                default -> System.out.println("Opción no válida.");
//            }
//        }
//    }
//    
//}
