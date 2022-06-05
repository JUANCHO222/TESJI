#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int HST=0; 
	int PH=0;
	float salario=0;
	puts ("Ingresa las horas trabajadas en la semana");
	scanf("%d", &HST);
	puts ("Ingresa el precio por hora");
	scanf("%d", &PH);
	
	if (HST<=40){
		salario = HST * PH;
	}else{
		salario = (PH*PH+(PH*1.5*(HST-PH)));
	}
	printf("El salario es de %f\n", salario);
	
	system ("Pause");
	return 0;
}
