#include <stdio.h>
#include <stdlib.h>

int main(){
	int suma = 5 + 2; // suma = 7
	printf("%d\n", suma);
    int resta = suma - 3; // resta = 4
    printf("%d\n", resta);
    int mult = suma * resta; // mult = 28
    printf("%d\n", mult);
    int iDiv = 20 / 8; // iDiv = 2;
    printf("%d\n", iDiv);
    int mod = 20 % 8; // mod = 4;
    printf("%d\n", mod);
    int a = 2;
    printf("%d\n", a);
    ++a; // a = 3;
    a++; // a = 4;
    int b = a++; // b = 4, a = 5;
    printf("%d\n", b);
    int c = ++b; // c = 5, b = 5
    printf("%d\n", c);
	system("Pause");
	return 0;
}
