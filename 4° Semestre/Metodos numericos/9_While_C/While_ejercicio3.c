//Imprimir todos los numeros divisibles entre 2 y 7 mayores a 0 y menores a 1000

#include <stdio.h>
#include <stdlib.h>

int main(){
int x=1;
	
	printf("Numeros divicibles entre 2 Y 7 \n");
	

		while(x <=1000){
		if (x%2==0 && x%7==0){
			
		    printf("%d ", x);
		}	
    	x++;
	}

system("pause");
return 0; 
} 
