
public class productArray {

	public static void main(String[] args) {
		System.out.print("Please input a list of 10 integers each seperated by a space: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int [] in_arr = new int[10];
		for(int a = 0; a < in_arr.length;a++) {
			in_arr[a] = input.nextInt();
		}
		System.out.println(java.util.Arrays.toString(in_arr));
		int prod=1;
		for(int i: in_arr) prod += i*prod;
		System.out.println("The product of the elements in the array is the following: "+ prod);
	}
	
	
	
}
