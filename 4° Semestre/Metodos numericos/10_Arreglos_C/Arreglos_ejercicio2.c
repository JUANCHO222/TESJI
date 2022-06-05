#include <stdio.h>
#include <stdlib.h>

int main (){
	int contador = 0, x [100];
	while (contador<=100){
		x [contador] = 2*contador;
		printf("%d\n", x [contador]);
		contador++;
	}
	system("Pause");
	return 0;
}

