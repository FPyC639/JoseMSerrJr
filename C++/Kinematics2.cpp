#include <iostream>
#include <string.h>

using namespace std;

int main(){
    double time;
    double average_speed;
    

    cout << "Please insert the average speed in miles per hour: ";
    cin >> average_speed;
    cout << "Please insert the time elasped in seconds: ";
    cin >> time;
    double distance = time/60 * average_speed;
    cout << "The total distance traveled is: " << distance;

    return 0;
}