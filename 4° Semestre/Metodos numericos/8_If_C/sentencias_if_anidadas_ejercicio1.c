/*
Realiza un programa, que te diga si persona es sujeto a un crédito hipotecario.
Las condiciones que debe de cumplir son:
°Tener mínimo 5 años de antigüedad en el trabajo.
°El 10% de su sueldo mensual debe ser mayor a 1,000 pesos
*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int numAnos, sueldo;
	printf ("ingrese sus anos en el trabajo\n");
	scanf ("%i", &numAnos);
	printf ("Ahora usted ingrese su sueldo\n");
	scanf ("%i",&sueldo);
	int numTotal=(sueldo*100)/10;
	
	if (numAnos>=5){
		if (sueldo>=1000)
		printf ("Usted esta postulado a un credito y la cantidad que usted recibe es de:%i\n ",numTotal );
	}
	
	
	if (numAnos<5){
		if (sueldo<1000)
		printf ("usted no esta postulado para un credito hipotecario y su sueldo es de: %i\n", numTotal);
		
	}
	
	system("Pause");
	return 0;
}
