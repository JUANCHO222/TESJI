/* 
 *Nombre: Juan Manuel Miguel Isidro
 *Matricula: 202023032
 *Docente: Yadira Jiménez Pérez
 *Grupo: 3202
 */
package Poo;
import javax.swing.JOptionPane;


public class Votaciones{
    public int m,a,b,votosSec=0;
    String p;
    int vot[]= new int[3];
    int c[]= new int[3];
    int cS[]= new int[3];
    String obs;
    String secciones[]={"1020","1021","1022","1023","1024"};
    String part[]= {"Partido MORADO","Partido ACUAMARINO","Partido BLANCO"};
        
   public String registroSecciones(){
        
       String noSec;
        noSec=(String)JOptionPane.showInputDialog(null,"SELECCIONE NUMERO DE SECCION",
                    "SECCIONES ELECTORALES DE JILOTEPEC", JOptionPane.DEFAULT_OPTION, null, 
                    secciones, secciones[0]);
        return noSec;
    }

   public String partidos (){
        p=(String)JOptionPane.showInputDialog(null,"Seleccione el partido de su preferencia",
                    "PARTIDOS", JOptionPane.DEFAULT_OPTION, null, part, part[0]);
        return p;
   }

   public int registroVotos(){
       int x,resp;
       m=0;a=0;b=0;
       do{
            switch (partidos()) {
                case "Partido MORADO":
                    this.m++;
                    break;
                case "Partido ACUAMARINO":
                    this.a++;
                    break;
                case "Partido BLANCO":
                    this.b++;
                    break;
            }
        resp= Integer.parseInt(JOptionPane.showInputDialog("¿Hay votantes? Presiona 1 si la respuesta es afirmativa,"
                + "\n En caso de no ser asi presione 2"));
        }while(resp==1);
        votosSec=m+a+b;
        int c[]={m,a,b};
        for(x=0;x<part.length;x++){
            System.out.print(part[x] + ":");
            System.out.println(c[x] + " votos");
            this.cS[x]+=c[x];
        }
        
        System.out.println("Votaron " + votosSec + "  personas en esta seccion" );
        return votosSec;
    }
   
   public void registroObservadores(){
       byte x=0;
       String resp;
       resp=JOptionPane.showInputDialog("Existen observadores electorales"
                    + "en la seccion \nEn caso de ser afirmativo presione 1");
       while(resp.equals("1")&&x<3){
            obs=JOptionPane.showInputDialog("Ingresa el nombre del observador "
                        + "electoral para la seccion " );
            x++;
            resp=JOptionPane.showInputDialog("Desea registrar un observador "
                   + "para esta seccion \nEn caso afirmativo presione 1");
            System.out.println(obs);
       }
    }
}
class llamada{
    static int votosTot=0;
    public static void main(String [] args){
        byte resp, x;
        Votaciones obj = new Votaciones();
        do{
            System.out.println("Seccion " + obj.registroSecciones());
            System.out.println("OBSERVADORES ELECTORALES");
            obj.registroObservadores();
            votosTot+=obj.registroVotos();
            resp=Byte.parseByte(JOptionPane.showInputDialog("Desea registrar "
                    + "los votos de otra seccion? \n "
                    + "Presione 1 si su respuesta es afirmativa \n Para salir unicamente presione 2"));
            System.out.println();
        }while(resp==1);
         for(x=0;x<obj.cS.length;x++){
             System.out.print(obj.part[x] + ":");
             System.out.println( obj.cS[x] + " votos");
         }
         
         ComputoVotos ganador = new ComputoVotos(obj.a,obj.b,obj.m,obj.part);
         ganador.ganador();
         
         System.out.println(" \n TOTAL DE VOTANTES EN JILOTEPEC " + votosTot);
    }
}