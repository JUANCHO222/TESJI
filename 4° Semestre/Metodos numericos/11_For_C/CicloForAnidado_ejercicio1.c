#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int n;
	int i;
	int j;
	int r;
	int z;
	puts ("Ingrese un numero");
	scanf ("%i", &n);
for (i=1; i<=n;i++){
	for(j=0; j<i;j++){
		printf("*");
	}
	
	printf("\n");
}


	printf("\n");

for (r=n; r>=1;r--){
	for(z=0; z<r;z++){
		printf("*");
	}
	
	printf("\n");
}



	system("Pause");
	return 0;
}
