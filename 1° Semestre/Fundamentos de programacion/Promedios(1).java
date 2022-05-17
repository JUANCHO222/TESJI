import javax.swing.JOptionPane;//importamos el paquete JOptionPane

public class Promedios {//primera clase
    public static void main(String[] args) {//Generamos el metodo principal
        double a, b=9.8;
       System.out.println("Programa con metodo que calcula promedio");//Esta linea funciona para generar o imprimir un texto(mensaje) en este caso un titulo
       //crear un objeto sintaxis
       //clasequecontieneAlmetodoaLLamar nombredelobjeto = new constructorclase();
       //es un metodo especial que tiene el mismo nombre de la clase 
       //cuando no se escribe el constructor se genera de manera automatica
       Segunda obj = new Segunda();//objeto
       System.out.print(obj.capturarCalificaciones());//llamando al metodo listaMaterias
       //a=b+obj.capturarCalificaciones();
       //System.out.print(a);
    } 
}


 class Segunda{//Se genera la segunda clase amigable
    private void listaMaterias(){//En este caso no se crea un objeto para llamar un metodo en la misma clase (Desde la linea 28 asta la linea 55) 
        String materias [] = {"1.Programación", "2.Mte Discretas", "3.Calculo Dif"};//Este arreglo nos permitira crear la lista de amterias
        byte x;//Aquí se crea una variable byte para el for
        for(x=0;x<3;x++){//Esta ciclo for nos dice los limites (inicia de 0 y termina en menor que 3
            System.out.println(materias[x]);//Aquí mandamos a imprimir el arreglo llamado materias
        }
    }
    
    public double capturarCalificaciones(){//En este caso no se crea un objeto para llamar un metodo en la misma clase (Desde la linea 28 asta la linea 55) 
        byte selecMat,p=3,md=4,cd=5,x,tam=0;//Se crean variables para definir y guardar el valor de nuestros datos
        float calif[];//declaramos del arreglo
        double acum=0, prom;//En esta se declara un arreglo unidimensional de tipo float
        //Cuando un metodo se encuentra hacer una llamada a un metodo que se encuntra en una misma clase
        //No es necesario generar un obejto
        listaMaterias();//llamando al metodo materias
       selecMat=Byte.parseByte(JOptionPane.showInputDialog("Escribe el numero de la materia"));//Esta linea generara un mensaje al usuario
       if(selecMat==1){//Declaramos una condicional
           tam=p;//si presionan uno el tamaño sera igual al valor de dicha variable
       }else if(selecMat==2){//Esta linea es una condicional 
           tam=md;//si presionan uno el tamaño sera igual al valor de dicha variable
       }else if(selecMat==3){//Esta linea es una condicional 
           tam=cd;//almacena lo que tiene la variable en caso de selecionar 1,2 o 3
       }else{
           System.out.println("Opcion invalida");//mensaje si se usa una opcion invalida
       }
       calif = new float [tam];//creamos el tamaño del arreglo, dependera mucho de la selección 
       
       for(x=0;x<tam;x++){//Se crea un ciclo for que iniciaria desde 0 y sera menor a tam
           calif[x]=Float.parseFloat(JOptionPane.showInputDialog("Calificación de la unidad"+(x+1)));//Esta linea es un mensaje que aparecera al final de ejecutar el codigo
           acum=acum+calif[x];//es igual a escribir acum=calif[x];
       }
       prom=acum/tam;//Esta variable esta dividiendo el acumulador 
        return prom;//Aquí se pone Return para correguir el metodo que no se le agrego void el cual se ubica en la linea 28
       
    }
}
