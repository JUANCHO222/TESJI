#include <stdio.h>
#include <stdlib.h>

struct CD{
	char titulo[100];
	char artista[50];
	int	canciones;
	int anio;
	int precio;
};
int main(void)
{
	struct CD cd1;
	printf("Ingresa el titulo del album\n");
	gets(cd1.titulo);
	printf("Ingresa el artista\n");
	gets(cd1.artista);
	printf("Ingresa el numero de tracks\n");
	scanf("%d", & cd1.canciones);
	printf("Ingresa el anio de la cancion\n");
	scanf("%d", & cd1.anio);
	printf("Ingresa el precio\n");
	scanf("%d", & cd1.precio);
	printf("%s\n%s\n%d\n%d\n%d\n",cd1.titulo,cd1.artista,cd1.canciones,cd1.anio,cd1.precio);
	system("Pause");
	return 0;
}
