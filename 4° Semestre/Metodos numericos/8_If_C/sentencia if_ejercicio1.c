#include <stdio.h>
#include <stdlib.h>

int main (){
	
	int calif ;
	puts ("Ingresa una calificacion");
	scanf ("%d", &calif);
	if (calif>5){
		puts("La calificacion es aprobatoria felicidades");
	}else{
		puts ("La calificacion es reprobatoria por menso");
	}
	
	
	system("Pause");
	return 0;
}
