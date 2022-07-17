#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(void)
{

char i, n;
char *buffer, *p_buffer;

printf("Teclea una palabra: \n");
scanf ("%s", &n);

buffer = (char*) malloc((n)* sizeof(char));
if(buffer==NULL) exit (1);

p_buffer = buffer;
for (i=0;i<n; i++){
printf("Ingresa el valor de %d\n", i);
scanf("%d", p_buffer++);
 }
 
 p_buffer = buffer;
 printf("\nLos valores son\n");
 for(n=0; n<i; n++){
     printf ("arreglo[%d] = %d \n", n, *p_buffer++);
 }
 
 free(buffer);
 system("Pause");
}
