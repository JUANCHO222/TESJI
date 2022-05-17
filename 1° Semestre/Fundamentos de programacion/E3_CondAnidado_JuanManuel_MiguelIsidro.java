/*Juan Manuel Miguel isidro "3012"
4. Elabora un programa con condicionales anidados que solicite 3 calificaciones,
obtén el promedio de esas tres calificaciones, y de acuerdo al promedio que se
obtuvo, coloca la leyenda que le corresponde, que encontraras en la imagen que 
te comparto con el nombre NIVEL DE DESEMPENIO-TESJI.JPG.  Por ejemplo si tu 
promedio se encuentra entre 95 y 100 deberá aparecer la leyenda "EXCELENTE"
 */
package e3_condanidado_juan.manuel_miguel.isidro;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class E3_CondAnidado_JuanManuel_MiguelIsidro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, z, x, p;
        
        a=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu "
                + "primera calificacion"));
        z=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu "
                + "segunda calificacion"));
        x=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu"
                + " tercera calificacion"));
        p=a/3+z/3+x/3;
        if (p>=9.5){
            JOptionPane.showInputDialog(null, "¡Exelente!");
        }else{
            if (p>=8.5&& p<=9.4){
                 JOptionPane.showInputDialog(null, "¡Notable!");
            }else{
              if (p>=7.5&& p<=8.4){
                 JOptionPane.showInputDialog(null, "¡Bueno!");  
            }else{
                  if (p>=6.5&& p<=7.4){
                 JOptionPane.showInputDialog(null, "¡Suficiente!");  
              }else{
                       if (p>=0&& p<=6.4){
                 JOptionPane.showInputDialog(null, "¡REPROBADO!");  
                  }
                  
              }
        }
    }
        }
        }
    }