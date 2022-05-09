#include <string.h>
#include <random>
#include <iostream>

using namespace std;

int fibsfill(int a[], int size);
int fibs(int a);

int main(){
    int fibs[15];
    int length = sizeof(fibs)/sizeof(fibs[0]);
    fibsfill(fibs, length);
    for(int i=0; i< length;i++){
        cout << "Index " << i << ": " << fibs[i] << endl;
    }
    return 0;
}
int fibsfill(int a[], int size){
    for( int i = 0; i < size; i++){
        a[i] = fibs(i);
    }
    return 0;
}
int fibs(int a){
    if(a== 0) return 0;
    else if (a == 1) return 1;
    else if (a== 2) return 1;
    else return fibs(a-2) + fibs(a-1);
}