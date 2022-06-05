#include <stdio.h>
#include <stdlib.h>

struct atomo{
	int hidrogeno;
	int oxigeno;
	char nombre[15];
};
int main (){
	struct atomo agua[4];
	agua[0].hidrogeno=2;
	agua[0].oxigeno=1;
	gets(agua[0].nombre);
	printf("%s", agua[0].nombre);
	system("Pause");
	return 0;
}
