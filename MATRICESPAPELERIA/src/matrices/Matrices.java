
package matrices;

import java.util.Scanner;

public class Matrices {

    //Promocion papeleria
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String [] meses = { "enero","febrero","marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String [] nombresArticulos = {"Lapices","Borrador","cuaderno","regla"};
        
        
        
        //Asi se crea una matris 
        int[][] juegos ={
                        {2,3,1,2},
                        {6,4,2,1}    
                        };  
        //Ventas es nuestra matris de 12x2
        int [][] ventas = new int[12][2];
        
        // matris de 4x2
        double [][] precio = new double [4][12];
            
        //Siempre que tenga que correr matris o arreglo tengo que hacer un for 
        
        for (int mes = 0; mes < 12; mes++) {
                System.out.println("Digite las ventas del mes de: " + meses[mes] +":");
                System.out.println("Promocion 1 vendidos: ");
                
                //Llamamos a la matris ventas
               ventas[mes][0] = sc.nextInt();
               
               System.out.println("Promocion 2 vendidos: ");
               ventas[mes][1] = sc.nextInt();
               
               System.out.println("Digite los precios de los productos en el mes de: " + meses[mes] + ":");
            for (int articulo = 0; articulo < 4; articulo++) {
                System.out.println("Precio por "+ nombresArticulos[articulo] + ":");
                precio[articulo][mes] = sc.nextDouble();
            }
        }
            //Calculo de articulos vendidos por mes , total anual
            int [][] articulosVendidosMensuales = new int  [4][12]; //Articulos Vendidos  en 12 meses
            int [] articulosVendidosAnuales = new int [4];//Total anual articulos
            
            System.out.println("\nNumero de Articulos Vendidos en c/mes: ");
            
            for (int mes = 0; mes < 12; mes++) {
                System.out.println("\nMes: " + meses[mes]);
                //Asi se suman matrices
                for (int articulo = 0; articulo < 4; articulo++) {
                   
                    articulosVendidosMensuales[articulo][mes] = juegos[0][articulo]* ventas [mes][0] + juegos[1][articulo] * ventas[mes][1];
                    
                    //Valor articulosVendidosAnuales se le da ese valor y se va sumando
                    articulosVendidosAnuales[articulo] += articulosVendidosMensuales[articulo][mes];
                    System.out.println(nombresArticulos[articulo]+ "Vendidos" + articulosVendidosMensuales[articulo][mes]);
                }
            }
                //Calculo total de ventas o de articulos/mes y total anual
                
                
                //MAtrices tienen limitacion 
                double [][] ventasPorArticulo = new double [4][12];
                double [] totalVentasMensuales = new double [12];
                double [] totalVentasAnualesPorArticulo  = new double [4];
                double totalVentasAnual = 0.0; 
                               
                System.out.println("\nEl total de las ventas por Articulo mes son : "); 
                for ( int mes = 0; mes < 12; mes++) {
                    System.out.println("\nMes: " + meses[mes]);
                    for (int articulo = 0; articulo < 4; articulo++) {
                        ventasPorArticulo[articulo][mes] = articulosVendidosMensuales[articulo][mes]  * precio[articulo][mes];
                        totalVentasMensuales[mes] +=  ventasPorArticulo[articulo][mes];
                        totalVentasAnualesPorArticulo[articulo]  += ventasPorArticulo[articulo][mes];
                        System.out.println("Ventas de " + nombresArticulos[articulo] + ": $" + ventasPorArticulo[articulo][mes]);
                        
                    }
                    System.out.println("Total ventas " + meses[mes] + ": $ " + totalVentasMensuales[mes]);
                    totalVentasAnual +=   totalVentasMensuales[mes];
                }  
                             //Mostrar total anueal de ventas por artoulacion y el toatal genera del año
            System.out.println("\nTotal anual de ventas por aticulo");
            for (int articulo = 0; articulo < 4; articulo++) {
            System.out.println(nombresArticulos[articulo] + ": $" + totalVentasAnualesPorArticulo[articulo]);
        }
                System.out.println("Total ventas anual: $" + totalVentasAnual);
            
    }  
    
}
//numero total de acicidentes por tipo de behiculo (motocarro) .)porcentaje de conductores con infracciones de transito registrada en el ultimo año
//poorcentade de vehiculos que superan el limite de velocidad permitido  .)distribuccion de accidentes por dia .)zonas con mayor numero de acciodestes de trafico  .) porcejntaje de conductores que han participado en programas de educacion via .)promedi ode multas por cuonductor en el ultiimo año