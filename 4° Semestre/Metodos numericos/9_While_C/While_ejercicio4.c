//Escribir todos los enteros positivos menores que 100 omitiendo aquellos que son divisibles por 7

#include <stdio.h>
#include <stdlib.h>

int main(){
int x=1;
	
	puts("Cadena de numeros de 1 a 100 omitiendo los numeros divisibles por 7");
		while(x <=100){
		if (x%7!=0){
		    printf("%d ", x);
		}	
    	x++;
	}

system("pause");
return 0; 
} 
