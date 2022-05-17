/*EXAMEN DE ARREGLOS UNIDAD 4 
El Instituto Electoral del Estado de México (IEEM), está solicitando que se desarrolle un programa que le permita  llevar el conteo de las votaciones de julio de 2020. Donde  se elegirá a los presidentes municipales de Jilotepec, Chapa  de Mota y San Francisco.  
Para ello, se desconoce la cantidad de personas que  votarán, pues conforme van llegando a la fila van emitiendo  su voto.  
Existen tres partidos políticos disponibles MORADO, ROSA  Y CAFÉ. 
Elabora un programa que pregunte por quien votara, utiliza  ciclos, arreglos y condicionales para realizar tu programa. 
Una vez concluida la votación se deberá imprimir el total de  personas que votaron, cuantos votos obtuvo cada partido y  cuál fue el partido ganador y el porcentaje con que gano. O  bien si hubo un empate. 

Integrantes:
*Juan Manuel Miguel Isidro
*Juan Carlos Santiago Arce
*Luis Gerardo Cardozo Carranza
*Luis David Urbano Trejo
*José María Hernández Palacios

Equipo #5
Grupo:"3012"
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-1
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     byte edad,credencial,partido,municipio,inicio;
        double vigencia;
        String respuesta;
        int totalJilo,totalChapa,totalSf;
        int acumj1=0, acumj2=0, acumj3=0;
        int acumch1=0,acumch2=0,acumch3=0;
        int acumsf1=0, acumsf2=0,acumsf3=0;
        double rosaJ,moradoJ,cafeJ;
        double rosaCh,moradoCh,cafeCh;
        double rosaSf,moradoSf,cafeSf;
        inicio=Byte.parseByte(JOptionPane.showInputDialog("Bienvenido al padrón electoral "
               + "2020, presiona 1 para continuar"));
        do{
            edad=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu edad"));
            if(edad>=18){
                credencial=Byte.parseByte(JOptionPane.showInputDialog("¿Tienes credencial"
                        + " de elector?, periona 1 si sí tienes credencial"));
                if(credencial==1){
                    vigencia=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la "
                            + "la vigencia de tu credencial"));
                    
                    if(vigencia>=2020&&vigencia<=2031){
                        municipio=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero"
                                + " de tu municipio, 46 para Jilotepec, 26 pra chapa de mota y 45"
                                + " para San Francisco"));
                        if(municipio==46){ // Jilotepec habitantes:83 755
                            partido=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si tu "
                                    + "eleccion es rosa, presiona 2 si tu eleccion es morado y presiona"
                                    + " 3 si tu eleccion es cafe"));//Luis Gerardo
                            if(partido==1){//Juan Carlos
                                acumj1=acumj1+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                            if(partido==2){
                                acumj2=acumj2+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                            if(partido==3){
                                acumj3=acumj3+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                        }
                        if(municipio==26){ //Chapa de Mota habitantes:27 551
                            partido=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si tu "
                                    + "eleccion es rosa, presiona 2 si tu eleccion es morado y presiona"
                                    + " 3 si tu eleccion es cafe"));
                            if(partido==1){
                                acumch1=acumch1+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                            if(partido==2){
                                acumch2=acumch2+1;
                                System.out.println("Tu voto ha sido registrado");
                        
                            }
                            if(partido==3){
                                acumch3=acumch3+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                        }
                        if(municipio==45){ // San Francosco habitantes:
                            partido=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si tu "
                                    + "eleccion es rosa, presiona 2 si tu eleccion es morado y presiona"
                                    + " 3 si tu eleccion es cafe"));
                            if(partido==1){
                                acumsf1=acumsf1+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                            if(partido==2){
                                acumsf2=acumsf2+1;
                                System.out.println("Tu voto ha sido registrado");
                            }
                            if(partido==3){
                                acumsf3=acumsf3+1;
                                System.out.println("Tu voto ha sido registrado");
                            }//Juan Carlos
                        }
                    }else{//Luis Gerardo
                        System.out.println("No puedes votar, tu credencial ha expirado");
                    }
                }else{
                System.out.println("No puedes votar, no tienes credencial");
                }
            }else{
                System.out.println("No puedes votar, eres menor de edad");
            }
            respuesta=JOptionPane.showInputDialog("Bienvenido al Padrón electoral 2020 "
                    + "presiona 1 para continuar");
        }while(respuesta.equals("1"));//Luis Gerardo
        
        totalJilo=acumj1+acumj2+acumj3;//yo
        totalChapa=acumch1+acumch2+acumch3;
        totalSf=acumsf1+acumsf2+acumsf3;
        System.out.println("\nTotal de personas votantes de jilotepec = " +totalJilo );
        System.out.println("Total de personas votantes de Chapa de Mota = " + totalChapa );
        System.out.println("Total de personas votantes de San Francisco = " + totalSf );
        //Jilotepec
        rosaJ=acumj1*100/totalJilo;
        System.out.println("\nPorcentaje del partido rosa de Jilotepec es de un = " + rosaJ+"%");
        moradoJ=acumj2*100/totalJilo;
        System.out.println("Porcentaje del partido morado de Jilotepec es de un = " + moradoJ+"%");
        cafeJ=acumj3*100/totalJilo;
        System.out.println("Porcentaje del partido cafe de Jilotepec es de un = " + cafeJ+"%");//yo
        if(rosaJ>moradoJ){
            if(rosaJ>cafeJ){
                    System.out.println("\nEl GANADOR de Jilotepec es el partido"
                            + "Rosa con un "+rosaJ+"%");
            }
        }
        if(moradoJ>rosaJ){
            if(moradoJ>cafeJ){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Morado con un "+moradoJ+"%");
            }
        }
        if(cafeJ>moradoJ){
            if(cafeJ>rosaJ){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Cafe con un "+cafeJ+"%");
            }
        }
        if(rosaJ>cafeJ){
            if(rosaJ==moradoJ){
                System.out.println("\nHay un EMPATE entre el partido Rosa con un "+rosaJ
                        +"% y el partido Morado con un "+moradoJ+"%");
            }
        }
        if(rosaJ>moradoJ){
            if(rosaJ==cafeJ){
                System.out.println("\nHay un EMPATE entre el partido Rosa con un "+rosaJ
                        +"% y el partido Cafe con un "+cafeJ+"%");
            }
        }
        if(moradoJ>rosaJ){
            if(moradoJ==cafeJ){
                System.out.println("\nHay un EMPATE entre el partido Morado con un "+moradoJ
                        +"% y el partido Cafe con un "+cafeJ+"%");
            }
        }
        if(rosaJ==moradoJ){
            if(rosaJ==cafeJ){
                System.out.println("\nHay un TRIPLE EMPATE con un 33.33% cada uno");
            }
        }
        //Chapa de Mota
        rosaCh=acumch1*100/totalChapa;
        System.out.println("\nPorcentaje del partido rosa de Chapa de Mota es de un = " + rosaCh+"&");
        moradoCh=acumch2*100/totalChapa;
        System.out.println("Porcentaje del partido morado de Chape de Mota es de un = " + moradoCh+"&");
        cafeCh=acumch3*100/totalChapa;
        System.out.println("Porcentaje del partido cafe de Chapa de Mota es de un = " + cafeCh+"&");
        if(rosaCh>moradoCh){
            if(rosaCh>cafeCh){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Rosa con un "+rosaCh+"%");
            }
        }
        if(moradoCh>rosaCh){
            if(moradoCh>cafeCh){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Morado con un "+moradoCh+"%");
            }
        }
        if(cafeCh>moradoCh){
            if(cafeCh>rosaCh){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Cafe con un "+cafeCh+"%");
            }
        }
        if(rosaCh>cafeCh){
            if(rosaCh==moradoCh){
                System.out.println("\nHay un EMPATE entre el partido Rosa con un "+rosaCh
                        +"% y el partido Morado con un "+moradoCh+"%");
            }
        }
        if(rosaCh>moradoCh){
            if(rosaCh==cafeCh){
                System.out.println("\nHay un EMPATE entre el partido Rosa con un "+rosaCh
                        +"% y el partido Cafe con un "+cafeCh+"%");
            }
        }
        if(moradoCh>rosaCh){
            if(moradoCh==cafeCh){
                System.out.println("\nHay un EMPATE entre el partido Morado con un "+moradoCh
                        +"% y el partido Cafe con un "+cafeCh+"%");
            }
        }
        if(rosaCh==moradoCh){
            if(rosaCh==cafeCh){
                System.out.println("\nHay un TRIPLE EMPATE con un 33.33% cada uno");
            }
        }
        //San Francisco
        rosaSf=acumsf1*100/totalSf;
        System.out.println("\nPorcentaje del partido rosa de San Francisco es de un = " + rosaSf+"&");
        moradoSf=acumsf2*100/totalSf;
        System.out.println("Porcentaje del partido morado de San Francisco es de un = " + moradoSf+"&");
        cafeSf=acumsf3*100/totalSf;
        System.out.println("Porcentaje del partido cafe de San Francisco es de un = " + cafeSf+"&");
        if(rosaSf>moradoSf){
            if(rosaSf>cafeSf){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Rosa con un "+rosaSf+"%");
            }
        }
        if(moradoSf>rosaSf){
            if(moradoSf>cafeSf){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Morado con un "+moradoSf+"%");
            }
        }
        if(cafeSf>moradoSf){
            if(cafeSf>rosaSf){
                System.out.println("\nEl GANADOR de Jilotepec es el partido"
                        + "Cafe con un "+cafeSf+"%");
            }
        }
        if(rosaSf>cafeSf){
            if(rosaSf==moradoSf){
                System.out.println("\nHay un EMPATE entre el partido Rosa con un "+rosaSf
                        +"% y el partido Morado con un "+moradoSf+"%");
            }
        }
        if(rosaSf>moradoSf){
            if(rosaSf==cafeSf){
                System.out.println("\nHay un EMPATE entre el partido Rosa con un "+rosaSf
                        +"% y el partido Cafe con un "+cafeSf+"%");
            }
        }
        if(moradoSf>rosaSf){
            if(moradoSf==cafeSf){
                System.out.println("\nHay un EMPATE entre el partido Morado con un "+moradoSf
                        +"% y el partido Cafe con un "+cafeSf+"%");
            }
        }
        if(rosaSf==moradoSf){
            if(rosaSf==cafeSf){
                System.out.println("\nHay un TRIPLE EMPATE con un 33.33% cada uno");
            }
        }
    }
}