#include <string.h>
#include <random>
#include <iostream>

using namespace std;

int onehundo(int a[], int size);

int main(){
    int grades[100];
    onehundo(grades, sizeof(grades)/sizeof(grades[0]));
    for(int i=0; i< 100;i++){
        cout << grades[i]<<endl;
    }

}

int onehundo(int a[], int size){
    for(int i=0; i< size;i++){
        a[i] = (float) rand()/RAND_MAX*50 + 50;
    }
    return 0;

}