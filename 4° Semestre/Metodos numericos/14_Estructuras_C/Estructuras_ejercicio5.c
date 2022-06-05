#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct deportista{
	char deporte[30];
	char nombre[30];
	char pais[20];
	int	medallas;
};
int main(void)
{
	char no[30];
	char sex[30];
	char shue[20];
	int sue,obli=1;
	int cont,cont2;
	struct deportista mmo[10];
	for(cont2=0;cont2<10;cont2++){
		printf("Ingresa el deporte\n");
		scanf("%s", & mmo[cont2].deporte);
		printf("Ingresa su nombre\n");
		scanf("%s", & mmo[cont2].nombre);
		printf("Ingresa su pais\n");
		scanf("%s", & mmo[cont2].pais);
		printf("Ingresa sus medallas\n");
		scanf("%d", & mmo[cont2].medallas);
	}
	for(cont2=0;cont2<10;cont2++){
		for(cont=obli;cont<10;cont++){
			if(mmo[cont2].medallas>mmo[cont].medallas){
				sue=mmo[cont].medallas;
				strcpy(no,mmo[cont].nombre);
				strcpy(sex,mmo[cont].deporte);
				strcpy(shue,mmo[cont].pais);
				
				mmo[cont].medallas=mmo[cont2].medallas;
				strcpy(mmo[cont].nombre,mmo[cont2].nombre);
				strcpy(mmo[cont].deporte,mmo[cont2].deporte);
				strcpy(mmo[cont].pais,mmo[cont2].pais);				
				
				mmo[cont2].medallas=sue;
				strcpy(mmo[cont2].nombre,no);
				strcpy(mmo[cont2].pais,sex);
				strcpy(mmo[cont2].pais,shue);
			}
		}
		obli++;
	}
	printf("%s\n%s\n%s\n%d\n",mmo[9].deporte,mmo[9].nombre,mmo[9].pais,mmo[9].medallas);
	system("Pause");
	return 0;
}
