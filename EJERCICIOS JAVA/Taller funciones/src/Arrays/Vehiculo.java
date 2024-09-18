///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Arrays;
//
///**
// *
// * @author USUARIO
// */
//public class Vehiculo {
//    
//    public String modelo;
//    public String matricula;
//    public double precioPorDia;
//    public boolean disponible;
//
//    public Vehiculo(String modelo, String matricula, double precioPorDia, boolean disponible) {
//        this.modelo = modelo;
//        this.matricula = matricula;
//        this.precioPorDia = precioPorDia;
//        this.disponible = disponible;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public String getMatricula() {
//        return matricula;
//    }
//
//    public void setMatricula(String matricula) {
//        this.matricula = matricula;
//    }
//
//    public double getPrecioPorDia() {
//        return precioPorDia;
//    }
//
//    public void setPrecioPorDia(double precioPorDia) {
//        this.precioPorDia = precioPorDia;
//    }
//
//    public boolean isDisponible() {
//        return disponible;
//    }
//
//    public void setDisponible(boolean disponible) {
//        this.disponible = disponible;
//    }
//    
//    
//    
//    @Override
//    public String toString() {
//        return "Modelo: " + modelo + ", Matrícula: " + matricula + ", Precio por día: " + precioPorDia + ", Disponible: " + (disponible ? "Sí" : "No");
//    }
//    
//    public class AgenciaAlquiler {
//    private static Vehiculo[] vehiculos = {
//        new Vehiculo("Toyota Corolla", "1234 ABC", 30.0, true),
//        new Vehiculo("Ford Fiesta", "5678 DEF", 25.0, true),
//        new Vehiculo("BMW X5", "9101 GHI", 50.0, true),
//        new Vehiculo("Audi A4", "1121 JKL", 40.0, true)
//    };
//    
//        public static void main(String[] args) {
//            
//        }
//        
//        public static void mostrarVehiculos() {
//            for (Vehiculo vehiculo : vehiculos) {
//            System.out.println(vehiculo);
//            
//            }
//        }
//        
//        public static void alquilarVehiculo(String matricula){
//        
//            for(Vehiculo vehiculo : vehiculos){
//            
//                if(vehiculo.getMatricula().equals(matricula) && vehiculo.isDisponible()){
//                
// 
//                    vehiculo.setDisponible(false);
//                    System.out.println("Vehiculo alquilado");
//                    return;
//                }
//            }
//            System.out.println("Vehiculo no disponible ");
//        }
//        
//        public static void devolverVehiculo(String matricula){
//        
//            for(Vehiculo vehiculo : vehiculos){
//                if(vehiculo.getMatricula().equals(matricula) && !vehiculo.isDisponible()){
//                
//                    vehiculo.setDisponible(true);
//                    System.out.println("vehiculo devuelto");
//                    return;
//                }
//                
//            }
//            System.out.println("el vehiculo NO esta alquilado");
//        }
//        
//        public static void }-
//        
//    
//    
//    }
//    
//    
//}
//ñ