package chapter18;

public class SumofDigits {

	public static void main(String[] args) {
		
		System.out.print("Please enter a digit: ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println("The sum of the digit place holders for that number is "+ dig(a));
		
	}
	
	public static int dig(int a) {
		if (a % 10 != 0) {
			return a  % 10 + dig((int) a/10);
	}
		else {
			return a;
		}
}
}
