/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Restaurante {
    
    static int[] capacidad = {3,4,6};
    static boolean[] disponibilidad = {true, true,true};
    
    public static void mostrarDisponibilidad(){
    
        System.out.println("Disponibilidad de la mesa");
        for (int i = 0; i < capacidad.length; i++) {
                System.out.println("Mesa" + (i+1) + "- Capacidad:" + capacidad[i] + "- Disponibles: " + (disponibilidad[i]? "si":"no"));
                
        }
    }
    
    public static void nuevasReservas(int capacidad){
    
        for (int i = 0; i < Restaurante.capacidad.length; i++) {
                disponibilidad[i] = false;
                System.out.println("Reserva realiada en la mesa:" + (i +1));
                return;
        }
    }
    
    public static void cancelarReservas(int numeroMesa){
    
        if (numeroMesa > 0 && numeroMesa <=capacidad.length && !disponibilidad[numeroMesa -1]) {
            disponibilidad[numeroMesa - 1] = true;
            System.out.println("Reserva cancelada en la mesa" + numeroMesa);
        }else{
        
            System.out.println("Reserva ya cancelada");
        }
    }
    
    public static void buscarMesa(int capacidades){
    
        for (int i = 0; i < capacidad.length; i++){
            if (capacidad[i] >= capacidades && disponibilidad[i]) {
                System.out.println("Mesa encontrada: Mesa" + (i+1) + "- Capacidad: " + capacidad[i]);
                return;
            }
        }
        System.out.println("No se encontro mesa con capacidad");
    }
    public static void ordenarMesaCapacidad(){
    
        for (int i = 0; i < capacidad.length; i++) {
            for (int j = i + 1; j < capacidad.length; j++) {
                if (capacidad[i] > capacidad[j]) {
                    
                    int Capacidad = capacidad[i];
                    capacidad[i] = capacidad[j];
                    capacidad[j] = Capacidad;
                    
                    boolean Disponibilidad = disponibilidad[i];
                    disponibilidad[i] = disponibilidad[j];
                    disponibilidad[j] = Disponibilidad;
                    
                }
                
            }
            
        }
        System.out.println("Mesas ordenadas por capacidad");
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
        
            System.out.println("\nOPCIONES DEL RESTAURANTE");
            System.out.println("1.MOSTAR DISPONIBILIDAD");
            System.out.println("2.REALIZAR RESERVA");
            System.out.println("3.CANCELAR RESERVA");
            System.out.println("4.BUSCAR MESA");
            System.out.println("5.MESAS ORDENADAS POR CAPACIDAD");
            System.out.println("6.SALIR");
            System.out.println("SELECCIONA UNA OPCION: ");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion){
            
                case 1:
                    mostrarDisponibilidad();
                    break;
                    
                case 2:
                    System.out.println("Ingrese el numero de la mesa para cancerlar la reserva:");
                    int capacidadReserva = sc.nextInt();
                    nuevasReservas(capacidadReserva);
                    
                case 3:
                    System.out.println("Ingrese el numero de la mesa");
                    int numeroMesa = sc.nextInt();
                    cancelarReservas(numeroMesa);
                    
                case 4:
                    System.out.println("Ingrese la capacidad de la mesa que esta buscando ");
                    int capacidadMesa =sc.nextInt();
                    buscarMesa(capacidadMesa);
                    
                case 5:
                     ordenarMesaCapacidad();
                    
                case 6:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Seleccion invalida");
                    break;
            }
        }
        sc.close();

    }
    
}
