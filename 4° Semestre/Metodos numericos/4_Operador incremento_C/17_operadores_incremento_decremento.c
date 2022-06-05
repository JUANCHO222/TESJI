#include <stdio.h>
#include <stdlib.h>

int main (){
    int c = 5;
    
    printf ("c : %d\n", c);        //c = 5
    printf ("c++ : %d\n", c++);    //Imprime 5 luego incrementa
    printf ("c : %d\n", c);        //c = 6
    
    int d = 10;
    
    printf ("d : %d\n", d);       //d = 10
    printf ("d : %d\n", --d);     //d = 9 Decrementa y luego inprime
    printf ("d : %d\n", d);       //d = 9

    system ("Pause");
    return 0;
}
