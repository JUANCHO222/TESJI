/*Juan Manuel Miguel isidro "3012"
 * 3. Sube las evidencias del programa condicionales anidado, visto en la
grabación de la clase del 03 de diciembre de 2020, emplea la siguiente 
nomenclatura.
 */
package e2_condanidado_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-1
 */
public class E2_CondAnidado_JuanManuel_MiguelIsidro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b,c;
    
    a=Integer.parseInt(JOptionPane.showInputDialog("Captura un número entero-a"));
    b=Integer.parseInt(JOptionPane.showInputDialog("Captura un número entero-b"));
    c=Integer.parseInt(JOptionPane.showInputDialog("Captura un número entero-c"));
    
    if(a>b){
        if(a>c){
            if(b>c){
                System.out.println(a+" "+b+" "+c);
            }else{
             System.out.println(a+" "+c+" "+b);   
            }
        }else{
            System.out.println(c+" "+a+" "+b);
        }
    }else if(b>c){
        if(a>c){
            System.out.println(b+" "+a+" "+c);
        }else{
            System.out.println(b+" "+c+" "+a);
        }
    }else{
      System.out.println(c+" "+b+" "+a);  
    }
    }
    
}
