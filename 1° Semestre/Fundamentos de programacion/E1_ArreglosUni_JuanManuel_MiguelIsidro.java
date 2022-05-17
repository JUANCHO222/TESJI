/*Juan Manuel Miguel Isidro 
Grupo:3012
Tema:Arreglos Unidimensionales
Estaturas de un grupo de 5 personas
*/
package e1_arreglosuni_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;


public class E1_ArreglosUni_JuanManuel_MiguelIsidro {
    public static void main(String[] args) {
        byte x;
        short estatura [] = new short [5];
        int acum=0;
        /*short estatura1 [];
        estatura1 = new short [5];*/
        
        //Lectura de las estaturas
       for (x=0;x<5;x++){
           estatura[x]= Short.parseShort(JOptionPane.showInputDialog("Capture la"
                   + "estatura de la persona" + (x+1)));
           
       }
       //Promediar estaturas
       for (x=0;x<5;x++){
            acum = acum+estatura[x]; 
       }
       System.out.println("El promedio de esatura es " + acum/x+ " cm");
     /*Prueba de escritorio
      * acum     x        estatura[x]
      * 0        0        160
      *160       1        165
      *325       2        170
      *495       3        180
      *675       4        190
      *865       5        
      */
     
    }
    
}
