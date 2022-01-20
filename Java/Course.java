import java.util.*;

public class Course{

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public void addStudent(String student){
        this.students.add(student);
    }
    public void dropStudent(String student){
        this.students.remove(student);
    }
    public ArrayList<String> getStudents(){
        return this.students;
    }
    public int getNumberofStudents(){
        return this.students.size();
    }

    public static void main(String[] args){
        Course cps2232 = new Course("Data Structures");
        cps2232.addStudent("Jose M. Serra Jr.");
        cps2232.addStudent("Yarelis Serra");
        cps2232.addStudent("Angel Serra");
        System.out.println(cps2232.getCourseName());
        System.out.println(cps2232.getStudents());
        System.out.println(cps2232.getNumberofStudents());
        cps2232.dropStudent("Yarelis Serra");
        System.out.println(cps2232.getStudents());
        System.out.println(cps2232.getNumberofStudents());
    }
}