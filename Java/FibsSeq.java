package chapter18;

import java.util.*;

public class Number2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(i);
		}
		arr.forEach(i-> System.out.println("For index "+ i+" the Fibs sequence is "+ Fibs(i)));

	}
	
	public static int Fibs(int index) {
		if (index == 0) {
			return 0;
		}
		else if(index == 1) {
			return 1;
		}
		else {
			return Fibs(index-1)+ Fibs(index-2);
		}
	}

}
