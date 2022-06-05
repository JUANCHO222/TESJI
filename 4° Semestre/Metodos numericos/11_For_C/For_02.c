#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int z;
	int i;
	int j;
	
	puts ("Introduce el valor de Z: ");
	scanf("%d", &z);
	
	
	
	for ( i = 1;i <= z; i++){
	   printf("\n");
	   for(j = 1; j <= i; j++){
	   	printf("*");
	   }
	   printf("\n");
	}
	
		for ( i = z;i <= 1; i--){
	   printf("\n");
	   for(j = 1; j <= i; j++){
	   	printf("*");
	   }
	   printf("\n");
	}
	
	
	
	return 0;
}
   
