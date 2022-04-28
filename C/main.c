#include <stdio.h>
#include "addition.h"

int main(){

    int ID =  112244;
    int a  = ID/2;
    int b = ID%11;

    printf("My combo is %d", add(a,b));

    return 0;
}