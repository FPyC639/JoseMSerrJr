#include <stdio.h>

int main(void){
    char s[15];
    char s1[15];
    char s2[15];
    char s3[15];
    printf("Hello! Your name is? ");
    scanf("%s%s%s%s",s,s1,s2,s3);
    printf("Hello %s %s %s %s. Nice to meet you!", s, s1, s2, s3);

    return 0;

}