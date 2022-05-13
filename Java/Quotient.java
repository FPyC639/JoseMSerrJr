package exceptions;

public class Quotient {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter two Integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		try {
			System.out.println(number1+"/"+number2+ " is "+(number1 / number2));
		}
		catch (ArithmeticException ex) {
			System.out.println("Divisor cannot be zero");
		}
		finally {
			System.out.println("Thank you for running this program.");
		}
		System.out.println("To be continued");
	}
}
