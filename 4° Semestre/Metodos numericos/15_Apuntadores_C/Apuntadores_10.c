#include <stdio.h>
#include <stdlib.h>

int main(){
	int *x;
	int *z;
    
    printf("Inserta el valor de z: \n");
    scanf("%i", &z);
    
    printf ("La direccion de x es: %p\n", &x);
    printf ("El valor de z es: %i\n", z);
    printf ("La direccion de z es: %p\n", &z);
    printf ("El valor de x es: %i\n", x);
    printf ("El valor de x es: %i\n",&x);
    
    
    
	return 0;
}
