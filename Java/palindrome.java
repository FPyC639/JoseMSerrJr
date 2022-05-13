package Recursion;

import java.util.*;

public class palindrome {
	
	public static void main(String[] args) {
		System.out.print("Please enter a word to validate wheter it is a Palindrome or not: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.replaceAll("\\s", "");
		System.out.println(word);
		char [] newword = word.toCharArray();
		int low = 0;
		int high = Length(word)-1;
		System.out.println("You word " + word + " consists of " + Length(word)+" characters, this " + Panlidrome(newword,low, high) + " a palindrome.");
	}
	public static String Panlidrome(char word[], int low, int high) {
		if (high <= low) {
			return "Is";
		}
		else if (word[low] != word[high]) {
			return "Not";		
		}
		else {
			return Panlidrome(word,low+1,high-1);
		}
	}
	public static int Length(String word) {
		if (word.equals("")) {
			return 0;
		}
		else {
			return 1+ Length(word.substring(1));
		}
	}
}	

