///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package taller.funciones;
//
//import javax.swing.JOptionPane;
//
///**
// *
// * @author USUARIO
// */
//public class TallerFunciones {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//        //funcion1();
//        //funcion2();
//        //funcion3();
//        //funcion4();
//        //funcion5();
//        //funcion6();
//        //funcion7();
//        //funcion8();
//        //funcion9();
//        //funcion10();
//        //funcion11();
//        //funcion12(); 
//        //funcion13();
//        //funcion14();
//        //funcion15();
//        //funcion16();
//        //funcion17();
//        //funcion18();
//        //funcion19();
//        funcion20();
//        
//    }
//    
//    public static void funcion1(){
//        
//        double salarioMensual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario mensual"));
//        double retencion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el % de retencion"));
//        
//        double salarioAnual = salarioMensual * 12;
//        double porceRetencion = salarioAnual * ( retencion / 100);
//        
//        JOptionPane.showMessageDialog(null,"El salario anual es de:" + salarioAnual + " \n El porcentaje de retencion es de:" + porceRetencion);
//    
//        
//    }
//    
//    public static void funcion2(){
//    
//        
//    int numProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de los prodcutos a revisar"));
//    
//        for (int i = 0; i < numProducto; i++) {
//            
//             String nomProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
//             int nivel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de stock " + (i +1)+ ":"));
//
//             if(nivel <=2){
//                 
//                JOptionPane.showMessageDialog(null, "Necesitas hacer pedido");
//             
//             }else{
//                 
//                JOptionPane.showMessageDialog(null, "No necesitas hacer pedido");
//             }
//             
//            JOptionPane.showMessageDialog(null, "El nimbre del producto es" + nomProducto);
//        }
//        
//    }
//    
//    public static void funcion3(){
//        
//        double costosMateriales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo mteriales"));
//        double costosManoObra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mano de obra"));
//        double gastosGenerales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese gastos generales"));
//        
//        double costosTotales = (costosMateriales + costosManoObra + gastosGenerales);
//     
//        JOptionPane.showMessageDialog(null, costosTotales);
//    }
//    
//    public static void funcion4(){
//        
//        int numDepartamento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero e departamentos"));
//    
//        for (int i = 0; i < numDepartamento; i++) {
//            
//            String nomDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del Departamento " + (i + 1) + ":");
//            double ganancias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ganancias trimestrales del departamento" + (i+1)+ ":"));
//
//            JOptionPane.showMessageDialog(null,"El nombre del departamento es:" + nomDepartamento);
//           
//            if (ganancias >=50) {
//                
//                JOptionPane.showMessageDialog(null,"El rendimiento es bueno con unas ganancias de:" + ganancias);
//                
//            } else if (ganancias >=40) {
//                JOptionPane.showMessageDialog(null, "las ganacias es moderado con unas ganacias de:" + ganancias);
//                
//            }
//            
//        }
//    }
//    
//    public static void funcion5(){
//    
//        double valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial"));
//        double valorResidual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor residual"));
//        int vidaUtil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese vida utial en dias"));
//        
//
//        double total = (valorInicial - valorResidual) / vidaUtil;
//        
//        JOptionPane.showMessageDialog(null, "La depreciacion anual del activo es:" + total);
//    }
//    
//    public static void funcion6(){
//    
//        double capitalInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital inicial"));
//        double tasaInteresAnual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la lasa de interes anual"));
//        int numAnios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de años"));
//    
//        double valorFuturo = calcularValorFuturo(capitalInicial,tasaInteresAnual,numAnios );
//    
//        JOptionPane.showMessageDialog(null, "El valor futuro de la inversion es:" + valorFuturo);
//                
//    }
//    
//    //INVESTIGAR OPERACION
//    public static double calcularValorFuturo(double capitalInicial, double tasaInteresAnual, int numAnios) {
//        return capitalInicial * Math.pow((1 + tasaInteresAnual / 100), numAnios);
//    }
//
//    public static void funcion7(){
//    
//        int numEmmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de emeplados"));
//        String[] nombreEmpleado = new String[numEmmpleados];
//        double[] horasExtras = new double[numEmmpleados];
//        
//        for (int i = 0; i < numEmmpleados; i++) {
//            
//                    nombreEmpleado[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
//                    horasExtras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa horas extras" + nombreEmpleado[i]));
//
//        }
//        StringBuilder reporte = new StringBuilder();
//        reporte.append("Reporte de Horas Extras Trabajadas:\n");
//        
//        for (int i = 0; i < nombreEmpleado.length; i++) {
//            reporte.append("Empleado: ").append(nombreEmpleado[i]).append
//                          (", Horas Extras: ").append(horasExtras[i]).append("\n");
//        }
//        
//        JOptionPane.showMessageDialog(null, reporte.toString());
//        
//        
//    }    
//    
//    public static void funcion8(){
//    
//      
//    }
//    
//    public static void funcion9(){
//    
//        double horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajasas"));
//        double salarioPorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario por hora"));
//        
//        double total  = (horasTrabajadas * salarioPorHora)*7;
//        
//        JOptionPane.showMessageDialog(null, "La nomina es de:" + total);
//        
//        
//    }
//    
//    public static void funcion10(){
//    
//        double distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia"));
//        double velocidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad en kilometrros"));
//        
//        double total= distancia /velocidad;
//        
//        JOptionPane.showMessageDialog(null, "El tiempo estimado de entrega es:" + total);
//    }
//    
//    public static void funcion11(){
//    
//        double distanciaRecodrrida = Integer.parseInt(JOptionPane.showInputDialog("Distancia recorrida"));
//        double combustiblesConsumido = Integer.parseInt(JOptionPane.showInputDialog("Combustible consumido"));
//        
//        double total = distanciaRecodrrida / combustiblesConsumido;
//        
//        JOptionPane.showMessageDialog(null,"El promedio de combustible consumido es de:" +  total );
//    }
//    
//    public static void funcion12(){
//    
//        
//    }
//    
//    public static void funcion13(){
//        
//        int numAsignaturas = Integer.parseInt(JOptionPane.showInputDialog("digie la cantidad de notas"));
//        double suma =0;
//        for (int i = 0; i < numAsignaturas; i++) {
//            
//            double notas = Double.parseDouble(JOptionPane.showInputDialog("digie la calificacion:" + i + ":"));
//            suma +=notas;
//        }
//        double promedio = suma/numAsignaturas;
//        JOptionPane.showMessageDialog(null, "el promedio de notas es:" + promedio); 
//    }
//    
//    public static void funcion14(){
//    
//        
//    }
//    
//    public static void funcion15(){
//    
//        int numElectrodomestico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuneros de electrodomesticos"));
//        
//        for (int i = 0; i < numElectrodomestico; i++) {
//            
//            String nombreElectrodomestico =  JOptionPane.showInputDialog("Ingrese el nombre del electrodomestico");
//            double rendimineto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rendimiento del electrodomestico \n" + nombreElectrodomestico));
//            double consumoEnergia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el consumo de energia de" + nombreElectrodomestico ));
//            
//            double eficiendcia = rendimineto/consumoEnergia;
//            
//            JOptionPane.showMessageDialog(null, "El electrodomesticodel electrodomestico:" + nombreElectrodomestico 
//                                         + "\n La eficincia es de: " + eficiendcia);
//            
//        }
//    }
//    
//    public static void funcion16(){
//    
//        double costoAlquiler = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del alquiler"));
//        double catering = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del catering"));
//        double entretenimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del entretenimineto"));
//        double otrosGastos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo de otros gastos"));
//
//        double total = (costoAlquiler + catering + entretenimiento + otrosGastos );
//        
//        JOptionPane.showMessageDialog(null, "El costo total del evento es de: " + total);
//
//    }
//    
//    public static void funcion17(){
//    
//        int numClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de clientes"));
//        int suma = 0;
//        for (int i = 0; i < numClientes; i++) {
//            
//            int puntuacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la puntuacion de satisfaccion" + (i+1)));
//            
//            suma += puntuacion;
//        }
//        double promedio = suma / numClientes;
//            
//            JOptionPane.showMessageDialog(null, "El promedio de satisfaccion  es de: " + promedio);
//    }
//    
//    public static void funcion18(){
//    
//        int metasCumplidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de metas cumplidas"));
//        int metasEstablecidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de metas establecidas"));
//        
//        int total1 = metasCumplidas + metasEstablecidas;
//        int total2 = (metasCumplidas / total1) * 100;
//        
//        JOptionPane.showConfirmDialog(null, "El porcentaje de cumplimiento es de:" + total2);
//        
//    }
//    
//    public static void funcion19(){
//        
//        double capacidaTotal = Integer.parseInt(JOptionPane.showInputDialog("Capacida total del almacen"));
//        double EspacioOcupado = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de espacio ocupado"));
//        
//        double capacidadRestante = capacidaTotal - EspacioOcupado;
//        
//        JOptionPane.showMessageDialog(null, "El espacio restante es de:" + capacidadRestante);
//        
//    }
//    
//    public static void funcion20(){
//    
//        double distanciRecorrida = Integer.parseInt(JOptionPane.showInputDialog("iNGRESE LA DISTANCIA RECORRIDA EN KILOMETROS"));
//        double tarifaTotal = Integer.parseInt(JOptionPane.showInputDialog("Tarifa total"));
//        
//        double total = tarifaTotal / distanciRecorrida;
//        
//        JOptionPane.showConfirmDialog(null,"El precio por kilometro es de: " +  total);
//        
//    }   
//
//}
//
//    
//    
//        
//        
//    
//    
//    
//    
//
