#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main (){     
	
    //strlen-->stringlen
    int len;
    char cad[]="Es una cadena";
    //Aqui se copea el texto de la cadena y se evalua la cantidad de caracteres
    len = strlen(cad);
    //aqui se imorime la cadena y la cantidad de esta
    printf("La longitud de:\'%s'\ es: %d\n", cad, len);

	system ("Pause");
	return 0;
}
