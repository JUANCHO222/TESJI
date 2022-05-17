/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1_estlterativasfor_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-1
 */
public class E1_EstlterativasFor_JuanManuel_MiguelIsidro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte x, num;
       int sumatoria=0;
       
       num=Byte.parseByte(JOptionPane.showInputDialog("Capture un número entero"));
       //for (inicialización;condicion o limite;actualizacion)
       for (x=num;x>=1;x--){
           sumatoria+=x; //sumatoria=sumatoria+x;
           //System.out.println("La sumatoria de " + x + " es " + sumatoria);
       }
       System.out.println("La sumatoria de " + num + " es " + sumatoria);
       /*PRUEBA DE ESCRITORIO 
       num     x       sumatoria       Mensaje
                       0               
       5       5       5               La sumatoria de 5 es 5
       *       4       9               La sumatoria de 4 es 9
       *       3       12              La sumatoria de 3 es 12
       *       2       14              La sumatoria de 2 es 14
       *       1       15              La sumatoria de 1 es 15
       *       0       
       */
    }
    
}
