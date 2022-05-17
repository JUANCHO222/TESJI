import javax.swing.JOptionPane;
/*
Equipo:5
Integrantes:
-Hernandez Palacios Jose Maria
-Santiago Arce Juan Carlos
-Miguel Isidro Juan Manuel
-Urbano Trejo Luis David
-Cardozo Carranza Luis Gerardo

Tema:Examen de UNIDAD 4
Descripcion:EXAMEN DE ARREGLOS UNIDAD 4
FUNDAMENTOS DE PROGRAMACION
Fecha:Viernes, 22 de Enero de 2020

 -El Instituto Electoral del Estado de México (IEEM), está solicitando que se
 desarrolle un programa que le permita llevar el conteo de las votaciones de 
 julio de 2020. Donde se elegirá a los presidentes municipales de Jilotepec,
 Chapa de Mota y San Francisco.

 -Para ello, se desconoce la cantidad de personas que votarán, pues conforme
 van llegando a la fila van emitiendo su voto.

 -Existen tres partidos políticos disponibles MORADO, ROSA Y CAFÉ.

 -Elabora un programa que pregunte por quien votara, utiliza ciclos, arreglos
 y condicionales para realizar tu programa.

 -Una vez concluida la votación se deberá imprimir el total de personas que
 votaron, cuantos votos obtuvo cada partido y cuál fue el partido ganador y
 el porcentaje con que gano. O bien si hubo un empate.
 */
public class ExamenU4_Equipo5 {//Inicio Clase publica 
    public static void main(String []args){//Inicio Metodo Principal
       //Declaracion de variables
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
        
        //Inicio mensaje de bienvenida por medio de Parseo
        inicio=Byte.parseByte(JOptionPane.showInputDialog("Bienvenido al padrón electoral "
               + "2020, presiona 1 para continuar"));
        do{//Inicio del BUCLE DO WHILE( Permite repetir intrucciones de un bloque de codigo
          //Controlar una vez el proceso de votacion(Registro,opcion de municipio, eleccion de partido), conteo y opcion de salida.
          
           //Inicio del CONDICIONAL IF ELSE (Condicional Anidado)
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
                        //Iniciamos Condicional Anidado IF (el acomulador de votos por partido del municipio de (46) Jilotepec)
                        if(municipio==46){ // Jilotepec habitantes:83 755
                            partido=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si tu "
                                    + "eleccion es rosa, presiona 2 si tu eleccion es morado y presiona"
                                    + " 3 si tu eleccion es cafe"));
                             //Inicio de If´s anidados que llevan el conteo de los votos por partido
                            if(partido==1){
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
                            }//Fin del Condicional IF (el acomulador de votos por partido del municipio de (46) Jilotepec)
                        }//Fin de If´s anidados que llevan el conteo de los votos por partido
                        
                        //Iniciamos Condicional Anidado IF (el acomulador de votos por partido del municipio de (26) Chapa de Mota)
                        if(municipio==26){ //Chapa de Mota habitantes:27 551
                            partido=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si tu "
                                    + "eleccion es rosa, presiona 2 si tu eleccion es morado y presiona"
                                    + " 3 si tu eleccion es cafe"));
                            
                            //Inicio de If´s anidados que llevan el conteo de los votos por partido
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
                            }//Fin de If´s anidados que llevan el conteo de los votos por partido
                        }//Fin Condicional Anidado IF (el acomulador de votos por partido del municipio de (26) Chapa de Mota)
                        
                       //Iniciamos Condicional Anidado IF (el acomulador de votos por partido del municipio de (45) San Francisco)
                        if(municipio==45){ // San Francosco habitantes:
                            partido=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si tu "
                                    + "eleccion es rosa, presiona 2 si tu eleccion es morado y presiona"
                                    + " 3 si tu eleccion es cafe"));
                            //Inicio de If´s anidados que llevan el conteo de los votos por partido
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
                            }//Fin de If´s anidados que llevan el conteo de los votos por partido
                        }//Fin Condicional Anidado IF (el acomulador de votos por partido del municipio de (45) San Francisco)
                        
                     //Fin del CONDICIONAL IF ELSE (Condicional Anidado) que iniciamos al principio para que el usuario cumpla
                    //con las condiciones establecidas del IEEM y del programa
                    }else{
                        System.out.println("No puedes votar, tu credencial ha expirado");
                    }
                }else{
                System.out.println("No puedes votar, no tienes credencial");
                }
            }else{
                System.out.println("No puedes votar, eres menor de edad");
            }
            
            //Fin del BUCLE DO WHILE( Permite repetir intrucciones de un bloque de codigo
           //Controlar una vez el proceso de votacion(Registro,opcion de municipio, eleccion de partido), conteo y opcion de salida.
            respuesta=JOptionPane.showInputDialog("Bienvenido al Padrón electoral 2020 "
                    + "presiona 1 para continuar");
        }while(respuesta.equals("1"));
        
        //Proceso de Operaciones para dar a conocer los resutados y las necesidades del programa
        totalJilo=acumj1+acumj2+acumj3;
        totalChapa=acumch1+acumch2+acumch3;
        totalSf=acumsf1+acumsf2+acumsf3;
        
        //Mandamos mensaje a terminal para dar a conocer el total de votos por cada municipio
        System.out.println("\nTotal de personas votantes de jilotepec = " +totalJilo );
        System.out.println("\nTotal de personas votantes de Chapa de Mota = " + totalChapa );
        System.out.println("\nTotal de personas votantes de San Francisco = " + totalSf );
        
        
        //Jilotepec
        //Mandamos mensaje a terminal para dar a conocer el % de votos del municipio de JILOTEPEC
        rosaJ=acumj1*100/totalJilo;
        System.out.println("\nPorcentaje del partido rosa de Jilotepec es de un = " + rosaJ+"%");
        moradoJ=acumj2*100/totalJilo;
        System.out.println("\nPorcentaje del partido morado de Jilotepec es de un = " + moradoJ+"%");
        cafeJ=acumj3*100/totalJilo;
        System.out.println("\nPorcentaje del partido cafe de Jilotepec es de un = " + cafeJ+"%");
        
        //Creamos de nuevo CONDICIONALES ANIDADOS para hacer las comparaciones y dar a conocer los resultados 
        //de las elecciones (Que partido gano,si hubo empate oh bien un empate entre los tres)
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
        }//Fin de los CONDICIONALES ANIDADOS para hacer las comparaciones y dar a conocer los resultados 
        //de las elecciones (Que partido gano,si hubo empate oh bien un empate entre los tres
        
        
        //Mandamos mensaje a terminal para dar a conocer el % de votos del municipio de CHAPA DE MOTA
        //Chapa de Mota
        rosaCh=acumch1*100/totalChapa;
        System.out.println("\nPorcentaje del partido rosa de Chapa de Mota es de un = " + rosaCh+"&");
        moradoCh=acumch2*100/totalChapa;
        System.out.println("\nPorcentaje del partido morado de Chape de Mota es de un = " + moradoCh+"&");
        cafeCh=acumch3*100/totalChapa;
        System.out.println("\nPorcentaje del partido cafe de Chapa de Mota es de un = " + cafeCh+"&");
        
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
        }//Fin de los CONDICIONALES ANIDADOS para hacer las comparaciones y dar a conocer los resultados 
        //de las elecciones (Que partido gano,si hubo empate oh bien un empate entre los tres
        
        
        //San Francisco
       //Mandamos mensaje a terminal para dar a conocer el % de votos del municipio de San Francisco
        rosaSf=acumsf1*100/totalSf;
        System.out.println("\nPorcentaje del partido rosa de San Francisco es de un = " + rosaSf+"&");
        moradoSf=acumsf2*100/totalSf;
        System.out.println("\nPorcentaje del partido morado de San Francisco es de un = " + moradoSf+"&");
        cafeSf=acumsf3*100/totalSf;
        System.out.println("\nPorcentaje del partido cafe de San Francisco es de un = " + cafeSf+"&");
        
        //Creamos de nuevo CONDICIONALES ANIDADOS para hacer las comparaciones y dar a conocer los resultados 
        //de las elecciones (Que partido gano,si hubo empate oh bien un empate entre los tres)
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
        }//Fin de los CONDICIONALES ANIDADOS para hacer las comparaciones y dar a conocer los resultados 
        //de las elecciones (Que partido gano,si hubo empate oh bien un empate entre los tres
    }//Fin Metodo Principal
}//Fin clase publica