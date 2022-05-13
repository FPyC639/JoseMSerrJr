package pack1;

import java.util.*;

public class PentagonalNumbers {

	public static void main(String[] args) {
		System.out.print("Please enter an integer to find a Pentagonal Number: ");
		Scanner input = new Scanner(System.in);
		GetPentangonalNumbers(input.nextInt());
	}
	public static void GetPentangonalNumbers(int a) {
		int pn = a* (3* a - 1) / 2;
		System.out.println("The Pentangonal Number for the entered Integer "+ a + " is " + pn);
	}
}
