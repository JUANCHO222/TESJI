#include <stdio.h>
#include <stdlib.h>

int main (){
	int contador = 0, x [20], multi = 1;
	double suma=0;
	while(contador <= 20){
		printf("Ingresa un numero\n");
		scanf("%d", & x[contador]);
		contador++;
	}
	contador=0;
	while(contador <= 20){
		suma=suma + x[contador];
		contador++;
	}
	printf("%f\n", suma/20);
	contador =0;
	while(contador <= 20){
		multi=multi * x[contador];
		contador++;
	}
	printf("%d\n", multi);
	system("Pause");
	return 0;
}

