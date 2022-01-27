/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Jose M. Serra Jr., CPS-2232, 04
* Homework  1, task 1, 2, 3, ....
* Program Description:
*************************************************************************/
package HW1;

import java.util.*;
import HW1.Color;

abstract class AbstractCat {
    String name;
    double age;
    Color color;
    String type;
    static int NumberofCats;

    public long dateofBirth(Date DOB) {
        Date date1 = new Date();
        return Math.abs(date1.getTime() - DOB.getTime());
    };

    public void dateofBirth_Processed(Date DOB) {
        long secondsInMilli = 1000L;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;
        long monthInMilli = daysInMilli * 30;
        long yearInMilli = monthInMilli * 12;
        long elapsedyear = dateofBirth(DOB) / yearInMilli;
        long difference = dateofBirth(DOB) % yearInMilli;
        long elapsedmonth = difference / monthInMilli;
        difference = difference % monthInMilli;
        long elapsedday = difference / daysInMilli;
        difference = difference % daysInMilli;
        System.out.printf("My age is %d years, %d months, %d days.\n", elapsedyear,elapsedmonth,elapsedday);

    }

}

public class Cat extends AbstractCat {

    private String name;
    private double age;
    private Color color;
    private String type;
    private static int NumberofCats;

    public Cat() {
        super();
        NumberofCats++;

    }

    public Cat(String name, int age, Color color, String type) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
        NumberofCats++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String eat() {
        return "Eats Gravy Swirlers!";
    }

    public String play(String toy) {
        if (toy == "") {
            return "I like to hide!";
        } else {
            return "I love to play with " + toy + "!!!";
        }

    }

    public int NOC() {
        return Cat.NumberofCats;
    }

    @Override
    public long dateofBirth(Date DOB) {
        return super.dateofBirth(DOB);
    }

    @Override
    public void dateofBirth_Processed(Date DOB) {
        super.dateofBirth_Processed(DOB);
    }

    public String toString() {
        return "Cat[ name: " + this.name + ", age: " + this.age + ", color: " + this.color + ", type: " + this.type
                + "]";
    }

}