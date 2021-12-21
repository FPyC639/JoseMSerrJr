package chapter18;

public class Number3 {
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The greatest Common Denominator between " + a + " and " + b+ " is "+ GCD(a,b));
	}
	public static int GCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		else {
			return GCD(b,a % b);
		}
	}
}
