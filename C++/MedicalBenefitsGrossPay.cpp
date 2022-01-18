#include <iostream>
#include <string>
#include <math.h>

using namespace std;

int main(){
    float employee1_rate;
    float employee1_hours;
    float employee2_rate;
    float employee2_hours;
    float income_tax_rate = 0.20;
    float medical_rate = 0.02;

    cout << "Please insert the pay rate of the first employee: ";
    cin >> employee1_rate;
    cout << "Please insert the number of hours which the employee has worked:";
    cin >> employee1_hours;
    cout << "Please insert the second employee's pay rate: ";
    cin >> employee2_rate;
    cout << "Please insert the second employee's hours: ";
    cin >> employee2_hours;
    cout << "The first employee's pay stub will have the following." << endl;
    float wage1 = employee1_rate*employee1_hours;
    float wage2 = employee2_rate*employee2_hours;
    float med_deduction1 = ceil(wage1*.02*100.0)/100.0;
    float med_deduction2 = ceil(wage2*.02*100.0)/100.0;
    cout << "The following amount will be deducted for medical insurance for employee 1: " << med_deduction1 << endl;
    cout << "The following amount will be deducted for medical insurance for employee 2: " << med_deduction2 << endl;
    float income_tax_1 = ceil(wage1*.98*.20*100.0)/100.0;
    float income_tax_2 = ceil(wage2*.98*.20*100.0)/100.0;
    cout <<"The following amount will be deducted for income tax purposes for employee 1: "<< income_tax_1 << endl;
    cout << "Employee's one gross pay will be: " << wage1 <<".\nTheir net_pay will be : " << ceil(wage1 * .98 *.80 *100.0)/100.0<< endl;
    cout <<"The following amount will be deducted for income tax purposes for employee 2: "<< income_tax_2 << endl;
    cout << "Employee's two gross pay will be: " << wage2 <<".\nTheir net_pay will be : " << ceil(wage2 * .98 *.80 *100.0)/100.0<< endl;
}