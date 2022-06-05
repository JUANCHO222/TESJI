#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){
	char cad[10];
	char ch= '*';
	int len;
	int i;
	int j;

	
	printf ("Introduce una palabra \n");
	scanf ("%s", cad);
	len = strlen(cad);
    
	for (i=0; i<len;i++){
	for(j=0; j<len;j++){
		printf("%c", ch);
	}
	
	printf("\n");
}
	return 0;
	system("Pause");
}
