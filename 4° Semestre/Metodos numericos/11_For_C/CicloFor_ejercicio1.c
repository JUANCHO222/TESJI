#include <stdio.h>
#include <stdlib.h>

int main (){
	int dato,contador,suma;
	printf("Ingresa un numero\n");
	scanf("%d", & dato);
	for(contador=1;contador<=dato;contador++){
		suma=suma + contador;
		printf("%d + ", contador);	
	}
	printf("= %d\n", suma);
	
	system("Pause");
	return 0;
}
