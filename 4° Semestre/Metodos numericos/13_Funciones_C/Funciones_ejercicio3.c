#include <stdio.h>
#include <stdlib.h>
#include <math.h>
float area(int x, int z, int w);

int main (){
	int a,b,c;
	printf("Ingresa el area 1\n");
	scanf("%d", & a);
	printf("Ingresa el area 2\n");
	scanf("%d", & b);
	printf("Ingresa el area 3\n");
	scanf("%d", & c);
	printf("%f\n", area(a,b,c));
	system("Pause");
	return 0;
}
float area(int x, int z, int w){
	float cont=0, tes;
	cont = (x+z+w)/2;
	tes=sqrt (cont*(cont-x)*(cont-z)*(cont-w));
	return tes;
}
