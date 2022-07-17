#include <stdio.h>
#include <stdlib.h>

int main (){
	int i,n;
	char *A, *t;
	printf("Indica la palabra\n");
	scanf ("%d", &n);
	A=(char *)malloc(n*sizeof(int));
	if(A==NULL)exit(1);	
	for(t=A,i=0; i<n; i++,t++){
		printf("Dame la palabra [%d] :", i);
		scanf("%s", t);
	}
	printf("mensaje \n");
	for( t = &A [n-1],i = 0; i < n; i++, t--){
		printf("%c \n", *t);
	}
			
	free(A);
	system ("Pause");
}
