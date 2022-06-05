#include <stdio.h>
#include <stdlib.h>

double promedio(double a, double b);

int main(){
	float a = 5, b=10, prom;
	prom = promedio(a,b);
	printf("El promedio es: %f \n", prom);
	return 0;
}

double promedio(double a, double b){
	float prom;
	a=a+3;
	b=b+3;
	prom=(a+b)/2;
	
	return prom;
}
