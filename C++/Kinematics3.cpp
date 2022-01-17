#include <iostream>
#include <string>

using namespace std;

int main(){
    float s; //Initial Speed
    float t; //Elapsed Time
    float d; //Deceleration
    cout << "Please insert the initial speed in miles per hour of the vechile: ";
    cin >> s;
    cout << "Please insert the elapsed time seconds of the total distance traveled: ";
    cin >> t;
    cout << "Please insert the deceleration of the vechile in miles per second per second: ";
    cin >> d;
    float dist = (s*t/3600) - (0.5*d*t*t);
    cout << "The total distance travelled is " << dist << endl;
}