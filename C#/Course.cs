using System;
using System.Collections;

namespace ArrayListApplication;
class Course{
    private string coursename;
    ArrayList students = new ArrayList();

    public Course(string course){
        coursename = course;
    }
    
    public string getCourseName(){
        return coursename;
    }

    public void addStudent(string student){
        students.Add(student);
    }

    public void dropStudent(string student){
        students.Remove(student);
    }

    public ArrayList getStudents(){
        return students;
    }

    public int sizeOfStudents(){
        return students.Count;
    }

    public void printStudents(){
        foreach (Object obj in students){
            Console.WriteLine(obj);
        }
        return;
    }

    static void Main(string[] args){
        var cps2232 = new Course("CPS2232 Data Structures");
        cps2232.addStudent("Jose M. Serra Jr.");
        cps2232.addStudent("Yarelis M. Serra");
        cps2232.addStudent("Angel M. Serra");
        Console.WriteLine("The number of students are "+ cps2232.sizeOfStudents());
        Console.Write("The students in the class are: ");
        cps2232.printStudents();
        cps2232.dropStudent("Yarelis M. Serra");
        Console.WriteLine("The number of students are "+ cps2232.sizeOfStudents());
        Console.Write("The students in the class are: ");
        cps2232.printStudents();
    }


}