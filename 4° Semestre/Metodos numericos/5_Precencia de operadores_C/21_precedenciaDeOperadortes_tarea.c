#include <stdio.h>
#include <stdlib.h>

int main (){
	
    float num1 = 1, num2 = 3, num3 = 1, num4 = 23, r;
    r = ((num1/3) + (num2/5) + (num3/30)/(num4/30));
	printf ("%f\n", r);
	
    float n1 = 2, n2 = 1, n3 = 2,n4 = 1,n5 = 1, n6 = 2, n7=5, r1;
    r1 = (n7+(n6/(n5/(n4+((n3) / (n1 - (n2/4)))))));
	printf("%f\n",r1);
	
	system("Pause");
	return 0;
}

