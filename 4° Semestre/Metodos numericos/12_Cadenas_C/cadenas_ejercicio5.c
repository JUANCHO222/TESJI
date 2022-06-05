#include<stdio.h>
#include<string.h>
#include <stdlib.h>

int main(){
	char cad[100];
	int x;
	int w=0;
	int v=1;
	int b=1;
	int cont;
	int cont2;
	
	puts("Ingrese una palabra");
	scanf("%s", cad);
	x=strlen(cad);
	
	for(cont=0;cont<x;cont++){
		for(cont2=0;cont2<=x;cont2++){
			if(cad[cont]==cad[cont2]){
				w++;
			}
		}
		while(v<=cont){
		 if(cad[cont]==cad[v-1]){
		 	b++;
		 }
		 v++;
		}
		if(b==1){
			printf("%c->%d\n", cad[cont],w);
				
			
		}
		w=0;
		v=1;
		b=1;
	}
	
	
	return 0;
}
