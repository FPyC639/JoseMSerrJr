#include <iostream>
#include <string>
#include <math.h>

using namespace std;

int main(){
    float p; //Principle amount
    float t; //Time in months
    float rate; //Rate of compounded interest
    float n; //number of times the interest is compounded
    cout << "Please insert the principle amount that is being deposited into the account: ";
    cin >> p;
    cout << "Please insert the time in months which the interest has undergone: ";
    cin >> t;
    cout << "Please insert the rate of the interest: ";
    cin >> rate;
    cout << "Please insert the number of times the insert is being compouned: ";
    cin >> n;
    float amount = p*powf((1+(rate/n)),(n*t));
    cout << "The amount of interest as of December 31, 2012 is " << amount << endl;
    return 0;
}