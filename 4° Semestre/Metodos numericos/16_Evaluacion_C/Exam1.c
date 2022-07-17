#include <stdio.h>
#include <stdlib.h> 

float promedio(int valores[], int cantidad) {
    int i;
    float prom = 0.0;

    for (i = 0; i < cantidad; ++i)
        prom += valores[i];

    return prom / (float) cantidad;
}


int main() {

    int parcias[10];
    double nom[20];
    double option[3];
    int n, i;

    do {
        printf("Digita el numero de parciales De Metodos Numericos: \n%s ", nom);
        scanf("%d", &n);

        for (i = 0; i < n; ++i) {
            printf("Parcial %d: ", i + 1);
            scanf("%d", &parcias[i]);
        }

        printf("El promedio de %s es %.2f\n", nom, promedio(parcias, n));

    } while (option[0] == 's' || option[0] == 'S');

    return 0;
}
