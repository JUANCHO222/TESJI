#include <stdio.h>
#include <stdlib.h>

int main(){
	int w=9;
	int x=3;
	int y=7;
	int z=-2;
	 

	printf("%i\n",x>y && w<z);

	printf("%i\n",x>=w^ z==y);
	
	printf("%i\n",y<=x||x!=w);
	printf("%i\n",w==9^ x==3);
	
	printf("%i\n",y>z && z<x);
	printf("%i\n", w!=9);
	
	
	system("Pause");
	return 0;
}
