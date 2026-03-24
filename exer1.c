#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main(){
    int n, count = 0;
    
    scanf("%d", &n);
    
    int *array = malloc(sizeof(int)*n);
    
    for(int i=0; i<n; i++){
        scanf("%d", array+i);
    }
    
    clock_t start = clock();
    
    for(int i=0;  i<n; i++){
        if(!(array[i] % 2)){
            count++;
            printf("%d ", array[i]);
        }
    }
    
    printf("\nNumero de pares: %d\n", count);
    
    clock_t end = clock();
    float seconds = (float)(end-start) / CLOCKS_PER_SEC;
    
    printf("Tempo: %f segundos\n", seconds);
    
    free(array);
    
    return 0;
}