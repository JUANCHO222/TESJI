#include <stdio.h>
#include <stdlib.h>

int main(){
int array[10] = {1,2,3,4,5,6,7,8,9,0};
int len=sizeof(array)/sizeof(int);
printf("Los bytrs del arreglo son: %d\n", sizeof(array));
printf("Los bytrs del arreglo son: %d\n", sizeof(int));
printf("Los bytrs del arreglo son: %d\n", len);
systen("pause");
return 0;
}