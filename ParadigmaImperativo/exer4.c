#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    int n, count=0;

    scanf("%d", &n);

    int *array = malloc(sizeof(int)*n);

    for(int i=0; i<n; i++){
        scanf("%d", &array[i]);
    }

    clock_t start = clock();

    printf("\nOrdem inversa:");
    for(int i=n-1; i>=0; i--){
        printf("\n%d", array[i]);
    }
    
    clock_t end = clock();
    float seconds = (float)(end-start) / CLOCKS_PER_SEC;
    
    printf("\nTempo: %f segundos\n", seconds);
    
    free(array);
    
    return 0;
}