#include <stdio.h>
#include <stdlib.h>

int maximo(int n1, int n2);

int main(){

    int mayor,n1,n2;
    //aqui traemos lo de la funcion
    mayor = maximo(n1, n2);
    printf("el numero mayor es: %d\n", mayor);
return 0;
}

int maximo(int n1, int n2){
	int mayor;
	puts("introduce el numero 1: ");
	scanf("%d",&n1);
	puts("introduce el numero 2: ");
	scanf("%d",&n2);
	
	if(n1 > n2){
	mayor = n1;
	}else{
		mayor = n2;
	}
	
	return mayor;
}
