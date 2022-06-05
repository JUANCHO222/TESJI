#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){
	int len;
	char origen[]="origen";
	char destino[7];
	//strcpy ----> copiar una cadena de caracteres o arreglo de caracteres a otro
	strcpy(destino, origen);
	printf("destino: %s", destino);
	
	return 0;
	system("Pause");
}
