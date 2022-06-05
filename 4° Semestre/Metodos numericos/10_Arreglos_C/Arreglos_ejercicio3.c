#include <stdio.h>
#include <stdlib.h>

int main (){
	int numero [100];
	int total = 100;
	int aumento;
	
	
	do {
		numero[total]=0;
		printf ("Vector [%d] = %d \n",aumento, total);
		total--;
		aumento++;
	}while (total>0);

	
	printf ("Fin");
	system ("Pause");
}
