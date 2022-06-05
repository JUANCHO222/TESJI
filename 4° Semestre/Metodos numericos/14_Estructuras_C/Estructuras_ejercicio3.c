#include <stdio.h>
#include <stdlib.h>
struct deportista{
	char deporte[18];
	char nombre[30];
	char pais[20];
	int	medallas;
};
int main(void)
{
	struct deportista obj;
	printf("Ingresa el deporte\n");
	gets(obj.deporte);
		printf("Ingresa su nombre\n");
	gets(obj.nombre);
	printf("Ingresa su pais\n");
	gets(obj.pais);
	printf("Ingresa sus medallas\n");
	scanf("%d", & obj.medallas);
	
	printf("%s\n%s\n%s\n%d\n",obj.deporte,obj.nombre,obj.pais,obj.medallas);
	system("Pause");
	return 0;
}
