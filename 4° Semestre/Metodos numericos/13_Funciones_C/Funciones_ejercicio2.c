#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void *vali(char a [50]);
int main (){
	char carac [50];
	printf("Ingresa un caracter\n");
	scanf("%s", & carac);
	vali(carac);
	printf("\n");
	system("Pause");
	return 0;
}
void *vali(char a [50]){
	int c,d=0, cont;
	char volt[50];
	c=strlen(a);
	d=c;
	for (cont=0;cont<c;cont++){
	volt[cont]=a[d-1];
	d--;	
	}
	printf("%s", volt);
	return 0;
}

