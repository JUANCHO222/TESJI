#include <stdio.h>
#include <stdlib.h>

int main (){
	int x;
	printf("Ingresa un numero: \n");
	scanf("%d", & x);
	printf("Factorial es: %d\n", factorial(x));
	system("Pause");
	return 0;
}
int factorial(int a){
	if (a<1){
		return 1;
	}
	return a*factorial(a-1);	
}

