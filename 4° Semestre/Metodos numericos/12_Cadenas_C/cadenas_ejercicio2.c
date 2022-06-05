#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){
    char cadena1[10];
    char cadena2[10];
    char respaldo[10];

	
	printf ("Introduce una palabra \n");
	scanf ("%s", cadena1);
	printf ("Introduce una palabra \n");
	scanf ("%s", cadena2);
	
        puts ("Antes\n");
	    printf("cadena1: %s\n",cadena1 );
		printf("cadena2: %s\n", cadena2);
	
		
	    strcpy(respaldo, cadena1);
     	strcpy(cadena1, cadena2);
     	strcpy(cadena2, respaldo);
	   
		
	    puts ("Despues\n");
		printf("cadena1: %s\n", cadena1);
		printf("cadena2: %s\n", cadena2);
		
	return 0;
	system("Pause");
}
