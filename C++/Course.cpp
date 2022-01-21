#include <iostream>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

class Course{
    private:
        string courseName;
        std::vector<string> students;
    public:
        Course(string courseName);
        string getCourseName();
        void addStudent(string student);
        void dropStudent(string student);
        vector<string> getStudents();
        int getNumberofStudents();
        void print();
};
Course::Course(string courseName){
    this->courseName = courseName;
}
string Course::getCourseName(){
    return courseName;
}
void Course::addStudent(string student){
    students.push_back(student);
}
void Course::dropStudent(string student){
    students.erase(std::remove(students.begin(), students.end(),student),students.end());
}
vector<string> Course::getStudents(){
    return students;
}
int Course::getNumberofStudents(){
    return students.size();
}
void Course::print(){
    for (int i = 0; i < students.size(); i++) {
        cout << students.at(i) << ' ';
    }
    cout << endl;
}
int main(){
    Course cps2232("Data Structures");
    cps2232.addStudent("Jose M. Serra Jr.");
    cps2232.addStudent("Yarelis Serra");
    cps2232.addStudent("Angel Serra");
    cout << "The course is: " << cps2232.getCourseName() << endl;
    cout << "The students in the course are: ";
    cps2232.print();
    cout << "The number of students are: " << cps2232.getNumberofStudents() << endl;
    cps2232.dropStudent("Angel Serra");
    cout << "Students have dropped the course the students in the course are ";
    cps2232.print();
    cout << "The number of students in the course are now: " << cps2232.getNumberofStudents() << endl;

    return 0;
}