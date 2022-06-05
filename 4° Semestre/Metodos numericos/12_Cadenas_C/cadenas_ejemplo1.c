#include <stdio.h>
#include <stdlib.h>

int main(){
	
	char cad[10];
	printf ("Introduce una palabra \n");
	scanf ("%s", cad);
	//leer una cadena con espacios ------> gets (cad);
	printf ("\n %s", cad);
	
	system ("Pause");
	return 0;
}
