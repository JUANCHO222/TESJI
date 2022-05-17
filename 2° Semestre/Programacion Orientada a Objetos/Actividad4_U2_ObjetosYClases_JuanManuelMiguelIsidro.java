
import javax.swing.JOptionPane;

 /**
   EL INSTITUTO ELECTORAL DEL ESTADO DE MEXICO ESTA PLANEANDO LAS ELECCIONES
MUNICIPALES QUE SE LLEVARAN A CABO EN ABRIL DEL 2020; PARA ELLO REQUIERE QUE SE
DESARROLLO UN PROGRAMA QUE CUMPLA CON LAS SIGUIENTES FUNCIONES.

• REGISTRO E IMPRESIÓN DE 3 CANDIDATOS OFICIALES UNO PARA CADA PARTIDO.
• IMPRESIÓN DE LOS CANDIDATOS REGISTRADOS
• REGISTRO E IMPRESIÓN DE OBSERVADORES ELECTORALES, SE PERMITEN MAXIMO 10 POR
SECCION
• REGISTRO OBSERVADORES ELECTORALES, SE PERMITEN MAXIMO 10 POR SECCION
• REGISTRO DE LOS VOTOS DE LOS CIUDADANOS
• CONSIDERA SOLAMENTE 5 SECCIONES ELECTORALES
• RECEPCION DE VOTOS DE CADA SECCION- NO SE CONOCE CUANTOS VOTANTES
PARTICIPARAN
• IMPRESIÓN DE VOTOS PARA CADA PARTIDO
• TOTAL DE VOTANTES
• GANADOR

RECUERDA EMPLEAR LAS ESTRUCTURAS NECESARIAS PARA QUE TU CODIGO SEA FUNCIONAL Y
ELEGANTE, ASI COMO METODOS CON Y SIN TIPOS DE RETORNO Y USO DE PARAMETROS Y
ATRIBUTOS.
     */
public class Actividad4_U2_ObjetosYClases_JuanManuelMiguelIsidro {
    String cand1;
     String cand2;
     String cand3;
 public static void main (String []args ){
     Actividad4_U2_ObjetosYClases_JuanManuelMiguelIsidro objeto = new Actividad4_U2_ObjetosYClases_JuanManuelMiguelIsidro ();
    objeto.candidatoEleccion();//se agrgan objetos de los metodos 
     objeto.observElectoral();
     objeto.votantesElectoral();
 }
  public void candidatoEleccion(){//metodo 1 candidatos 
      JOptionPane.showMessageDialog(null, "SEAN BIEN VENIDOS A LAS ELECCIONES ");
      System.out.println("***ELECCIONES IEMM***");
String cndidato1;//estos son los candidatos a elegir 
String cndidato2;
String cndidato3;
       JOptionPane.showMessageDialog(null,"INGRESE LOS NOMBRES DE LOS CANDIDATOS POR FAVOR ");//se agragan nombres en este proceso
       cndidato1 = JOptionPane.showInputDialog("NOMBRE DEL CANDIDATO");
       cndidato2 = JOptionPane.showInputDialog("NOMBRE DEL CANDIDATO");
       cndidato3 = JOptionPane.showInputDialog("NOMBRE DEL CANDIDATO");
       this.cand1=cndidato1;
       this.cand2=cndidato2;
       this.cand3=cndidato3;
       System.out.println("LOS CANDIDATOS HAN SIDO EXITOSAMENTE REGISTRADOS ");//ya fueron agrgados
       System.out.println("\n1.-" + cndidato1 + "\n2.-"+ cndidato2 + "\n3.-"+cndidato3 );
               }//fin del metodo
    public void observElectoral() {//metodo de los observadores 
        int nObserElec = 10;// diez observadores 
        int i, X;
        String[][] obsElectorales = new String[nObserElec][5];
        JOptionPane.showMessageDialog(null, "SEAN BIENVENIDOS OBSERVADORES ");
        for (X = 0; X < 5; X++) {//5 secciones de 10 observadores 
            System.out.println("*****SECCION*****: " + (X + 1));
            for (i
                    = 0; i < nObserElec; i++) {//se agregan nombre de los observadores 
                obsElectorales[i][X] = JOptionPane.showInputDialog("SU NOMBRE ES : " + (i + 1));
                System.out.println("OBSERVADOR ES:" + (i + 1) + ": " + obsElectorales[i][X]);
    }
        }
    }//fin del metodo
    public void votantesElectoral(){//metodo de los votantes 
      int votaciones;
      int bucle;//se agrega para poder hacer que se repita 
      int votacionesSeccion1 , votacionesSeccion2,votSeccion3,votSeccion4,votSeccion5;
      int acumVotante1seccion1=0,acumVotante2seccion1=0, acumVotante3seccion1=0;//acumuladores 
      int acumVotante1seccion2=0,acumVotante2seccion2=0, acumVotante3seccion2=0;
      int acumVotante1seccion3=0,acumVotante2seccion3=0, acumVotante3seccion3=0;
      int acumVotante1seccion4=0,acumVotante2seccion4=0, acumVotante3seccion4=0;
      int acumVotante1seccion5=0,acumVotante2seccion5=0, acumVotante3seccion5=0;
      do{
      votaciones=Integer.parseInt(JOptionPane.showInputDialog("SE HAN BIENVENIDOS VOTANTES PARA CONTINUAR PRESIONE DE QUE SECCION ES:"
              +"\n.-1Seccion numero 1"
              +"\n.-2seccion numero 2"
              +"\n.-3seccion numero 3"
              +"\n.-4seccion numero 4"
              +"\n.-5seccion numero 5"));
      if(votaciones==1){//votaciones dela primera seccion
          JOptionPane.showMessageDialog(null,"SEAN BIENVENIDOS LOS VOTANTES DE LA SECCION 1");
          votacionesSeccion1=Integer.parseInt(JOptionPane.showInputDialog("SI DESEA VOTAR POR SU CANDIDATO ELIGA LA"
                  + " OPCION CORRECTA PRESIONE: "
                  +"\n.-1 CANDIDATO NUMERO 1"
                  +"\n.-2 CANDIDATO NUMERO 2"
                  +"\n.-3 CANDIDATO NUMERO 3"));
                  if(votacionesSeccion1 == 1){
                      JOptionPane.showMessageDialog(null, "USTED HA VOTADO POR EL CANDIDATO NUMERO 1");
                      acumVotante1seccion1 = acumVotante1seccion1 + 1;
                  }
                  else if (votacionesSeccion1 == 2){
                       JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 2");
                  }
                  else if(votacionesSeccion1 == 3){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 3");
                  }
      }
      if(votaciones==2){//de la segunda seccion
          JOptionPane.showMessageDialog(null,"SEAN BIENVENIDOS VOTANTES DE LA SECCION 2");
          votacionesSeccion2=Integer.parseInt(JOptionPane.showInputDialog("SI DESEA VOTAR POR SU CANDIDATO ELIGA LA"
                  + " OPCION CORRECTA PRESIONE: "
                  +"\n.-1 CANDIDATO NUMERO 1"
                  +"\n.-2 CANDIDATO NUMERO 2"
                  +"\n.-3 CANDIDATO NUMERO 3"));
      if(votacionesSeccion2==1){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 1");
                      acumVotante1seccion2=acumVotante1seccion2+1;
                  }
                  else if (votacionesSeccion2==2){
                       JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 2");
                       acumVotante2seccion1=acumVotante2seccion1+1;
                  }
                  else if(votacionesSeccion2==3){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 3");
                      acumVotante3seccion1=acumVotante3seccion1+1;
                  }
      }
      if(votaciones==3){//de la tercera seccion
          JOptionPane.showMessageDialog(null,"SEAN BIENVENIDOS VOTANTES DE LA SECCION 3");
          votSeccion3=Integer.parseInt(JOptionPane.showInputDialog("SI DESEA VOTAR POR SU CANDIDATO ELIGA LA"
                  + " OPCION CORRECTA PRESIONE: "
                  +"\n.-1 CANDIDATO NUMERO 1"
                  +"\n.-2 CANDIDATO NUMERO 2"
                  +"\n.-3 CANDIDATO NUMERO 3"));
      if(votSeccion3==1){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 1");
                      acumVotante1seccion3=acumVotante1seccion3+1;
                  }
                  else if (votSeccion3 ==2){
                       JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDTO NUMERO 2");
                  }
                  else if(votSeccion3 ==3){
                      JOptionPane.showInternalMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 3");
                  }
      }
      if(votaciones==4){//de la cuarta seccion
          JOptionPane.showMessageDialog(null,"SEAN BIENVENIDOS VOTANTES DE LA SECCION 4");
          votSeccion4=Integer.parseInt(JOptionPane.showInputDialog("SI DESEA VOTAR POR SU CANDIDATO ELIGA LA"
                  + " OPCION CORRECTA PRESIONE: "
                  +"\n.-1 CANDIDATO NUMERO 1"
                  +"\n.-2 CANDIDATO NUMERO 2"
                  +"\n.-3 CANDIDATO NUMERO 3"));
      if(votSeccion4==1){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 1");
                     acumVotante1seccion4=acumVotante1seccion4+1;
                  }
                  else if (votSeccion4 ==2){
                       JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDTO NUMERO 2");
                  }
                  else if(votSeccion4 ==3){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 3");
                  } 
      }
      if(votaciones==5){//de la quinta seccion
          JOptionPane.showMessageDialog(null,"SEAN BIENVENIDOS VOTANTES DE LA SECCION 5");
          votSeccion5=Integer.parseInt(JOptionPane.showInputDialog("SI DESEA VOTAR POR SU CANDIDATO ELIGA LA"
                  + " OPCION CORRECTA PRESIONE: "
                  +"\n.-1 CANDIDATO NUMERO 1"
                  +"\n.-2 CANDIDATO NUMERO 2"
                  +"\n.-3 CANDIDATO NUMERO 3"));
      if(votSeccion5==1){
                      JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 1");
                      acumVotante1seccion5=acumVotante1seccion5 + 1;
                  }
                  else if (votSeccion5 ==2){
                       JOptionPane.showMessageDialog(null,"USTED HA VOTADO POR EL CANDIDTO NUMERO 2");
                      acumVotante1seccion5=acumVotante1seccion5+1;
                  }
                  else if(votSeccion5 ==3){
                      JOptionPane.showMessageDialog(
                              null,"USTED HA VOTADO POR EL CANDIDATO NUMERO 3");
                  }  
    }//fin de las secciones y votaciones
                  bucle=Integer.parseInt(JOptionPane.showInputDialog("NO HAY MAS VACANTES "
                          +"\n.- PRESIONE 1 PARA CONTINUAR "
                          +"\n.- PRECIONE 2 PARA CONCLUIR "));//se agrega para repetir el proceso de las votciones
      } while( bucle == 1);//esto sierra la repeticion
      votosCndidatos1(acumVotante1seccion1,acumVotante2seccion1, acumVotante3seccion1 );
      votosCndidatos2(acumVotante1seccion2,acumVotante2seccion2, acumVotante3seccion2 );//se agregan estos metodos para que salga el total de votantes 
      votosCndidatos3(acumVotante1seccion3,acumVotante2seccion3, acumVotante3seccion3 );
      votosCndidatos4(acumVotante1seccion4,acumVotante2seccion4, acumVotante3seccion4 );
      votosCndidatos5(acumVotante1seccion5,acumVotante2seccion5, acumVotante3seccion5 );
      }  
//metodos para asignar el numero de los votantes entre mas cosas 
    public void votosCndidatos1(int acumVotante1secsion1, int acumVotante2secsion1, int acumVotante3secsion1) {
        int votoTotalSec1=acumVotante1secsion1+acumVotante2secsion1 + acumVotante3secsion1;
        System.out.println("SUS RESULTADOS SON: ");
        System.out.println("LA SECCION 1 OBTUVO: " +votoTotalSec1 + " VOTACIONES");
        System.out.println("DEL CANDIDATO 1 " + acumVotante1secsion1);
        System.out.println("DEL CANDIDATO 2 " + acumVotante2secsion1);
        System.out.println("DEL CANDIDATO 3 " + acumVotante3secsion1);
    }
    public void votosCndidatos2(int acumVotante1secsion2, int acumVotante2secsion2, int acumVotante3secsion2) {
        int votoTotalSec2=acumVotante1secsion2+acumVotante2secsion2 + acumVotante3secsion2;
        System.out.println("SUS RESULTADOS SON: ");
        System.out.println("LA SECCION 1 OBTUVO: " +votoTotalSec2 + " VOTACIONES");
        System.out.println("DEL CANDIDATO 1 " + acumVotante1secsion2);
        System.out.println("DEL CANDIDATO 2 " + acumVotante2secsion2);
        System.out.println("DEL CANDIDATO 3 " + acumVotante3secsion2);
    }
    public void votosCndidatos3(int acumVotante1secsion3, int acumVotante2secsion3, int acumVotante3secsion3) {
       int votoTotalSec3=acumVotante1secsion3+acumVotante2secsion3 + acumVotante3secsion3;
        System.out.println("SUS RESULTADOS SON: ");
        System.out.println("LA SECCION 1 OBTUVO: " +votoTotalSec3 + " VOTACIONES");
        System.out.println("DEL CANDIDATO 1 " + acumVotante1secsion3);
        System.out.println("DEL CANDIDATO 2 " + acumVotante2secsion3);
        System.out.println("DEL CANDIDATO 3 " + acumVotante3secsion3);
    }
    public void votosCndidatos4(int acumVotante1seccion4, int acumVotante2seccion4, int acumVotante3seccion4) {
        int votoTotalSec4=acumVotante1seccion4+acumVotante2seccion4 + acumVotante3seccion4;
        System.out.println("SUS RESULTADOS SON: ");
        System.out.println("LA SECCION 1 OBTUVO: " +votoTotalSec4 + " VOTACIONES");
        System.out.println("DEL CANDIDATO 1 " + acumVotante1seccion4);
        System.out.println("DEL CANDIDATO 2 " + acumVotante2seccion4);
        System.out.println("DEL CANDIDATO 3 " + acumVotante3seccion4);
    }
    public void votosCndidatos5(int acumVotante1seccion5, int acumVotante2seccion5, int acumVotante3seccion5) {
        int votoTotalSec5=acumVotante1seccion5+acumVotante2seccion5 + acumVotante3seccion5;
        System.out.println("SUS RESULTADOS SON: ");
        System.out.println("LA SECCION 1 OBTUVO: " +votoTotalSec5 + " VOTACIONES");
        System.out.println("DEL CANDIDATO 1 " + acumVotante1seccion5);
        System.out.println("DEL CANDIDATO 2 " + acumVotante2seccion5);
        System.out.println("DEL CANDIDATO 3 " + acumVotante3seccion5);
    }
}

