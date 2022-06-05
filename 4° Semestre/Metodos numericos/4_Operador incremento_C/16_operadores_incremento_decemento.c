#include <stdio.h>
#include <stdlib.h>

int main (){
	int var = 1;
    int con = 1;
    // Es equivalente a var = var+1;
    printf ("%d\n",var++);
    printf ("%d\n",var);
    // Es equivalente a con = con-1;
    printf ("%d\n",con--);
    printf ("%d\n",con);
	
	system("Pause");
	return 0;
}
