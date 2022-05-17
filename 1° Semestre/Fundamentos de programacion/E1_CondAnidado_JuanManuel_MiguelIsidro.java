/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1_condanidado_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-1
 */
public class E1_CondAnidado_JuanManuel_MiguelIsidro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte pregunta,contraseña, numeroagente, folio;
       short dia, mes, año;
       dia=Short.parseShort(JOptionPane.showInputDialog("Captura tu dia"));
        if(dia<=31){
             mes=Short.parseShort(JOptionPane.showInputDialog("Captura tu "
                     + "mes"));
        if(mes<=12){
              año=Short.parseShort(JOptionPane.showInputDialog("Captura tu"
                      + " año"));
        if(año>=2002){
            folio=Byte.parseByte(JOptionPane.showInputDialog("Captura tu "
                    + "folio"));
        if(folio<=100){
            numeroagente=Byte.parseByte(JOptionPane.showInputDialog("Captura "
                    + "tu numero clave"));
        if(numeroagente<=1000){
             pregunta=Byte.parseByte(JOptionPane.showInputDialog("Cuantas patas"
                     + "tiene el gato"));
        if(pregunta==5){
            contraseña=Byte.parseByte(JOptionPane.showInputDialog("Ingrese la"
                    + " contraseña"));
        if(contraseña==117){
            System.out.println("Acceso Autorizado"); 
        }else{
         System.out.println("Acceso denegado");  
        }
            
        }else{
         System.out.println("Acceso Denegado");    
        }
        }
        }
          
             
        }
        }
        }
    }
    
}
