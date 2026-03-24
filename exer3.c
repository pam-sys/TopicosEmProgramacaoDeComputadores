#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int e_primo(int num) {
    if (num <= 1) return 0;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return 0;
    }
    return 1;
}

int main(){
    int n, count=0;

    scanf("%d", &n);

    int *array = malloc(sizeof(int)*n);

    for(int i=0; i<n; i++){
        scanf("%d", &array[i]);
    }

    clock_t start = clock();

    for(int i=0;  i<n; i++){
        if(e_primo(array[i])){
            count++;
        }
    }
    
    printf("\nNumero de primos: %d\n", count);
    
    clock_t end = clock();
    float seconds = (float)(end-start) / CLOCKS_PER_SEC;
    
    printf("Tempo: %f segundos\n", seconds);
    
    free(array);
    
    return 0;
}