package pack1;

import java.util.*;

public class TwoIntegersSumEvenOrOdd {

	public static void main(String[] args) {
		int[] array = new int[2];
		Scanner input = new Scanner(System.in);
		for (int count = 0; count<2; count++) {
			array[count] = input.nextInt();
		}
		decision(array[0], array[1]);
		decision(2,1);
		decision(2,2);
	}
	public static void decision(int a, int b) {
		System.out.println("The sum of integer " + a + " and integer "+ b + (((a+b)%2==0)? " is even": " is odd"));
	}
}
