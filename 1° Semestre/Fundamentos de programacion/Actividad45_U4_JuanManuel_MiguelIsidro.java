/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad45_u4_juan.manuel_miguel.isidro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Actividad45_U4_JuanManuel_MiguelIsidro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner entrada= new Scanner (System.in);
        byte x,y;
        float calificacion [][] = new float [4][5];
        float acumTotal=0;
        float general;
        String materias[]={"Matematicas","Investigacion","Programacion","General"};
        String unidades[]={"1", "2", "3", "4", "5","promedio"};    
    
      System.out.println("\t"+"\t"+ unidades [0]+"\t" +   unidades [1]+"\t"  
              + unidades [2] +"\t"   + unidades [3] +"\t" + unidades [4]+ "\t"
              + unidades[5] );
      
     
        //Solicitar las calificaciones de las materias eimprimirlas
        for (x=0;x<=3;x++){
            System.out.print(materias[x] + "\t");
            float promedio=0;
            float acum=0;
            
            
            
            for(y=0;y<=4;y++){
                calificacion[x][y]=Float.parseFloat(JOptionPane.showInputDialog
        ("Escribe la calificacion "));
                System.out.print(calificacion [x][y] + "\t");
                acum=acum+calificacion[x][y]; 
                
              
            }
    
         promedio = acum/y;
            System.out.println(promedio);
            
            acumTotal=acumTotal+promedio[x][y];
            general=acumTotal/3;
            System.out.println(general);
    }
        
    }
}
