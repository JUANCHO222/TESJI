package e2_estiterativadowhile_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;
public class E2_EstIterativaDoWhile_JuanManuel_MiguelIsidro {
    public static void main(String[] args) {
          byte x, num;
          int fact=1;
          String respuesta;
       
          
do{
       fact=1;
       num=Byte.parseByte(JOptionPane.showInputDialog("Capture un número entero"
               + "para calcular su factorial"));
       
       for (x=1;x<=num;x++){ //for(x=num;x<=5;x--)
           fact*=x; //fcat=fact*fact+x
       }
       System.out.println("La sumatoria de " + num + " es " + fact);
       respuesta=JOptionPane.showInputDialog("deseas ejecutar nuevamente"
               + " el programa S o s");
        }while(respuesta.equals("S"));
        
     }
    
}
