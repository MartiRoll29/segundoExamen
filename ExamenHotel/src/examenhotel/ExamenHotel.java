/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenhotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Desert
 */
public class ExamenHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    
        habitaciones habi = new habitaciones(0, "", 0, "");
        util utilitario = new util();
        
        
        //habi.agregarDatos();
        int opvmenu = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese una opcion \n 1- Ver habitaciones \n 2- Editar habitaciones"));
        if  (opvmenu == 1 ) {
                habi.agregarDatos(1);
            }
        
        
        if (opvmenu ==2 ){
            habi .editar();

        }
    }
    
}
