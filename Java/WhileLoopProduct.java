package pack1;

import java.util.Scanner;

public class WhileLoopProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers for input to get their product: ");
		int IntArray[]= new int[5];
		int counter = 0;
		while (counter < 5) {
			int a = input.nextInt();
			IntArray[counter] = a;
			if (counter == 4) {
				System.out.println("The product of the 5 numbers is "+ Product(IntArray));
			}
			counter++;
		}
	}
	public static int Product(int a[]) {
		int produce = a[0]*a[1]*a[2]*a[3]*a[4];
		return produce;
	}
}
