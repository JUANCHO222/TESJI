#include <stdio.h>
#include <stdlib.h>

int main (){
	int con1, con2, m, n;
	printf("Ingresa un dato\n");
	scanf("%d", & m);
	scanf("%d", & n);
	printf("\n\t");
	for(con1=1;con1<=n;con1++){
		printf("%d\t", con1);
	}
	printf("\n");
	for(con1=1;con1<=m;con1++){
		printf("%d\t", con1);
		for(con2=1;con2<=n;con2++){
			printf("%d\t", con1*con2);		
		}
		printf("\n");
	}
	system("Pause");
	return 0;
}
