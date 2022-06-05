#include <stdio.h>
#include <stdlib.h>

struct empleado{
	char nombre[50];
	char sexo[50];
	int	sueldo;
};
int main(void)
{
	struct empleado mmo;
	printf("Ingresa su nombre\n");
	gets(mmo.nombre);
	printf("Ingresa su sexo\n");
	gets(mmo.sexo);
	printf("Ingresa tu sueldo\n");
	scanf("%d", & mmo.sueldo);
	
	printf("%s\n%s\n%d\n",mmo.nombre,mmo.sexo,mmo.sueldo);
	system("Pause");
	return 0;
}
