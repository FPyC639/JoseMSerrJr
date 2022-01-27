package CatClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import HW1.Cat;
import HW1.Color;

public class Client {

    public static void main(String[] args) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        var cat1 = new Cat();
        cat1.setName("Miah");
        cat1.setAge(.5);
        cat1.setColor(Color.BLUE);
        cat1.setType("domestic");
        System.out.println(cat1.eat());
        System.out.println(cat1.play(""));
        cat1.dateofBirth_Processed(formatter.parse("17-Nov-2021"));
        System.out.println("The number of cats created is "+ cat1.NOC());
        System.out.println(cat1.toString());
        var cat2 = new Cat("Mikey",9,Color.BLUE,"domestic");
        System.out.println(cat2.eat());
        System.out.println(cat2.play("toy rat"));
        System.out.println("The number of cats created is " + cat2.NOC());
        System.out.println(cat2.toString());
        var cat3 = new Cat("Tom", 1, Color.LAVENDER, "feral");
        var cat4 = new Cat("Ingrid" , 2, Color.CINNAMON, "feral");
        Cat [] c1 = {cat1, cat2, cat3, cat4};
        for (int i= 0; i < c1.length; i++){
            System.out.println(c1[i].toString());
    }
    
}
}
