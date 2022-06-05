#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct empleado{
	char nombre[30];
	char sexo[20];
	int	sueldo;
};
int main(void)
{
	char no[30];
	char sex[20];
	int sue,obli=1;
	struct empleado mmo [5];
	int cont,cont2;
	for(cont=0;cont<5;cont++){
		printf("Ingresa tu nombre\n");
		scanf("%s", & mmo[cont].nombre);
		printf("Ingrese su sexo\n");
		scanf("%s", & mmo[cont].sexo);
		printf("Ingresa tu sueldo\n");
		scanf("%d", & mmo[cont].sueldo);
	}
	for(cont2=0;cont2<5;cont2++){
		for(cont=obli;cont<5;cont++){
			if(mmo[cont2].sueldo>mmo[cont].sueldo){
				sue=mmo[cont].sueldo;
				strcpy(no,mmo[cont].nombre);
				strcpy(sex,mmo[cont].sexo);
				
				mmo[cont].sueldo=mmo[cont2].sueldo;
				strcpy(mmo[cont].nombre,mmo[cont2].nombre);
				strcpy(mmo[cont].sexo,mmo[cont2].sexo);
				
				mmo[cont2].sueldo=sue;
				strcpy(mmo[cont2].nombre,no);
				strcpy(mmo[cont2].sexo,sex);
			}
		}
		obli++;
	}
	printf("%s\n%s\n%d\n",mmo[0].nombre,mmo[0].sexo,mmo[0].sueldo);
	system("Pause");
	return 0;
}
