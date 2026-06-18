#include <stdio.h>
#include <stdio.h>
#include <time.h>

int mdc(int a, int b) {
    if (b == 0) {
        return a;
    }
    return mdc(b, a % b);
}
 
int mmc(int a, int b) {
    return (a * b) / mdc(a, b);
}

int main() {
    int num1, num2;
    
    printf("Digite dois numeros inteiros positivos: ");
    scanf("%d %d", &num1, &num2);
    
    if (num1 <= 0 || num2 <= 0) {
        printf("Os numeros devem ser positivos.\n");
        return 1;
    }
    
    clock_t start = clock();

    int resultado_mdc = mdc(num1, num2);
    int resultado_mmc = mmc(num1, num2);

    clock_t end = clock();
    float seconds = (float)(end - start) / CLOCKS_PER_SEC;

    printf("MDC de %d e %d é: %d\n", num1, num2, resultado_mdc);
    printf("MMC de %d e %d é: %d\n", num1, num2, resultado_mmc);

    printf("Tempo: %f segundos\n", seconds);
    
    return 0;
}