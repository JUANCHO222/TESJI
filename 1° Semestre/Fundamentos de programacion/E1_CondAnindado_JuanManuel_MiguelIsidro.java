/*Juan Manuel Miguel Isidro "3012"
 *1.Sube las evidencias de los programas condicionales anidados, solicitados de acuerdo a las descripciones dadas, con la siguiente nomenclatura.
 * 
 * 
 */
package e1_condanindado_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-1
 */
public class E1_CondAnindado_JuanManuel_MiguelIsidro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte edad, credencial, padron;
        short vigencia;
        
        edad=Byte.parseByte(JOptionPane.showInputDialog("Captura tu edad"));
        if(edad==18){
             credencial=Byte.parseByte(JOptionPane.showInputDialog("Capture "
                     + "1 si tiene credencial"));
             if(credencial==1){
                 vigencia=Short.parseShort(JOptionPane.showInputDialog("Capture"
                         + " el año de vigencia"));
                 if(vigencia>=2006){
                     padron=Byte.parseByte(JOptionPane.showInputDialog("Teclee "
                             + "1 si encuentra el padron electoral"));
                     if(padron==1){
                        System.out.println("Ya puede votar"); 
                     }else{
                         System.out.println("No puede votar");
                     }
                     
                 }else{
                      System.out.println("No puede votar"); 
                 }
             }else{
                System.out.println("No puede votar"); 
             }
        }else{
            System.out.println("No puede votar");
        }
    }
    
}
