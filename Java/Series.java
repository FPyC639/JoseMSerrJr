package chapter18;

public class Number4 {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		for (int i: arr) {
			System.out.println(series(i));
		}
	}
	
	public static float series(int index) {
		if (index == 1) {
			return 1/3f;
		}
		else {
			return (float) (index)/(2*index+1) + series(index-1);
		}
	}

}
