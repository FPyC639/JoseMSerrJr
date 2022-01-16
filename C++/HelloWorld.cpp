#include <iostream>
#include <string.h>

using namespace std;

int main(){

    string yourname;
    string hello = "Hello ";
    cout << "Hello Your Name is" << endl;
    getline(cin, yourname);
    cout << hello.append(yourname) << endl;
    return 0;
}