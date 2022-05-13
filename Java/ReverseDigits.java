package chapter18;


public class ReverseDigits {
	
	public static void main(String[] args) {
		
		System.out.print("Please enter an Integer: ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int val = sc.nextInt();
		sc.close();
		System.out.print("The Integer reversed digits is: ");
		reverseDisplay(val);
		
	}
	
	public static void reverseDisplay(int value) {
		String val = String.valueOf(value);
		String val_new = helperPalindrome(val.toCharArray(), 0, helperLength(val)-1);
		System.out.print(Integer.valueOf(val_new));
		
		
		
	}
	public static String helperPalindrome(char [] value, int low, int hi) {
		if(hi <= low){
			return String.valueOf(value);
		}
		else{
			char temp = value[low];
			char temp2 = value[hi];
			value[hi] = temp;
			value[low] = temp2;
			return helperPalindrome(value, low + 1, hi - 1 );
		}
		
		
	}
	public static int helperLength(String value) {
		if (value.equals("")){
			return 0;
		}
		else {
			return 1 + helperLength(value.substring(1));
		}
	}
}
