#include <stdio.h>
#include <stdlib.h>

int suma (int a, int b);

float promedio(int a, int b, int c);

int main (){
	int x, w, z;
	printf("Ingresa un numero\n");
	scanf("%d", &x);
	printf("Ingresa un numero\n");
	scanf("%d", &w);
	printf("Ingresa un numero\n");
	scanf("%d", &z);
	printf("La suma de x y w es: %d\n", suma(x,w));
	printf("El promedio de z es: %f\n", promedio(x,w,z));
	system("Pause");
	return 0;
}
int suma (int a, int b){
	int c;
	c=a+b;
	return c;
}
float promedio (int a, int b, int c){
	float sum = a + b + c;
	float prom = sum/3;
	return prom;
}

