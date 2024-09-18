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
//public class Club {
//    
//    static String[] nombre = {"Juan", "Maria", "Carlos"};
//    static int[] edad = {30,35,23};
//    static String[] deporte = {"Fultbol", "Tenis", "Baloncesto"};
//    static double[] cuotaMensual = {50.000,40.000,30.000};
//    static int contador = 3;
//    
//    
//    public static void listaMienbros(){
//    
//        for (int i = 0; i < contador; i++) {
//            System.out.println(" Nombre:" + nombre[i]+
//                                ", Edad:" + edad[i] + 
//                                ", Deporte:" + deporte[i]+
//                                ", Cuota mensual:" + cuotaMensual[i]);
//            
//        }
//    }
//    
//    public static void agregarMienbros(){
//        
//        Scanner sc = new  Scanner(System.in);
//        
//        System.out.print("Ingrese el nombre del miembro: ");
//        nombre[contador] = sc.nextLine();
//        System.out.print("Ingrese la edad del miembro: ");
//        edad[contador] = sc.nextInt();
//        sc.nextLine();  // Consumir la nueva línea
//        System.out.print("Ingrese el deporte del miembro: ");
//        deporte[contador] = sc.nextLine();
//        System.out.print("Ingrese la cuota mensual del miembro: ");
//        cuotaMensual[contador] = sc.nextDouble();
//        contador++;
//        System.out.println("Miembro agregado al club.");
//        
//    }
//    
//    public static void actualizarCuotaMensual(String nombres, double nuevaCuota){
//    
//        for (int i = 0; i < nombre.length; i++) {
//            if(nombre[i].equalsIgnoreCase(nombres)){
//            
//                cuotaMensual[i] += nuevaCuota;
//                System.out.println("Actualizacion realizada");
//                return;
//            }
//        }
//    }
//    
//    public static void buscarMiembro(String nombres){
//    
//        for (int i = 0; i < nombre.length; i++) {
//            if(nombre[i].equalsIgnoreCase(nombres)){
//            
//                System.out.println("El miembro es: "+
//                                    ", Nombre: " + nombre[i]+
//                                    ", Edad: " + edad[i]+
//                                    ", Deporte: " + deporte[i]+
//                                    ", Cuota mensual: " + cuotaMensual[i]);
//            }
//        }
//    }
//    
//    public static void promedioEdades(){
//    
//        if(contador == 0){
//        
//            System.out.println("No hay mienbros");
//            return;
//        }
//        int sumaEdades = 0;
//        for (int i = 0; i < contador; i++) {
//            sumaEdades += edad[i];
//        }
//        double promedioEdades = (double) sumaEdades /contador;
//        System.out.println("El promedio de las edades es: " + promedioEdades);
//    }
//    
//    public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//        boolean salir = false;
//        
//        while(!salir){
//        
//            System.out.println("\nMenu del club");
//            System.out.println("1.Mostar lista de miembros");
//            System.out.println("2.Agregar miembro");
//            System.out.println("3.Actualizar cuota");
//            System.out.println("4.Buscar miembro");
//            System.out.println("5.Promedio edades");
//            System.out.println("6.salir");
//            System.out.println("SELECCIONE UNA OPCION");
//            
//            int opcion = sc.nextInt();
//            sc.nextLine();
//            
//            switch(opcion){
//            
//                case 1:
//                    listaMienbros();
//                    break;
//                    
//                case 2:
//                    agregarMienbros();
//                    break;
//                    
//                case 3:
//                    System.out.println("Ingrese el nombre del miebro a actualizar");
//                    String nombreActualizar = sc.nextLine();
//                    System.out.println("Ingrese el nuevo monto");
//                    double nuevoMonto =sc.nextDouble();
//                    actualizarCuotaMensual(nombreActualizar, nuevoMonto);
//                    break;
//                    
//                case 4:
//                    System.out.println("Ingrese el nombre de miebro que quiere buscar:");
//                    String nombreBuscar =sc.nextLine();
//                    buscarMiembro(nombreBuscar);
//                    
//                case 5:
//                    promedioEdades();
//                    
//                case 6:
//                    salir = true;
//                    break;
//                    
//                default:
//                    System.out.println("Opcion incorrecta");
//            }
//        }
//        sc.close();
//        
//    }
//    
//    
//}


