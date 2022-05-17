/*
 * Juan Manuel Miguel Isidro
 * Grupo:3012
 * Tema:Arreglos Bidimensionales 
 *Descripcion del problema:Solicitar la calificacion de las materias de Fundam de
 *inv, Fundam de prog y mate disc y obtener el promedio de cada una de ellas.
 */
package e2_arreglbid_juan.manuel.miguel.isidro;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class E2_ArreglBid_JuanManuelMiguelIsidro {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        byte x,y;
        float calificacion [][] = new float [3][5];
        float acum=0;
        
        //Solicitar las calificaciones de las materias eimprimirlas
        for (x=0;x<=2;x++){
            float promedio=0;
            for(y=0;y<=4;y++){
                
                calificacion[x][y]=Float.parseFloat(JOptionPane.showInputDialog
        ("Escribe la calificacion "));
                System.out.print(calificacion [x][y] + "\t");
                acum=acum+calificacion[x][y];
            }
            promedio=acum/5;
            System.out.println("Tu promedio es de " + promedio);
            /*
             *prueba de escritorio 
             *x         y        calificacion[x][y]
             *0         0        100
             *          1        92
             *          2        85
             *          3        100
             *          4        100
             *          5
             *1         0        100
             *          1        90
             *          2        85
             *          3        100
             *          4        100
             *          5
             *2         0        90
             *          1        85
             *          2        75 
             *          3        99
             *          4        100
             *          5
             */
        }
        
    }
    
}
