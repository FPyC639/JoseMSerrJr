#include <iostream>
#include <string.h>

using namespace std;

int main(){
    float half_dollars;
    float quarters;
    float dimes;
    float nickels;
    float pennies;

    cout << "Please input the number of half_dollars: ";
    cin >> half_dollars;
    cout << "Please input the number of quarters: ";
    cin >> quarters;
    cout << "Please input the number dimes: ";
    cin >> dimes;
    cout << "Please input the number of nickels: ";
    cin >> nickels;
    cout << "Please input the number of pennies: ";
    cin >> pennies;
    cout << "The number of dollars is " << half_dollars*0.50 + quarters *0.25 + dimes *0.10 +nickels * 0.05+pennies*0.01;

    return 0;
}