#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int factorial(int f){
 if (f<1){
  return 1;
 }
 return f*factorial(f-1); 
}

int main (){
 int n;
 printf("Ingresa un numero: \n");
 scanf("%d", &n);
 printf("Factorial es: %d\n", factorial(n));
 system("Pause");
 return 0;
}
