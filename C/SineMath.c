#include <stdio.h>
#include <math.h>

int main(){
    double numb;
    printf("Please insert a value between 0 and 1: ");
    scanf("%lf", &numb);
    printf("The sine of %lf is %lf", numb, sin(numb));
    
}