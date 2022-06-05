#include <stdio.h>
#include <stdlib.h>

int  main(){
	int palabra, pala, i, res;
	char pali[10]="";
	char pali2[10];
	
	printf("Escribe una palabra\n");
	scanf("%s", &pali);
	palabra=strlen(pali);
	pala=palabra;
	
	for(i=0;i<palabra;i++){
		pali2[i]=pali[pala-1];
		pala--;
	}
	res=strcmp(pali,pali2);
	if(res==0){
		puts("La palabra es palindorma");
	}else{
	    puts("La palabra no es palindorma");

	}
	
	
	system("pause");
	return 0;
}
