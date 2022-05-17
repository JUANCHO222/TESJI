package multiplicacion;

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        boolean comprobar = true;
        int n;
        
        while(comprobar == true){
            
        System.out.println("Ingrese un numero entero ");
        n = lector.nextInt();
        
        if (n > 0){
           for(int i = 1;i<= 10;i++){
               
               System.out.println(n+" por "+i+"es igual a:"+n*i);
           }
           comprobar = false;
        }
        else{
            System.out.println("El numero ingresado no es correcto. Intentelo "
                    + "de nuevo");
        }
      }
    }
    
}
