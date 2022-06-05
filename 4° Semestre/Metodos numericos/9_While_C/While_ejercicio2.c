//Imprimir todos los numeros divisibles entres 3 mayores a 0 y menores a 1000

#include <stdio.h>
#include <stdlib.h>

int main(){
 int x=1;

	printf("Numeros divicibles entre 3 \n");
	while(x <=1000){
		if (x %3==0){
			
		    printf("%d ", x);
		}
    	x++;
	}

system("pause");
return 0; 
} 
