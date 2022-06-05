#include <stdio.h>
#include <stdlib.h>

int main (){
	int conta1, contador2;
	int A, fila3;
	printf("Ingra un valor\n");
	scanf("%d", & A);
	printf("A\tA+2\tA+4\tA+6\n");
	for(conta1=1;conta1<5;conta1++){
		fila3=A *conta1;
		for(contador2=0;contador2<8;contador2+=2){
			printf("%d\t", fila3+contador2);
		}
		printf("\n");
	}
	
	system("Pause");
	return 0;
}
