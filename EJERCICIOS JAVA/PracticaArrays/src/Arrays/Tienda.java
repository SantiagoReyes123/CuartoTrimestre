///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Arrays;
//
//import java.util.Scanner;
//
///**
// *
// * @author USUARIO
// */
//public class Tienda {
//    
//    static String[] tipoRopa = {"Cmisa", "Pantalon", "Chaqueta"};
//    static int[] cantidad = {12,10,7};
//    static double[] precio = {20.000, 40.000, 50.000};
//     
//    public static void mostrarInventario(){
//    
//        System.out.println("Inventario de la tienda");
//        for (int i = 0; i < tipoRopa.length; i++) {
//            System.out.println(tipoRopa[i] + "-" + cantidad[i] + "-" + precio[i]);
//            
//        }
//    }
//    
//    public static void agregarUnidades(String tipo,int cantidades){
//        
//        for (int i = 0; i < tipoRopa.length; i++) {
//            if(tipoRopa[i].equalsIgnoreCase(tipo)){
//            
//                cantidad[i] +=cantidades;
//                System.out.println("Unidades agregadas");
//                return;
//            }
//        }
//    }    
//    
//    
//    public static void venderProducto(String tipo, int cantidades){
//        
//        for (int i = 0; i < tipoRopa.length; i++) {
//            if (tipoRopa[i].equalsIgnoreCase(tipo)) {
//                if (cantidad[i] >= cantidades) {
//                    cantidad[i] -=cantidades;
//                    System.out.println("Producto vendido");
//                }else{
//                
//                    System.out.println("No hay cantidad siponible en stock");
//                }
//            }
//        }
//    }
//    
//    public static void ordenarInventarioPrecio(){
//    
//        for (int i = 0; i < precio.length; i++) {
//            for (int j = 0; j < precio.length; j++) {
//                if(precio[i] > precio[j]){
//                
//                    double Precio = precio[i];
//                    precio[i] = precio[j];
//                    precio[j] = Precio;
//                    
//                    int Cantidad = cantidad[i];
//                    cantidad[i] = cantidad[j];
//                    cantidad[j] = Cantidad;
//                    
//                    String Tipo = tipoRopa[i];
//                    tipoRopa[i] = tipoRopa[j];
//                    tipoRopa[j] = Tipo;
//                }
//            }
//            
//        }
//        System.out.println("Inventario ordenado por precio");
//    }
//    
//    public static void buscarProducto(String tipo){
//        for (int i = 0; i < tipoRopa.length; i++) {
//            if(tipoRopa[i].equalsIgnoreCase(tipo)){
//            
//                System.out.println("Prodcuto encontrado:" + tipoRopa[i]+ "-" + cantidad[i]+ "-" + precio[i]);
//                return;
//            }
//            
//        }
//    
//        
//    }
//    
//    public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//        boolean salir = false;
//        
//        while(!salir){
//        
//            System.out.println("\nMenu de la tienda");
//            System.out.println("1.Mostrar inventario");
//            System.out.println("2.Agregar unidades");
//            System.out.println("3.Vender prodcuto");
//            System.out.println("4.Busar producto");
//            System.out.println("5.Ordenar inventario por precio");
//            System.out.println("6.Salir");
//            System.out.println("SELECCIONA UNA OPCION:");
//            
//            
//            int opcion =sc.nextInt();
//            sc.nextLine();
//            
//            switch(opcion){
//            
//                case 1:
//                    mostrarInventario();
//                    break;
//                    
//                case 2:
//                    System.out.println("Ingrese el ripo de ropa");
//                    String tipoAgregar = sc.nextLine();
//                    System.out.println("Ingrese la cantidad de unidades");
//                    int cantidadUnidades = sc.nextInt();
//                    agregarUnidades(tipoAgregar, cantidadUnidades);
//                    break;
//                    
//                    
//                case 3:
//                    System.out.println("Ingrese el tipo de ropa a comprar:");
//                    String tipoCompra = sc.nextLine();
//                    System.out.println("Ingrese la cantidad del ripo d ropa");
//                    int cantidadTipo = sc.nextInt();
//                    venderProducto(tipoCompra, cantidadTipo);
//                    break;
//                    
//                case 4:
//                    System.out.println("Ingrese el tipo de ropa a buscar");
//                    String buscarTipo = sc.nextLine();
//                    buscarProducto(buscarTipo);
//                    break;
//                    
//                case 5:
//                    ordenarInventarioPrecio();
//                    
//                case 6:
//                    salir = true;
//                    break;
//                
//                default:
//                    System.out.println("Opcion incorrecta");
//                
//            }
//        }
//        sc.close();
//    }
//     
//    
//}
