/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Jose M. Serra Jr., CPS-2232, 04
* Homework  1, task 1, 2, 3, ....
* Program Description:
*************************************************************************/
enum Color{
    WHITE, BROWN, BLACK, GRAY
}


public class Cat{

    private String name;
    private double age;
    private Color color;
    private String type;
    private static int NumberofCats = 0; 

    public Cat(){
        super();
        NumberofCats++;

    }
    public Cat(String name,int age,Color color,String type){
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
        NumberofCats++;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getAge(){
        return this.age;
    }

    public void setAge(double age){
        this.age = age;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int NOC(){
        return this.NumberofCats;
    }

    public String toString(){
        return "Cat[ name: " + this.name + ", age: " + this.age + ", color: "+ this.color + ", type: " + this.type+ "]";
    }

    public static void main(String[] args){

        var cat1 = new Cat();
        cat1.setName("Miah");
        cat1.setAge(.5);
        cat1.setColor(Color.GRAY);
        cat1.setType("domestic");
        System.out.println(cat1.NOC());
        System.out.println(cat1.toString());
        var cat2 = new Cat("Mikey",9,Color.GRAY,"domestic");
        System.out.println(cat2.NOC());
        System.out.println(cat2.toString());



    }


}