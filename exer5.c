#include<stdio.h>
#include<stdlib.h>
#include <math.h>
#include<time.h>

int main(){
    int n;
    float menor_distancia = 999999;

    scanf("%d", &n);

    float *x = malloc(n * sizeof(float));
    float *y = malloc(n * sizeof(float));
    float *z = malloc(n * sizeof(float));

    for(int i=0; i<n; i++){
        scanf("%f %f %f", &x[i], &y[i], &z[i]);
    }

    clock_t start = clock();

    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){

            float dx = x[j] - x[i];
            float dy = y[j] - y[i];
            float dz = z[j] - z[i];

            float distancia = sqrt(dx*dx + dy*dy + dz*dz);
            if(distancia < menor_distancia){
                menor_distancia=distancia;
            } 
        }
    }

    clock_t end = clock();

    printf("menor distancia: %f\n", menor_distancia);
    
    float seconds = (float)(end-start) / CLOCKS_PER_SEC;
    
    printf("Tempo: %f segundos\n", seconds);

    free(x);
    free(y);
    free(z);

     return 0;
}