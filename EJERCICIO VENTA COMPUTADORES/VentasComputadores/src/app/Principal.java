/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Tienda tienda = new Tienda();
        
        while(true){
            
            String[] opciones = {
                "Agreagra nuevo productos",
                "Registrar fabricantes",
                "Realizar ventas"
            };
            String seleccion =(String)JOptionPane.showInputDialog(null,"seleccione una opcion",
                    "Sistema de venta de comptadores", JOptionPane.QUESTION_MESSAGE, null,
                    opciones ,opciones[0]);
                    
            if(seleccion == null || seleccion.equals("Salir")){
                break;
            }
            
            switch(seleccion){
            
                case "Agreagra nuevo productos":
                    tienda.agregarProductos();
                    break;
                    
                case "Registrar fabricantes":
                    tienda.registrarFabricantes();
                    break;
                    
                case "Realizar ventas":
                    tienda.realizarVentas();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                    break;
                
            }
    
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar el servicio");
        
    }
    
}
