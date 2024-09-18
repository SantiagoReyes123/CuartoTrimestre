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
//public class Vehiculos {
//    
//    static String[] modelo = {"Toyota", "Ford", "Honda"};
//    static String[] matricula = {"24e", "r55", "43dd"};
//    static double[] precioDia = {20000,30000,50000};
//    static boolean[] disponibles = {true, true, true};
//    
//    //MOSTRAR LISTA DE VEHICULOS
//    public static void listaVehiculos(){
//        for (int i = 0; i < modelo.length; i++) {
//            
//            System.out.println(modelo[i] + " - Matrícula: " + matricula[i] + " - Precio: $" + precioDia[i] + " por día - Disponible: " + (disponibles[i] ? "Sí" : "No"));
//        }
//        
//    }
//    
//    //ALQUILAR UN VEHICULO
//    public static void alquilarVehiculo(String matriculas){
//    
//        for (int i = 0; i < matricula.length; i++) {
//            
//            if(matricula[i].equalsIgnoreCase(matriculas)&& disponibles[i]){
//               disponibles[i] = false;
//                System.out.println("Vehiculo alquilado");
//                return;
//            }
//        }
//        System.out.println("Vehiculo no encontrado");
//    }
//    
//    public static void devolverVehiculo(String matriculas){
//    
//        for (int i = 0; i < matricula.length; i++) {
//            if (matricula[i].equalsIgnoreCase(matriculas) && !disponibles[i]){
//                disponibles[i] = true;
//                System.out.println("Vehiculo devuelto");
//                return;
//            }
//            
//        }
//    }
//    
//    public static void buscarVehiculo(String matriculas){
//    
//        for (int i = 0; i < matricula.length; i++) {
//            if (matricula[i].equalsIgnoreCase(matriculas)) {
//                System.out.println("Vehiculo encontrado" + modelo[i] + "- Matricula:" + matricula[i] + "-Precio por dia:" + precioDia[i] + "Disponibles:" + (disponibles[i]? "si" : "no"));
//            }
//            
//            
//        }
//        System.out.println("Vehiculo no ");
//    }
//    
//    public static void ordenarPorPrecio(){
//    
//        for (int i = 0; i < precioDia.length; i++) {
//            
//            for (int j = i + 1; j < precioDia.length; j++) {
//                if (precioDia[i] > precioDia[j]) {
//                    
//                    
//                    //intercambiar precios
//                    double Precio = precioDia[i];
//                    precioDia[i] = precioDia[j];
//                    precioDia[j] = Precio;
//                    
//                    //intercabiar modelos
//                    String Modelo = modelo[i];
//                    modelo[i] = modelo[j];
//                    modelo[j] = Modelo;
//                    
//                    //intercambiar matriculas
//                    String Matricula = matricula[i];
//                    matricula[i] = matricula[j];
//                    matricula[j] = Matricula;
//                    
//                    //Intercambiar disponibilidad
//                    boolean Disponibles = disponibles[i];
//                    disponibles[i] = disponibles[j];
//                    disponibles[j] = Disponibles;
//                    
//                }
//                
//            }
//            
//        }
//        System.out.println("lista ordenada por precio");
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean salir = false;
//        
//        while (!salir){
//        
//            System.out.println("\nMENU DE ALUILER DE VEHICULOS");
//            System.out.println("1.MOSTRAR LISTA DE VEHICULOS");
//            System.out.println("2.ALQUILAR VEHICULOS");
//            System.out.println("3.DEVOLVER VEHICULO");
//            System.out.println("4.BUSCAR VEHICULO");
//            System.out.println("5.ORDENAR LISTA POR PRECIO");
//            System.out.println("6.SALIR");
//            System.out.println("SELECCIONE UNA OPCION");
//            
//            int opcion = sc.nextInt();
//            sc.nextLine();
//            
//            switch(opcion){
//            
//                case 1:
//                    listaVehiculos();
//                    break;
//                    
//                case 2:
//                    System.out.println("Ingrese la matricula del vehiculo");
//                    String matriculaAlquilar = sc.nextLine();
//                    alquilarVehiculo(matriculaAlquilar);
//                    break;
//                    
//                case 3:
//                    System.out.println("Ingrese la matricula del vehiculo");
//                    String matriculaDevolver = sc.nextLine();
//                    devolverVehiculo(matriculaDevolver);
//                    break;
//                    
//                case 4:
//                    System.out.println("Ingrese la matricula del vehiculo");
//                    String matriculaBuscar = sc.nextLine();
//                    buscarVehiculo(matriculaBuscar);
//                    break;
//                    
//                case 5:
//                    ordenarPorPrecio();
//                    
//                case 6:
//                    salir = true;
//                    break;
//                    
//                default:
//                    System.out.println("Opcion invalida");
//                    break;
//            }
//        }
//        sc.close();
//          
//    }
//    
//}
