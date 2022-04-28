#include <stdio.h>
#include "Operations.h"

int main(){
    int a = 22;
    int b = 21;

    printf("The number %d plus the number %d is %d.\n",a,b,add(a,b));
    printf("The number %d times %d is %d.\n", a,b, mul(a,b));
    printf("The number %d divided %d is %d.\n", a, b, div(a,b));
    printf("The number %d remainder division %d is %d.\n",a, b, modulo(a,b));
    printf("The number %d subtracted by %d is %d.", a, b, subtract(a,b));
}