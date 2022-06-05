
#include <stdio.h>
#include <stdlib.h>

int main (){
	int A [10]; 
	int B [10];
	int contador=0;
	while(contador < 10){
		scanf("%d", & A[contador]);
		contador++;
	}
	contador=0;
	while(contador < 10){
		scanf("%d", & B[contador]);
		contador++;
	}
	printf("%d\n", A[3]%(B[2]/2));
	printf("%d\n", B[A[1]] - A[9]);
	printf("%d\n", A[0] + A[1+2]);
	printf("%d\n", A[5] + B[5]);
	printf("%d\n", (A[3]/B[2])/2);
	
	system("Pause");
	return 0;
}

