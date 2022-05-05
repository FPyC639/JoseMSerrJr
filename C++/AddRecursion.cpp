#include <iostream>
#include <vector>

using namespace std;

int AddNumbers(vector<int> a);

int main(){

    vector<int> a = {1,2,3,4};
    cout << AddNumbers(a) << endl;

}

int AddNumbers(vector<int> a){
    if (a.empty()){
        return 0;
    }
    else{
        int b = a.back();
        a.pop_back();
        return b + AddNumbers(a);
    }

}