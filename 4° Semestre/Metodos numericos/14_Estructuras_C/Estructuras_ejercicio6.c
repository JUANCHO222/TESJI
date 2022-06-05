#include <stdio.h>
#include <stdlib.h>

struct fraccion{
	float a,b,c,d;
};
int main (){
	struct fraccion shuly;
	printf("ingresa un valor\n");
	scanf("%f", & shuly.a);
	printf("ingresa un valor\n");
	scanf("%f", & shuly.b);
	printf("ingresa un valor\n");
	scanf("%f", & shuly.c);
	printf("ingresa un valor\n");
	scanf("%f", & shuly.d);
	suma(shuly);
	resta(shuly);
	division(shuly);
	system("Pause");
	return 0;
}
int suma(struct fraccion h){
	float gip;
	gip=(h.d*h.a)+(h.b*h.c)/(h.b*h.d);
	printf("El resultado es: %f\n", gip);
	return 0;
}
int resta(struct fraccion h){
	float gap;
	gap=(h.d*h.a)-(h.b*h.c)/(h.b*h.d);
	printf("El resultado es: %f\n", gap);
	return 0;
}
int division(struct fraccion h){
	float got;
	got=(h.d*h.a)/(h.b*h.c);
	printf("El resultado es: %f\n", got);
	return 0;
}

