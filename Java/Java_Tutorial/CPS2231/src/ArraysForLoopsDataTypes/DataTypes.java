package ArraysForLoopsDataTypes;
import java.util.*;
public class DataTypes{

    public static void main(String[] args){
        //int a; //Implict Variable Declaration 
        //a = 2; //Assigning starts here
        //System.out.println("I declared an integer " + a);
        //int b = (int) 2.0; //Casting Method, with Explict Variable Declartion
        //System.out.println("I declared an integer via casting "+ b);
        //double c = Double.parseDouble("2.0");
        //System.out.println("I parsed a String into a double " + c);
        //boolean d = Boolean.parseBoolean("true");
        //System.out.println("I parsed a String into a boolean "+ d);
        // int, boolean, double, float, string
        //int [] arr = {1, 2, 3,4, 5,6}; // Explicting Array Initialization
        //System.out.println(Arrays.toString(arr));
        int [] arr1 = new int[8]; //Implicit Array Initialization
        //System.out.println(Arrays.toString(arr1));
        //arr1[0] = 1;
        //System.out.println(arr1[0]);
        //System.out.println(Arrays.toString(arr1));
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random()*((100 - 50)+1));
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(myMethod(arr1)));
    }

    public static int [] myMethod(int [] a){
        int temp = a[0]
        for (int i = 0; i < a.length; i++){
            if (a[i]< a[0] ){

            }
            else{
                temp = a[i];
            }
}
        return a;
    }

}