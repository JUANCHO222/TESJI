#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int i;
	int j;
	puts("ingresa el numero que quieres contar: ");
	scanf("%i",&j);
	//quitar el menos en caso de decrementar
	// en este caso lo que se hace en ciclo es que primero se iguala a la variable de entrada, mientras que la condicion se le pone >= dependiendo el caos, y en el ultimo es un decremento.
	//Decremento
	for (i = j;i>=1;i--){
		printf("%i\n", i);	
   }
   //Incremento
   	for (i = 1;i<=j;i++){
		printf("%i\n", i);	
   }
   
	/*
		for (i = 1;i<=10;i++){
		printf("2 * %d = %d \n",x,2*x);
		} 
	*/
	
	/*
	int x = 1;
	int materias;
	int calificacion;
	int promedio=0;
	int i = 0;
	
	printf("cuantas calificaciones deseas ingresar???\n");
	scanf("%i", &materias);
    printf("Promedio General\n");
		
		for (i = 1;i<=materias;i++){
		printf("Ingresa la materia numero: %d\n",x);
		scanf("%d", &calificacion);
		promedio+=calificacion;
		x++;
		} 
    printf("La sumatoria de calificaciones es %i\n", promedio);
    printf("El promedio de calificaciones es :%i puntos\n", promedio/materias);
	*/
	
	system("pause");
	return 0;
}
